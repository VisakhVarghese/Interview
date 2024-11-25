package jdk_.thread;

public class ImmutableThread {
    public static void main(String[] args) throws InterruptedException {

        final ImmutableEmployee initialState = new ImmutableEmployee("Visakh", 20);

        System.out.println("initialState Hash Code : " + initialState.hashCode());

        ImmutableEmployee obj1 = new ImmutableEmployee(initialState);
        ImmutableEmployee obj2 = new ImmutableEmployee(initialState);

        Runnable task1 = () ->{
            System.out.println(Thread.currentThread().getName() + " Initial State : " + obj1);

            // Modify the Employer's fileds
            obj1.setAge(28);

            System.out.println("obj1 Hash Code : " + obj1.hashCode());

        };

        Runnable task2 = () ->{
            System.out.println(Thread.currentThread().getName() + " Initial State : " + obj1);

            // Modify the Employer's fileds
            obj2.setAge(30);

            System.out.println("obj2 Hash Code : " + obj1.hashCode());
        };

        Thread thread1 = new Thread(task1, "Thread 1");
        Thread thread2 = new Thread(task2, "Thread 2");

        // Start the first thread
        thread1.start();
        // Wait for the first thread to finish before starting the second thread
        thread1.join();

        // Start the second thread
        thread2.start();
        // Wait for the second thread to finish
        thread2.join();


        // Verify that each copy has been modified independently
        System.out.println("Final Employer Details (Thread 1): " + obj1);
        System.out.println("Final Employer Details (Thread 2): " + obj2);
        System.out.println("Original Employer Details: " + initialState);
    }
}
