package concurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintFooBar_ReentrantLock {

  private final int n;
  boolean printed;
  Lock lock = new ReentrantLock();
  Condition condition = lock.newCondition();

  public PrintFooBar_ReentrantLock(int n) {
    this.n = n;
    printed = false;
  }

  public void foo(Runnable printFoo) throws InterruptedException {

    for (int i = 0; i < n; i++) {

      // printFoo.run() outputs "foo". Do not change or remove this line.
      lock.lock();
      while (printed) {
        condition.await();
      }

      printFoo.run();
      printed = true;
      condition.signal();
      lock.unlock();

    }
  }

  public void bar(Runnable printBar) throws InterruptedException {

    for (int i = 0; i < n; i++) {

      // printBar.run() outputs "bar". Do not change or remove this line.
      lock.lock();
      while (!printed) {
        condition.await();
      }
      printBar.run();
      printed = false;
      condition.signal();
      lock.unlock();
    }
  }
}
