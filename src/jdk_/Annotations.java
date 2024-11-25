package jdk_;

import java.io.IOException;
import java.util.*;

public class Annotations implements @NonNull List<@NonNull String> {
    public static void main(String[] args) {
        @NonNull String str = null;
        System.out.println(str);

        Annotations instance = new @NonNull Annotations();
        System.out.println(instance);

        Object object = "Hello";
        String strr = (@NonNull String) object;
        System.out.println(strr);

        List<@NonNull String> list = new ArrayList<>();
        list.add("Hello");
        System.out.println(list);

        @NonNull String[] array = new @NonNull String[10];
        array[0] = "Hello";
        System.out.println(array[0]);
    }

    public void readFile() throws @NonNull IOException {
        // Implementation here
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<@NonNull String> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(@NonNull String s) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends @NonNull String> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends @NonNull String> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public @NonNull String get(int index) {
        return null;
    }

    @Override
    public @NonNull String set(int index, @NonNull String element) {
        return null;
    }

    @Override
    public void add(int index, @NonNull String element) {

    }

    @Override
    public @NonNull String remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<@NonNull String> listIterator() {
        return null;
    }

    @Override
    public ListIterator<@NonNull String> listIterator(int index) {
        return null;
    }

    @Override
    public List<@NonNull String> subList(int fromIndex, int toIndex) {
        return null;
    }
}

/**
 * Java 8 introduced the ability to annotate types, which allows annotations to be placed anywhere a type is used,
 * rather than just on declarations
 * This enhancement supports stronger type checking and validation
 */

/**
 * Syntax and Usage
 * Type annotations can be used in many places, such as:
 *
 * Local Variables
 * Class Instance Creation
 * Type Casts
 * Implements Clauses
 * Throws Clauses
 * Generic Type Arguments
 * Array Types
 */
