package jdk_.DesignPatterns.Creational;

public class Singleton {

    // Private static instance of the class
//    private static final Singleton instance = new Singleton();

    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton(){}

//    public static Singleton getInstance(){
//        return instance;
//    }

//    the singleton instance is created only when it is requested for the first time.

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }

    // Example method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        // Get the only object available
        Singleton singleInstance = Singleton.getInstance();
        Singleton singleInstance2 = Singleton.getInstance();

        // Show a message
        singleInstance.showMessage();
        singleInstance2.showMessage();

        if (singleInstance == singleInstance2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Different instances exist.");
        }
    }
}

/**
 * A singleton class in Java is a class that is designed to have only one instance throughout the application.
 * design pattern ensures that a class has only one instance and provides a global point of access to that instance.
 */

/**
 * Characteristics of Singleton Class:
 * Single Instance: Only one instance of the class is created.
 * Global Access: Provides a global point of access to the instance.
 * Controlled Instance Creation: The class itself controls the creation of its only instance.
 */

/**
 * 1. Creational Design Patterns
 * Creational patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.
 */
