class SharedCounter{
    private int count = 0;
    private boolean turn = true; // flag to alternate between two threads

    // Called by Thread-1
    public synchronized void incrementByFirst() {
        while (!turn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented to: " + count);
        turn = false;
        notify();
    }

    // Called by Thread-2
    public synchronized void incrementBySecond() {
        while (turn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented to: " + count);
        turn = true;
        notify();
    }
}

public class AlternateIncrement{
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();
        int incrementsPerThread = 5;

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < incrementsPerThread; i++) {
                counter.incrementByFirst();
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < incrementsPerThread; i++) {
                counter.incrementBySecond();
            }
        }, "Thread-2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Final count: " + counter.count);
    }
}