package multithreading;

class Counter implements Runnable {
  static int count = 1;
  // static Class<Counter> cl = Counter.class;

  @Override
  public void run() {

    while (count <= 10) {

      synchronized (this) {
        String tname = Thread.currentThread().getName();
        System.out.println(tname + count++);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
        }
        try {
          notify(); // cl.notify();
          wait(); // cl.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
}


public class EvenOddThread {
  public static void main(String[] args) throws InterruptedException {
    Counter c = new Counter();
    Thread t1 = new Thread(c, "Odd Thread: ");
    Thread t2 = new Thread(c, "Even Thread: ");
    t1.start();
    Thread.sleep(1000);
    t2.start();
  }
}
