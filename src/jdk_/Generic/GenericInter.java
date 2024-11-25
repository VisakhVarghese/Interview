package jdk_.Generic;

public class GenericInter<K, V> implements GenericInterface<K, V> {
    private K key;
    private V value;

    public GenericInter(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        GenericInterface<String, Integer> pair = new GenericInter<>("One", 1);
        System.out.println(pair.getKey() + ": " + pair.getValue());
    }

}

/**
 * Type Erasure
 * Generics in Java are implemented using a technique called type erasure.
 *
 * Generics in Java provide a powerful mechanism for writing reusable and type-safe code
 * By using type parameters, you can create classes, interfaces,
 * and methods that work with any data type while ensuring compile-time type checking
 */