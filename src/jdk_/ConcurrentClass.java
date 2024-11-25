package jdk_;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.StampedLock;

public class ConcurrentClass {

    private final Lock lock = new ReentrantLock();
    private int count = 0;

    private final StampedLock lockk = new StampedLock();
    private double x, y;
    public static void main(String[] args) throws ExecutionException, InterruptedException  {
        //The Executors framework provides a higher-level replacement for working with threads directly by providing a pool of threads.
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable task = () -> {
            System.out.println("Executing task by: " + Thread.currentThread().getName());
        };

        executorService.submit(task);
        executorService.submit(task);

        executorService.shutdown();

//        The Fork/Join framework is designed for parallelism and is used for divide-and-conquer algorithms.
        ForkJoinPool pool = new ForkJoinPool();
        FibonacciTask task1 = new FibonacciTask(10);
        int result = pool.invoke(task1);
        System.out.println("Result: " + result);

//        Java provides thread-safe collections like ConcurrentHashMap, CopyOnWriteArrayList, and ConcurrentLinkedQueue.
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        map.forEach((key, value) -> System.out.println(key + ": " + value));

//        Atomic variables provide a way to update variables atomically without using synchronization.
        AtomicInteger atomicInteger = new AtomicInteger(0);

        int value = atomicInteger.incrementAndGet();
        System.out.println("Incremented Value: " + value);

        boolean updated = atomicInteger.compareAndSet(value, 10);
        System.out.println("Updated Value: " + atomicInteger.get() + " , " + updated);

//        The Lock interface and its implementations, like ReentrantLock, provide more extensive locking operations than synchronized.
        ConcurrentClass example = new ConcurrentClass();
        example.doWork();

//        CompletableFuture provides a way to write asynchronous, non-blocking code.
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> resultt = future.thenApplyAsync(str -> str + " World");

        System.out.println(resultt.get());

//        StampedLock is a special kind of lock providing both read and write access with versions.
        ConcurrentClass examplee = new ConcurrentClass();
        example.move(3, 4);
        double distance = examplee.distanceFromOrigin();
        System.out.println("Distance from origin: " + distance);

//        Phaser is a more flexible synchronization barrier than CountDownLatch and CyclicBarrier.
        Phaser phaser = new Phaser(1);

        for (int i = 0; i < 3; i++) {
            int phase = i;
            phaser.register();
            new Thread(() -> {
                System.out.println("Phase " + phase + " started");
                phaser.arriveAndAwaitAdvance();
                System.out.println("Phase " + phase + " completed");
            }).start();
        }

        phaser.arriveAndDeregister();
        System.out.println("Main thread deregistered");
    }

    public void move(double deltaX, double deltaY) {
        long stamp = lockk.writeLock();
        try {
            x += deltaX;
            y += deltaY;
        } finally {
            lockk.unlockWrite(stamp);
        }
    }

    public double distanceFromOrigin() {
        long stamp = lockk.tryOptimisticRead();
        double currentX = x, currentY = y;
        if (!lockk.validate(stamp)) {
            stamp = lockk.readLock();
            try {
                currentX = x;
                currentY = y;
            } finally {
                lockk.unlockRead(stamp);
            }
        }
        return Math.sqrt(currentX * currentX + currentY * currentY);
    }
    public void doWork() {
        lock.lock();
        try {
            count++;
            System.out.println("Count: " + count);
        } finally {
            lock.unlock();
        }
    }

    static class FibonacciTask extends RecursiveTask<Integer> {
        private final int n;

        FibonacciTask(int n) {
            this.n = n;
        }

        @Override
        protected Integer compute() {
            if (n <= 1) {
                return n;
            }
            FibonacciTask f1 = new FibonacciTask(n - 1);
            f1.fork();
            FibonacciTask f2 = new FibonacciTask(n - 2);
            return f2.compute() + f1.join();
        }
    }
}


/**
 * Java has seen various enhancements to its concurrency utilities over time,
 * particularly with the introduction of the java.util.concurrent package
 */
/**
 * Key Enhancements in Java Concurrency
 * Executors Framework
 * Fork/Join Framework
 * Concurrent Collections
 * Atomic Variables
 * Locks
 * CompletableFuture and Future
 * StampedLock
 * Phaser
 */

/**
 * Java's concurrency enhancements provide powerful tools for handling concurrent programming,
 * making it easier to write efficient, thread-safe, and maintainable code.
 * These utilities abstract much of the complexity associated with concurrency,
 * allowing developers to focus more on solving the actual problems at hand.
 */