package jdk_.thread;


//import sun.nio.ch.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Thread Pool
 * ** ExecutorService **
 * Java provides the ExecutorService framework
 * simplifies the process of managing a pool of worker threads.
 */
public class ThredPool {
    public static void main(String[] args) {
        // create a pool of 5 threads.
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i=0; i<5; i++){
            Runnable runnable = new WorkerThread(" " + i);
            executorService.execute(runnable);
        }

        executorService.shutdown();
        while(!executorService.isTerminated()){
        }

        System.out.println("Finished all threads...");
    }
}

class WorkerThread implements Runnable{
    private String message;

    public WorkerThread(String message){
        this.message = message;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) message = +" + message);
        processMessage();
        System.out.println(Thread.currentThread().getName() +" (End) ");
    }

    public void processMessage(){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
