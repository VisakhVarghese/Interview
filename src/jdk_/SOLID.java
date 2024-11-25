//package jdk;

/**
 *
 The SOLID principles are a set of five design principles that help software developers design more maintainable and understandable code.

 S - Single Responsibility Principle (SRP):

 *A class should have only one reason to change.
 * Example: Consider a UserService class that handles user management.
 * According to SRP, this class should focus solely on user-related operations such as creating users,
 * updating profiles, or deleting accounts.
 * It shouldn't be responsible for tasks like sending emails or logging activities, which should be handled by separate classes.
 */
// Example of SRP: Car class with single responsibility
/*public class SOLID { //- suppose a car class
    private String model;
    private int speed;

    // Methods related to managing car state and behavior
    public void accelerate() {
        // logic to increase speed
    }

    public void brake() {
        // logic to decrease speed
    }
}

// Example of violating SRP: Car class with multiple responsibilities
public class CAR {
    private String model;
    private int speed;

    // Methods handling unrelated tasks
    public void accelerate() {
        // logic to increase speed
    }

    public void brake() {
        // logic to decrease speed
    }

    public void navigateTo(String destination) {
        // logic for GPS navigation
    }

    public void controlClimate(int temperature) {
        // logic for climate control
    }
} */

/**
 * O - Open/Closed Principle (OCP):
 *
 * Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.
 * Example: Consider a Shape class hierarchy (e.g., Rectangle, Circle). Initially, you might have a calculateArea() method
 * in each shape class. To apply OCP, create an IShape interface with a calculateArea() method,
 * and refactor existing shapes to implement this interface. Now, when adding a new shape (Triangle),
 * you extend the interface and create a new implementation without modifying existing code.
 */

// Example of violating OCP: Shape class hierarchy without interfaces
//public class Shape {
//    // Methods for calculating area specific to each shape
//    public double calculateArea() {
//        return 0;
//    }
//}


// Applying OCP: Shape interface and concrete implementations
//public interface Shape {
//    double calculateArea();
//}
//
//public class Rectangle implements Shape {
//    private double width;
//    private double height;
//
//    @Override
//    public double calculateArea() {
//        return width * height;
//    }
//}
//
//public class Circle implements Shape {
//    private double radius;
//
//    @Override
//    public double calculateArea() {
//        return Math.PI * radius * radius;
//    }
//}
//
//// Adding new shape (Triangle) without modifying existing code
//public class Triangle implements Shape {
//    private double base;
//    private double height;
//
//    @Override
//    public double calculateArea() {
//        return 0.5 * base * height;
//    }
//}

// Shape interface
/*public interface Shape {
    double calculateArea();
}

// Rectangle class implementing Shape
public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
} */

// Circle class implementing Shape
/*public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Triangle class implementing Shape
public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class to demonstrate OCP
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(7);
        Shape triangle = new Triangle(4, 6);

        // Calculating areas
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
} */


/**
 *  L - Liskov Substitution Principle (LSP)
 *
 *  Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.
 *
 *  Example: If you have a Bird superclass and Duck subclass, LSP ensures that anywhere a Bird is expected,
 *  a Duck can be used without issues. This principle guarantees behavioral compatibility among subclasses and promotes polymorphism.
 */

// Example of LSP: Bird superclass and Duck subclass
// Bird superclass
/*public class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }

    public void eat() {
        System.out.println("Bird is eating");
    }
}

// Duck subclass extending Bird
public class Duck extends Bird {
    // Duck-specific behavior
    @Override
    public void fly() {
        System.out.println("Duck is flying"); // Ducks fly differently
    }
}

// Main class to demonstrate LSP
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Duck duck = new Duck();

        bird.fly(); // Outputs: Bird is flying
        bird.eat(); // Outputs: Bird is eating

        duck.fly(); // Outputs: Duck is flying (overrides Bird's fly method)
        duck.eat(); // Outputs: Bird is eating (inherited from Bird class)

        // LSP demonstration: Bird reference pointing to a Duck object
        Bird birdRef = new Duck();
        birdRef.fly(); // Outputs: Duck is flying (dynamic method dispatch)
        birdRef.eat(); // Outputs: Bird is eating (inherited from Bird class)
    }
}*/




/**
 *  I - Interface Segregation Principle (ISP):
 *
 *  Clients should not be forced to depend on interfaces they do not use.
 *
 *  Example: Imagine an Employee interface that includes methods like work() and getSalary().
 *  According to ISP, split this into smaller interfaces (Workable, Payable)
 *  so that classes can implement only what they need. For instance, a contractor might implement Payable but not Workable.
 */

// Example of violating ISP: One large interface
//public interface Employee {
//    void work();
//    double getSalary();
//}

// Applying ISP: Separate interfaces for specific roles
//public interface Workable {
//    void work();
//}
//
//public interface Payable {
//    double getSalary();
//}
//
//public class Contractor implements Payable {
//    @Override
//    public double getSalary() {
//        // logic to calculate salary for contractor
//        return 0.0;
//    }
//}


