package jdk_;

import java.util.ArrayList;
import java.util.List;

public class Wildcard{

    // Method using unbounded wildcard
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.println(elem);
        }
    }

    // Method using upper bounded wildcard
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    // Method using lower bounded wildcard
    public static void addNumbers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);


        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);

        System.out.println("Integer List:");
        printList(integerList);

        System.out.println("Sum of Double List: " + sumOfList(doubleList));

        List<Number> numberList = new ArrayList<>();
        addNumbers(numberList);
        System.out.println("Number List after adding numbers:");
        printList(numberList);
    }
}
