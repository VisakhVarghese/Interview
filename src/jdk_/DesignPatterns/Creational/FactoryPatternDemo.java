package jdk_.DesignPatterns.Creational;

// Client class to test the Factory pattern
public class FactoryPatternDemo {
    public static void main(String[] args) {
        // Get an object of Circle and call its draw method
        Shape shape1 = Factory.getShape("CIRCLE");
        shape1.draw();

        // Get an object of Rectangle and call its draw method
        Shape shape2 = Factory.getShape("RECTANGLE");
        shape2.draw();
    }
}