// Interface for workable behavior
/*public interface Workable {
    void work();
}

// Interface for payable behavior
public interface Payable {
    double getSalary();
}

// Class representing a Contractor implementing Payable
public class Contractor implements Payable {
    @Override
    public double getSalary() {
        // Logic to calculate salary for contractor
        return 1000.0; // Example: Returning a fixed salary for demonstration
    }
}

// Main class to demonstrate ISP
public class Main {
    public static void main(String[] args) {
        Contractor contractor = new Contractor();

        // Demonstrating Payable behavior
        System.out.println("Contractor's salary: $" + contractor.getSalary());

        // Since Contractor does not implement Workable, it cannot perform work
        // contractor.work(); // Uncommenting this line would cause a compilation error
    }
}*/




/**
 * D - Dependency Inversion Principle (DIP):
 *
 * High-level modules should not depend on low-level modules. Both should depend on abstractions (e.g., interfaces).
 *
 * Example: Consider a NotificationService that sends notifications. Instead of directly depending on specific
 * implementations (EmailSender, SMSSender), apply DIP by introducing an INotificationSender interface.
 * Classes like EmailSender and SMSSender implement this interface, allowing NotificationService to depend
 * on abstractions rather than concrete implementations.
 */

// Example of violating DIP: Direct dependency on concrete classes
/*public class NotificationService {
    private EmailSender emailSender;
    private SMSSender smsSender;

    public NotificationService() {
        this.emailSender = new EmailSender();
        this.smsSender = new SMSSender();
    }

    public void sendEmail(String recipient, String message) {
        emailSender.send(recipient, message);
    }

    public void sendSMS(String recipient, String message) {
        smsSender.send(recipient, message);
    }
}

 Applying DIP: Depending on abstractions (interfaces)
public interface NotificationSender {
    void send(String recipient, String message);
}

public class EmailSender implements NotificationSender { //concreate class
    @Override
    public void send(String recipient, String message) {
        // logic to send email
    }
}

public class SMSSender implements NotificationSender { //concreate class
    @Override
    public void send(String recipient, String message) {
        // logic to send SMS
    }
}

public class NotificationService {
    private NotificationSender sender;

    public NotificationService(NotificationSender sender) {
        this.sender = sender;
    }

    public void sendNotification(String recipient, String message) {
        sender.send(recipient, message);
    }
}


public class MainApplication {
    public static void main(String[] args) {
        // Decide whether to send email or SMS
        boolean sendEmail = true; // or based on some condition

        NotificationSender sender;
        if (sendEmail) {
            sender = new EmailSender();
        } else {
            sender = new SMSSender();
        }

        NotificationService notificationService = new NotificationService(sender);
        notificationService.sendNotification("recipient@example.com", "Hello!");
    }
} */


/**
 * Explanation:
 * Flexibility: By using interfaces (NotificationSender) and concrete implementations (EmailSender, SMSSender),
 * the NotificationService can send notifications without needing to know the specific implementation details
 * (whether it's sending an email or an SMS).
 *
 * Decision Logic: The decision of which implementation (EmailSender or SMSSender) to use is made at runtime
 * in the application logic (MainApplication in this case). This allows for flexibility and easy switching between
 * different notification methods without modifying the NotificationService class itself.
 *
 * Dependency Inversion: The NotificationService depends on abstractions (NotificationSender interface) rather
 * than concrete implementations (EmailSender, SMSSender). This promotes loosely coupled code and facilitates easier
 * testing and maintenance.
 *
 * This approach adheres to SOLID principles, particularly the Dependency Inversion Principle (DIP),
 * by decoupling higher-level modules (NotificationService) from lower-level details (specific notification sending mechanisms).
 */

/**
 * Concrete classes refer to classes that provide specific implementations for all their methods.
 * In object-oriented programming, a concrete class is one that can be instantiated and used directly to create objects. Here are some key points about concrete classes:
 *
 * Instantiation: Concrete classes can be directly instantiated to create objects.
 * They provide concrete implementations for all their methods, which means they define how those methods behave and what they do.
 *
 * Complete Implementation: Unlike abstract classes or interfaces,
 * concrete classes do not have any unimplemented methods (unless they inherit from abstract classes or interfaces themselves).
 *
 * Example: In the context of our earlier examples:
 *
 * EmailSender and SMSSender are concrete classes because they provide specific implementations
 * for the send method defined in the NotificationSender interface.
 *
 * When you create an instance of EmailSender (EmailSender sender = new EmailSender();),
 * you are creating an object of a concrete class that can perform specific actions (like sending an email).
 */


//public interface NotificationSender {
//    void send(String recipient, String message);
//}
//
//public class EmailSender implements NotificationSender {
//    @Override
//    public void send(String recipient, String message) {
//        // Concrete implementation to send an email
//        System.out.println("Sending email to " + recipient + ": " + message);
//    }
//}
//
//// Usage example
//public class Main {
//    public static void main(String[] args) {
//        // Using the concrete class EmailSender
//        NotificationSender sender = new EmailSender();
//        sender.send("recipient@example.com", "Hello!");
//    }
//}
