package concurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

public class ZeroEvenOdd_Second {

  private final int n;
  private boolean zeroPrinted;
  private int currentNumber;
  private final Lock lock;
  private final Condition condition;

  public ZeroEvenOdd_Second(int n) {
    this.n = n;
    this.zeroPrinted = false;
    this.currentNumber = 1;
    lock = new ReentrantLock();
    condition = lock.newCondition();
  }

  // printNumber.accept(x) outputs "x", where x is an integer.
  public void zero(IntConsumer printNumber) throws InterruptedException {

    while (currentNumber <= n) {
      lock.lock();
      while (zeroPrinted) {
        condition.await();
      }

      // we are checking again as the while loop is outside synchronized block
      // so thread can get context switched
      if (currentNumber <= n) {
        printNumber.accept(0);
      }
      zeroPrinted = true;
      condition.signalAll();

      lock.unlock();
    }
  }

  public void even(IntConsumer printNumber) throws InterruptedException {

    while (currentNumber <= n) {
      lock.lock();
      while (currentNumber % 2 == 1 || !zeroPrinted) {
        condition.await();
      }

      if (currentNumber <= n) {
        printNumber.accept(currentNumber);
      }
      zeroPrinted = false;
      currentNumber++;
      condition.signalAll();
      lock.unlock();

    }


  }

  public void odd(IntConsumer printNumber) throws InterruptedException {

    while (currentNumber <= n) {
      lock.lock();
      while (currentNumber % 2 == 0 || !zeroPrinted) {
        condition.await();
      }

      if (currentNumber <= n) {
        printNumber.accept(currentNumber);
      }
      zeroPrinted = false;
      currentNumber++;
      condition.signalAll();

      lock.unlock();

    }
  }
}
