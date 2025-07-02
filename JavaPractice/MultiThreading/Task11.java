package MultiThreading;

         //interThreadCommunication
class SharedResource {
    private boolean ready = false;

    synchronized void produce() {
        try {
            while (ready) { // true so producer will wait
                wait(); 
            }
            System.out.println("Producing..."); // when its producer turn it will print this
            ready = true; //sets 
            notify();// give a wake up call to consume
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void consume() {
        try {
            while (!ready) { // if asle, it will wait and when its turn comes it will print this 
                wait();
            }
            System.out.println("Consuming...");
            ready = false; // since the previous produced is over, nothing left to be consumed
            notify(); // wake call to produce
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Task11 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(resource::produce);
        Thread consumer = new Thread(resource::consume);

        producer.start();
        consumer.start();
    }
}


