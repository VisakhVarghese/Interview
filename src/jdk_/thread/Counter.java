package jdk_.thread;

public class Counter {
    private int count = 0;

    // Non-synchronized method
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

