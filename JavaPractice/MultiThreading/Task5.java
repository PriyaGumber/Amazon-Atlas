package MultiThreading;

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class ThreadDemo extends Thread {
    private Counter counter;
    public ThreadDemo(Counter c) { counter = c; }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
    }
}

public class Task5 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        ThreadDemo t1 = new ThreadDemo(counter);
        ThreadDemo t2 = new ThreadDemo(counter);
        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println("Final count: " + counter.getCount());  // Always 20
    }
}

