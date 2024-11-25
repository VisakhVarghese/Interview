package jdk_.Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Questions {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> result1 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        result1.forEach(System.out::println);

//        Given a list of strings, find the first string that has a length greater than 5.
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        Optional<String> result2 = words.stream().filter(s -> s.length() < 5).findFirst();
        //System.out.println(result2);

        result2.ifPresent(System.out::println);

        //1. Grouping and Counting
        //Given a list of names, group them by their starting letter and count how many names fall into each group

        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "David");

        Map<Character, Long> result3 = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0), Collectors.counting()));

        System.out.println(result3);

        Map<String, Long> resultt = names.stream()
                .collect(Collectors.toMap(
//                        n -> n, // key mapper
                        Function.identity(), // provides the value itself
                        c -> 1L, // value mapper
                        Long::sum, // merger function - a function to resolve collision - when the same key is mapped by diff elements.
                        //it takes two values fpr the same key, and return a single value
                        LinkedHashMap::new // Map supplier - provides a new empty Map into which results will be  inserted.
                ));

        System.out.println(resultt);

//        Given a list of integers, sort them in descending order and collect them into a new list.
        List<Integer> nums = Arrays.asList(5, 3, 8, 1, 2);

        List<Integer> result4 = nums.stream()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(result4);

//        2. Flat Mapping
        //Given a list of lists of integers, flatten the list and find the sum of all integers.

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> result5 = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(result5);

        int result6 = listOfLists.stream()
                .flatMap(List::stream)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(result6);

        //Implement a custom collector that concatenates strings with a delimiter and returns the result.
        List<String> wordss = Arrays.asList("Hello", "World", "Java");

        Collector<String, StringBuilder, String> customCollector = Collector.of(
                StringBuilder::new,  // Supplier
                StringBuilder::append, //// Accumulator
                StringBuilder::append, //Combiner
                StringBuilder::toString // Finisher
        );

        String result = wordss.stream().collect(customCollector);

        System.out.println(result);

        String result7  = wordss.stream().collect(Collectors.joining());
        System.out.println(result7);

        List<List<String>> listOfListss = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e", "f")
        );

        String result8 = listOfListss.stream()
                    .flatMap(Collection::stream).collect(Collectors.joining());

        System.out.println(result8);

        String result9 = wordss.stream()
                .reduce((s1, s2) -> s1+"-"+s2)
                .orElse("");

        System.out.println(result9);

        Stream.iterate(1, n-> n+1)
                .limit(100).forEach(System.out::println);

//        IntStream.rangeClosed(1,100).forEach(i -> System.out.print(i + " "));


        String str = "Java is a programming language";

        Map<String, Long> wordGroup = Arrays.stream(str.split("\\s"))
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

        System.out.println(wordGroup);

        String name = "visakh varghese";

        Map<Character, Long> r1 = name.chars()
                        .mapToObj(c -> (char) c)
                                .filter(e -> !Character.isWhitespace(e))
                                        .map(Character::toLowerCase)
                                                .collect(Collectors.groupingBy(
                                                        Function.identity(),
                                                        Collectors.counting()
                                                        ));

        System.out.println(r1);


        Map<Character, Long> charGroup = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !Character.isWhitespace(c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charGroup.forEach((k, v) ->{
            System.out.println("Key : "+ k + " Value : " + v);
        });

        Map<Character, Long> charGroup1 = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !Character.isWhitespace(c))
                .map(Character::toLowerCase)
                .collect(Collectors.toMap(
                        Function.identity(),
                        c -> 1L, // specifies the initial count value for each character
                        Long::sum, // used to combine counts if a character appears multiple times
                        LinkedHashMap::new
                ));

        System.out.println(charGroup1);






    }
}
