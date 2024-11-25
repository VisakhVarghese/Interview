package jdk_.thread;

public class InterThreadCommunication {
    public static void main(String[] args) {
        final Customer c = new Customer();

        new Thread(){
            @Override
            public void run(){
                c.withdraw(15000);
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                c.deposit(10000);
            }
        }.start();
    }
}

class Customer {
    int amount = 10000;

    synchronized void withdraw(int amount) {
        System.out.println("Going to withdraw...");
        while (this.amount < amount) {
            System.out.println("Less balance; waiting for deposit...");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        this.amount -= amount;
        System.out.println("Withdraw completed...");
    }

    synchronized void deposit(int amount) {
        System.out.println("Going to deposit...");
        this.amount += amount;
        System.out.println("Deposit completed...");
        notify();
    }
}
