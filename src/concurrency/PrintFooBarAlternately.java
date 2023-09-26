package concurrency;

public class PrintFooBarAlternately {

  private final int n;
  boolean printed;

  public PrintFooBarAlternately(int n) {
    this.n = n;
    printed = false;
  }

  public void foo(Runnable printFoo) throws InterruptedException {

    for (int i = 0; i < n; i++) {

      // printFoo.run() outputs "foo". Do not change or remove this line.
      synchronized (this) {
        while (printed) {
          wait();
        }

        printFoo.run();
        printed = true;
        notifyAll();
      }

    }
  }

  public void bar(Runnable printBar) throws InterruptedException {

    for (int i = 0; i < n; i++) {

      // printBar.run() outputs "bar". Do not change or remove this line.
      synchronized (this) {
        while (!printed) {
          wait();
        }
        printBar.run();
        printed = false;
        notifyAll();
      }
    }
  }
}
