package jdk_.Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericT<T> {

    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

//    Generic Methods
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

//    Bounded Type Parameters
    public static <T extends Number> double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

//    Multiple Bounds

    /**
     * A type parameter can have multiple bounds.
     */
    public static <T extends Number & Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
//    Wildcards
    /**
     * Wildcards are used to specify unknown types.
     * They are represented by the ? symbol and can be used in various ways.
     */
//    Unbounded Wildcards
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

//    Upper Bounded Wildcards
    public static void printNumbers(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }

//    Lower Bounded Wildcards
    public static void addNumbers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }
    public static void main(String[] args) {
        GenericT<String> stringBox = new GenericT<>();
        stringBox.setContent("Hello, Generics!");
        System.out.println(stringBox.getContent());

        GenericT<Integer> integerBox = new GenericT<>();
        integerBox.setContent(123);
        System.out.println(integerBox.getContent());

        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C", "D"};

        printArray(intArray);
        printArray(strArray);

        System.out.println(sum(10, 20));          // Integers
        System.out.println(sum(10.5, 20.5));      // Doubles

        System.out.println(maximum(3, 4, 5));      // Integers
        System.out.println(maximum(6.6, 8.8, 7.7));// Doubles

        List<String> stringList = Arrays.asList("A", "B", "C");
        List<Integer> integerList = Arrays.asList(1, 2, 3);

        printList(stringList);
        printList(integerList);

        List<Integer> integerLists = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);

        printNumbers(integerLists);
        printNumbers(doubleList);

        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList);
        System.out.println(numberList);
    }
}

/**
 * Key Concepts of Generics
 * Type Parameters: These are placeholders for types. For example, in List<T>, T is a type parameter.
 * Generic Classes: Classes that use type parameters.
 * Generic Methods: Methods that use type parameters.
 * Bounded Type Parameters: Restrict the types that can be used as type arguments.
 */

/**
 * Generic Classes
 * A generic class is defined with a type parameter.
 * The type parameter can be any identifier, but it is common to use single letters like T, E, K, V, etc.
 */
