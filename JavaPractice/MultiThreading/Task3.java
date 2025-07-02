package MultiThreading;

    class RunnableDemo extends Thread {
    private String threadName;

    RunnableDemo(String name) {
        super(name);
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: "+ threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
}

public class Task3 {
    public static void main(String[] args) {
        RunnableDemo t1 = new RunnableDemo("Thread-1");
        t1.start();  // directly starts the thread

        RunnableDemo t2 = new RunnableDemo("Thread-2");
        t2.start();
    }
}

