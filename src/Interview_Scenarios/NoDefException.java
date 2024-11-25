package Interview_Scenarios;


/**
 * NoClassDefFoundError is an error (not an exception) that occurs when the Java Virtual Machine (JVM)
 * or a classloader tries to load a class that was present at compile time but is missing when the class is being loaded at runtime.
 */

class SomeClass {
    static {
        if (true) { // Simulate a failure
            throw new RuntimeException("Initialization failed");
        }
    }
}

public class NoDefException {
    public static void main(String[] args) {
        try {
            SomeClass obj = new SomeClass();
        } catch (Throwable e) {
            System.out.println("Caught Throwable: " + e.getMessage());
        }

        try {
            SomeClass anotherObj = new SomeClass(); // This will cause NoClassDefFoundError
        } catch (NoClassDefFoundError e) {
            System.out.println("Caught NoClassDefFoundError: " + e.getMessage());
        }
    }
}