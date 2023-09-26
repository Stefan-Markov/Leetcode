package concurrency;

public class PrintInOrder {

  public PrintInOrder() {

  }

  int count = 0;

  public void first(Runnable printFirst) throws InterruptedException {
    synchronized (this) {
      this.count++;
      printFirst.run();
      notifyAll();
    }
  }

  public void second(Runnable printSecond) throws InterruptedException {
    synchronized (this) {
      while (this.count < 1) {
        wait();
      }
      this.count++;
      printSecond.run();
      notifyAll();
    }
  }

  public void third(Runnable printThird) throws InterruptedException {
    synchronized (this) {
      while (this.count < 2) {
        wait();
      }
      printThird.run();
      notifyAll();
    }
  }
}
