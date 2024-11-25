package jdk_;

// Step 1: Define a superclass with variables, methods, and constructor
class Animal {
    String sound = "Animal sound";

    Animal() {
        System.out.println("Animal constructor");
    }

    Animal(String sound) {
        this.sound = sound;
        System.out.println("Animal sound changed");
    }

    public void makeSound() {
        System.out.println(sound);
    }
}

// Step 2: Create subclasses that override methods and use super keyword
class Dog extends Animal {
    String sound = "Bark";

    Dog() {
        super(); // Calling superclass constructor
        System.out.println("Dog constructor");
    }

    @Override
    public void makeSound() {
        System.out.println(sound); // Outputs "Bark"
        super.makeSound(); // Calling superclass method, outputs "Animal sound"
    }

    public void dogSpecificAction() {
        System.out.println("Dog-specific action");
    }
}

class Cat extends Animal {
    String sound = "Meow";

    Cat() {
        super("Animal cry"); // Calling superclass constructor
        System.out.println("Cat constructor");
        System.out.println(super.sound);
    }

    @Override
    public void makeSound() {
        System.out.println(sound); // Outputs "Meow"
        super.makeSound(); // Calling superclass method, outputs "Animal sound"
    }

    public void catSpecificAction() {
        System.out.println("Cat-specific action");
    }
}

// Step 3: Utilize polymorphism with a common superclass
public class Polymorphism {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Polymorphic behavior
        System.out.println(myDog.hashCode());
        Animal myCat = new Cat(); // Polymorphic behavior
        System.out.println(myCat.hashCode());

        myDog.makeSound(); // Outputs "Bark" and "Animal sound"
        myCat.makeSound(); // Outputs "Meow" and "Animal sound"

        // Accessing subclass-specific methods
        ((Dog) myDog).dogSpecificAction(); // Outputs "Dog-specific action"
        ((Cat) myCat).catSpecificAction(); // Outputs "Cat-specific action"
    }
}

