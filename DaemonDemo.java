
class DaemonDemo extends Thread {
  public void run() {
    if (Thread.currentThread().isDaemon())
      System.out.println("Daemon thread running...");
    else
      System.out.println("User thread running...");
  }

  public static void main(String[] args) {
    DaemonDemo t1 = new DaemonDemo();
    DaemonDemo t2 = new DaemonDemo();

    t2.setDaemon(true);

    t1.start();
    t2.start();
  }
}