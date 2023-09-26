package concurrency;

import java.util.function.IntConsumer;

public class ZeroEvenOdd {

  private final int n;
  private boolean zeroPrinted;
  private int currentNumber;

  public ZeroEvenOdd(int n) {
    this.n = n;
    this.zeroPrinted = false;
    this.currentNumber = 1;
  }

  // printNumber.accept(x) outputs "x", where x is an integer.
  public void zero(IntConsumer printNumber) throws InterruptedException {

    while (currentNumber <= n) {
      synchronized (this) {
        while (zeroPrinted) {
          wait();
        }

        if (currentNumber <= n) {
          printNumber.accept(0);
        }
        zeroPrinted = true;
        notifyAll();

      }
    }
  }

  public void even(IntConsumer printNumber) throws InterruptedException {

    while (currentNumber <= n) {
      synchronized (this) {
        while (currentNumber % 2 == 1 || !zeroPrinted) {
          wait();
        }

        if (currentNumber <= n) {
          printNumber.accept(currentNumber);
        }
        zeroPrinted = false;
        currentNumber++;
        notifyAll();
      }
    }


  }

  public void odd(IntConsumer printNumber) throws InterruptedException {

    while (currentNumber <= n) {
      synchronized (this) {
        while (currentNumber % 2 == 0 || !zeroPrinted) {
          wait();
        }

        if (currentNumber <= n) {
          printNumber.accept(currentNumber);
        }
        zeroPrinted = false;
        currentNumber++;
        notifyAll();
      }
    }
  }
}