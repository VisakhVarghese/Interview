package jdk_;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsClass {
    public static void main(String[] args) {
        List<String> collectedList = Stream.of("apple", "banana", "cherry")
                .collect(Collectors.toList());
        System.out.println(collectedList);

        Set<String> collectedSet = Stream.of("apple", "banana", "cherry", "apple")
                .collect(Collectors.toSet());
        System.out.println(collectedSet);

        Map<String, Integer> collectedMap = Stream.of("apple", "banana", "cherry")
                .collect(Collectors.toMap(
                        str -> str,
                        String::length
                ));
        System.out.println(collectedMap);

        String result = Stream.of("apple", "banana", "cherry")
                .collect(Collectors.joining(", "));
        System.out.println(result);

        Map<Integer, List<String>> groupedByLength = Stream.of("apple", "banana", "cherry")
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength);

        Map<Boolean, List<String>> partitionedByLength = Stream.of("apple", "banana", "cherry")
                .collect(Collectors.partitioningBy(s -> s.length() > 5));
        System.out.println(partitionedByLength);

        long count = Stream.of("apple", "banana", "cherry")
                .collect(Collectors.counting());
        System.out.println(count);

        IntSummaryStatistics stats = Stream.of("apple", "banana", "cherry")
                .collect(Collectors.summarizingInt(String::length));
        System.out.println(stats);

        Optional<String> concatenated = Stream.of("apple", "banana", "cherry")
                .collect(Collectors.reducing((s1, s2) -> s1 + ", " + s2));
        concatenated.ifPresent(System.out::println);



    }
}

/**
 * The Collectors class in Java provides a variety of static methods for creating Collector instances,
 * which are used to accumulate elements of a stream into a single result
 *ollectors can perform various operations, such as reducing, summarizing, grouping,
 * partitioning, and transforming data from a stream.
 */

/**
 * Commonly Used Collectors
 * Here are some of the most commonly used collectors in the Collectors class:
 * toList(): Collects elements into a List.
 * toSet(): Collects elements into a Set.
 * toMap(): Collects elements into a Map.
 * joining(): Concatenates elements into a String.
 * groupingBy(): Groups elements by a classifier function.
 * partitioningBy(): Partitions elements into two groups.
 * counting(): Counts the number of elements.
 * summarizingInt(), summarizingDouble(), summarizingLong(): Collects statistics, such as count, sum, min, average, and max.
 * reducing(): Performs a reduction on the elements.
 */
