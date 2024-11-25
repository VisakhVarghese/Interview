//package jdk_.thread;
//
//import javafx.concurrent.Worker;
//
//import java.util.concurrent.atomic.AtomicBoolean;
//
//public class ConcurrencyExample {
//    public static void main(String[] args) {
//        SharedResource sharedResource = new SharedResource();
//        AtomicBoolean stopDaemon = new AtomicBoolean(false);
//
//        //Create regular threads
//        Thread thread1 = new Thread(new Workers(sharedResource), "Thread 1");
//        Thread thread2 = new Thread(new Workers(sharedResource), "Thread 2");
//
//        //create a deamon thread using runnable interface
//        Thread deamonThread = new Thread(new DaemonWorker(), "Daemon Thread");
//
//        // Set the daemon thread
//        deamonThread.setDaemon(true);
//
//        //start the threads
//        thread1.start();
//        thread2.start();
//        deamonThread.start();
//
//        // Wait for the regular threads to finish
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
//
//        // Signal the daemon thread to stop
////        stopDaemon.set(true);
//
//        // Optionally wait for the daemon thread to finish
////        try {
////            deamonThread.join();
////        } catch (InterruptedException e) {
////            Thread.currentThread().interrupt();
////        }
//
//        System.out.println("All threads have finished execution.");
//    }
//}
//
//class Workers implements Runnable {
//    private SharedResource resource;
//
//    public Workers(SharedResource resource) {
//        this.resource = resource;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            resource.increment(); // Calling non-synchronous method
//            resource.synchronizedIncrement(); // Calling synchronous method
//            try {
//                Thread.sleep(100); // Sleep to simulate some work
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//            }
//        }
//    }
//}
//
//class SharedResource {
//    private int counter = 0;
//
//    // Non-synchronous method
//    public void increment() {
//        counter++;
//        System.out.println(Thread.currentThread().getName() + " - Non-Synchronized Counter: " + counter);
//    }
//
//    // Synchronous method
//    public synchronized void synchronizedIncrement() {
//        counter++;
//        System.out.println(Thread.currentThread().getName() + " - Synchronized Counter: " + counter);
//    }
//}
//
//class DaemonWorker implements Runnable {
//
////    private final AtomicBoolean stopFlag;
////    public DaemonWorker(AtomicBoolean stopFlag) {
////        this.stopFlag = stopFlag;
////    }
//    @Override
//    public void run() {
//        while (true) {
//            System.out.println(Thread.currentThread().getName() + " is running in the background.");
//            try {
//                Thread.sleep(500); // Sleep to simulate some background work
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//            }
//        }
//    }
//}
//
///**
// * A daemon thread in Java is a type of thread that runs in the background and does not prevent
// * the JVM from exiting when all user (non-daemon) threads have finished their execution.
// * Daemon threads are typically used for tasks that are not critical to the application
// * and can be stopped when the application terminates.
// *
// * Key Characteristics of Daemon Threads:
// * Background Tasks: Daemon threads are generally used for background tasks such as garbage collection,
// * housekeeping, or other low-priority tasks.
// * Lifecycle: The JVM will terminate daemon threads automatically once all user threads have completed their execution.
// * Priority: Daemon threads are usually of lower priority compared to user threads.
// * Resource Management: Because daemon threads may be terminated abruptly,
// * they should not be used for tasks that require clean-up operations, such as closing files or releasing resources.
// */
