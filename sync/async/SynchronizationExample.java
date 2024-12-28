package sync.async;
// class SharedResource {
//     synchronized void display(String message) {
//         System.out.print("[");
//         try {
//             Thread.sleep(5000);
//         } catch (InterruptedException e) {}
//         System.out.println(message + "]");
//     }
// }

// class MyThread extends Thread {
//     SharedResource resource;
//     String message;

//     MyThread(SharedResource resource, String message) {
//         this.resource = resource;
//         this.message = message;
//     }

//     public void run() {
//         resource.display(message);
//     }
// }


//inter thread communication 
class SharedResource {
    private boolean available = false;

    synchronized void produce() {
        while (available) {
            try {
                wait(); // Wait if resource is available
            } catch (InterruptedException e) {}
        }
        System.out.println("Produced");
        available = true;
        notify(); // Notify waiting threads
    }

    synchronized void consume() {
        while (!available) {
            try {
                wait(); // Wait if resource is not available
            } catch (InterruptedException e) {}
        }
        System.out.println("Consumed");
        available = false;
        notify();
    }
}

class Producer extends Thread {
    SharedResource resource;

    Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.produce();
        }
    }
}

class Consumer extends Thread {
    SharedResource resource;

    Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.consume();
        }
    }
}


public class SynchronizationExample {
    public static void main(String[] args) {
        // SharedResource resource = new SharedResource();
        // MyThread t1 = new MyThread(resource, "Hello");
        // MyThread t2 = new MyThread(resource, "World");
        // t1.start();
        // t2.start();

        SharedResource resource = new SharedResource();
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        producer.start();
        consumer.start();
    }
}

