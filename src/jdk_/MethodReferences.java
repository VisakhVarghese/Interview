package jdk_;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferences {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using a static method reference
        names.forEach(System.out::println);

//        Note : System.out::println is a method reference to the static method println of the System.out object.


        MethodReferences example = new MethodReferences();

        // Using an instance method reference of a particular object
        names.forEach(example::printName);

        // Using an instance method reference of an arbitrary object
        names.sort(String::compareToIgnoreCase);

        names.forEach(System.out::println);

        Supplier<MethodReferences> supplier = MethodReferences::new;

        MethodReferences examplee = supplier.get();
        examplee.printMessage();
    }

    public void printName(String name) {
        System.out.println(name);
    }

    public MethodReferences() {
        System.out.println("Constructor called");
    }

    public void printMessage() {
        System.out.println("Hello from MethodReferenceExample");
    }


}

/**
 * Method references
 * Java provide a way to refer to methods without invoking them
 * They are a shorthand for lambda expressions that execute a single method.
 * Method references to allow you to call a method by referring to it with its name directly.
 */

/**
 * Reference to a static method
 * ContainingClass::staticMethodName
 *
 * Reference to an instance method of a particular object
 * containingObject::instanceMethodName
 *
 * Reference to an instance method of an arbitrary object of a particular type
 * ContainingType::methodName
 *
 * Reference to a constructor
 * ClassName::new
 */


/**
 * Static Methods: ClassName::staticMethodName
 * Instance Methods of a Particular Object: object::instanceMethodName
 * Instance Methods of an Arbitrary Object: ClassName::instanceMethodName
 * Constructors: ClassName::new
 */
