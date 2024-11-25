package jdk_.thread;

/**Thread :
 *fundamental part of the language, allowing concurrent execution of two or more parts of a program
 *ie,  threads enable a program to perform multiple tasks simultaneously
 * thread - A thread is a lightweight sub-process, the smallest unit of processing
 * A thread has its own call stack but shares memory, files, and other resources with other threads in the same process
 * use cases
 * Performance Improvement - By dividing complex operations into smaller threads, the program can run more efficiently.
 * Better Resource Utilization - Threads can run while waiting for other resources to become available.
 * Simplified Modelling - Threads are useful in modeling real-world applications that involve multiple, simultaneous activities.
 */

/**
 * Creating a Thread
 * There are two primary ways to create a thread in Java:
 * Extending the Thread class
 * Implementing the Runnable interface
 */

/**
 * Life Cycle
 * New: The thread has been created but not yet started.
 * Runnable: The thread is ready to run but waiting for CPU time.
 * Running: The thread is executing.
 * Blocked/Waiting: The thread is blocked or waiting for a resource.
 * Terminated: The thread has completed its execution.
 */

/**
 * Common Methods
 * start(): Begins the execution of the thread.
 * run(): Contains the code to be executed. This method should be overridden.
 * sleep(long millis): Causes the thread to sleep for the specified number of milliseconds.
 * join(): Waits for the thread to die.
 * yield(): Causes the currently executing thread to temporarily pause and allow other threads to execute.
 * interrupt(): Interrupts the thread.
 */

/**
 *  Synchronization
 *  Why? : When multiple threads access shared resources, there can be data inconsistency issues
 *  Synchronization ensures that only one thread can access the resource at a time.
 */

/**
 * Inter-Thread Communication
 * achieved through methods like wait(), notify(), and notifyAll().
 */


/** public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("Thread is running......");

        for(int i=0 ; i<5; i++){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Thread is interrupted!");
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MyThread myThread_1 = new MyThread();
//        myThread.run();
        myThread_1.start();

        try{
            myThread_1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main Thread is finished....");
    }
}  **/

class MyThread3 extends Thread{
    Table t;
    MyThread3(Table t){
        this.t = t;
    }

    @Override
    public void run(){
        System.out.println("MyThread 3 is start executing......");
        t.printTable(5);
        System.out.println("MyThread 3 is end executing......");
    }
}

class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t = t;
    }

    @Override
    public void run(){
        System.out.println("MyThread 2 is start executing......");
        t.printTable(100);
        System.out.println("MyThread 2 is end executing......");
    }
}

public class MyThread{
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread2 myThread2 = new MyThread2(obj);
        MyThread3 myThread3 = new MyThread3(obj);

        myThread2.start();
        myThread3.start();
    }
}



class Table {
    // Synchronized Methods
    /**synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }**/

//    Synchronized Blocks

    /**
     * Synchronized blocks can be used to synchronize only the required part of the code instead of the whole method.
     */
    void printTable(int n){
        synchronized (this){
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }

        System.out.println("outside of the synchronized block...");
    }
}




