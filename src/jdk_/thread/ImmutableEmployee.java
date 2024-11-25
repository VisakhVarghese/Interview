package jdk_.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ImmutableEmployee {

    private volatile String name;
    private int age;

    private final AtomicInteger atomicInteger = new AtomicInteger(); // which offer thread-safe operations on single variables without using synchronization.

    public ImmutableEmployee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ImmutableEmployee(ImmutableEmployee immutableEmployee) {
        this.name = immutableEmployee.name;
        this.age = immutableEmployee.age;
    }

    public void increment() {
        atomicInteger.incrementAndGet(); // Atomically increments by 1
    }

    public void decrement() {
        atomicInteger.decrementAndGet(); // Atomically decrements by 1
    }

    public int getCount() {
        return atomicInteger.get(); // Retrieves the current value
    }


    public synchronized String getName() {
        return name;
    }

    public synchronized int getAge() {
        return age;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ImmutableEmployee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
