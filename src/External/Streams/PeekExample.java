package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class PeekExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int i = 0;
        final Map<Integer, Integer> sqaredList = numbers.stream()
                .map(n -> n * n)
                .peek(System.out::println)
                .map(result -> Map.entry(1,result))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2)-> e1,
                        TreeMap::new
                ));

        System.out.println(sqaredList);


    }
}

