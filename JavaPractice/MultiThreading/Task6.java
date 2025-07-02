package MultiThreading;


class Counter {
    private int count = 0;

    public void increment() {
        // Synchronized block ensures only one thread modifies 'count' at a time
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

class ThreadDemo extends Thread {
    private final Counter counter;

    ThreadDemo(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
    }
}

public class Task6 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        ThreadDemo t1 = new ThreadDemo(counter);
        ThreadDemo t2 = new ThreadDemo(counter);

        t1.start();
        t2.start();

        try {
            t1.join(); // Wait for t1 to finish
            t2.join(); // Wait for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount()); // Expected: 20
    }
}


