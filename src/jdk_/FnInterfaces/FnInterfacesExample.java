package jdk_.FnInterfaces;

import java.util.Iterator;
import java.util.function.*;

public class FnInterfacesExample {

    public static void main(String[] args) {


//        Predicate<T> - boolean
        Predicate<Integer> predicate = n -> n % 2 == 0;
        System.out.println(predicate.test(4));
        System.out.println(predicate.test(7));
//        System.out.println(predicate2.equals("Visakh"));

//        BiFunction<T,U,R>
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> multiplay = (a, b) -> a * b;
        BiFunction<Integer, Integer, String> castString = (a, b) -> String.valueOf(a * b);
        System.out.println(add.apply(3,5));
        System.out.println(multiplay.apply(3,5));
        System.out.println(castString.apply(5,5));

        Supplier<Integer> supplier1 = () -> 5;
        System.out.println(supplier1.get());

//        Represents an operation on a single operand that produces
//        a result of the same type as its operand. It is a specialization of Function.
        UnaryOperator<Integer> unaryOperator1= x -> x*x;
        System.out.println(unaryOperator1.apply(5));

//        Function<T,R> - boolean
        Function<String, Integer> function1 = (str) -> str.length();
        System.out.println(function1.apply("hello"));

//        BiPredicate<T,U> - boolean
        BiPredicate<String, Integer> biPredicate1 = (str, len) -> str.length() == len;
        System.out.println(biPredicate1.test("hello", 5));

//        Represents an operation upon two operands of the same type - It is a specialization of BiFunction.
//        producing a result of the same type as the operands.
        BinaryOperator<Integer> binaryOperator1 = (a, b) -> a * b;
        System.out.println(binaryOperator1.apply(3,5));

    }
}

//1. Unbounded Wildcard (?)
/**
 * An unbounded wildcard (?) represents an unknown type.
 * It's useful when you want to work with a collection or method parameter that can handle objects of any type.
 */

//Upper Bounded Wildcard (? extends T)
/**
 * An upper bounded wildcard (? extends T) restricts the unknown type to be a subtype of T (including T itself).
 * It's useful when you want to read from a collection but don't care about the specific subclass.
 */

//Lower Bounded Wildcard (? super T)
/**
 * A lower bounded wildcard (? super T) restricts the unknown type to be a supertype of T (including T itself).
 * It's useful when you want to write into a collection that can accept objects of a specific type and its superclasses.
 */
