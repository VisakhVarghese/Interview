package jdk_.Stream;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByKey;

public class CustomStream {
    public static void main(String[] args) {

            List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

            // Creating a stream from a List
            Stream<String> streamFromList = fruits.stream();
            streamFromList.forEach(System.out::println);

            int[] numbers = {1, 2, 3, 4, 5};

            // Creating a stream from an array
            IntStream streamFromArray = Arrays.stream(numbers);
            streamFromArray.forEach(System.out::println);

            // Generating an infinite stream of integers starting from 1
            Stream<Integer> infiniteStream = Stream.iterate(1, n -> n + 1);

            // Limiting the infinite stream to the first 5 elements
            infiniteStream.limit(5)
                    .forEach(System.out::println);


            IntSummaryStatistics stats = IntStream.of(1, 2, 3, 4, 5)
                    .summaryStatistics();


            System.out.println("Sum: " + stats.getSum()); // Outputs: Sum: 15
            System.out.println("Max: " + stats.getMax()); // Outputs: Max: 5
            System.out.println("Min: " + stats.getMin()); // Outputs: Min: 1
            System.out.println("Average: " + stats.getAverage()); // Outputs: Average: 3.0
            System.out.println("Count: " + stats.getCount()); // Outputs: Count: 5

    //        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

            // Filter fruits starting with 'a' and collect them into a new list
            List<String> filteredFruits = fruits.stream()
                    .filter(fruit -> fruit.startsWith("a"))
                    .collect(Collectors.toList());

            System.out.println("Filtered fruits starting with 'a': " + filteredFruits);

            List<Integer> number = Arrays.asList(1, 2, 3, 4, 5,6,7,8,8,9,0);

            // Mapping fruits to their lengths
            List<Integer> fruitLengths = fruits.stream()
                    .map(String::length)
                    .collect(Collectors.toList());

            System.out.println("Lengths of fruits: " + fruitLengths);

            // Calculate the sum of squares of even numbers
            int sumOfSquares = number.stream()
                    .filter(n -> n % 2 == 0)
                    .peek(num -> System.out.println("Filter number: " + num))
                    .map(n -> n * n)
                    .peek(num -> System.out.println("Mapped number: " + num))
                    .reduce(0, (i, a) -> i + a);
    //                .reduce(0, Integer::sum);

            System.out.println("Sum of squares of even numbers: " + sumOfSquares);

            // Reduce to calculate the sum of numbers without an initial value
            Optional<Integer> sumOptional = number.stream()
                    .reduce((a, b) -> a + b);

            // Using orElse to provide a default value in case the stream is empty
            int sum = sumOptional.orElse(0);

            System.out.println("Sum of numbers: " + sum);

            // Summing the numbers using collect
            int sumss = number.stream()
                    .collect(Collectors.summingInt(Integer::intValue));

            System.out.println("Sum of numbers: " + sumss);

            // Sorting fruits alphabetically
            List<String> sortedFruits = fruits.stream()
                    .sorted()
                    .collect(Collectors.toList());

            System.out.println("Sorted fruits: " + sortedFruits);


            // Collecting fruits into a List
            List<String> collectedFruits = fruits.stream()
                    .collect(Collectors.toList());

            System.out.println("Collected fruits: " + collectedFruits);


            // Reducing the stream to calculate sum of elements
            int summ = number.stream()
                    .reduce(0, (a, b) -> a + b);

            System.out.println("Sum of numbers: " + summ);

    //        Using Parallel Streams
            int[] nums = {1, 2, 3, 4, 5};

            // Calculate the sum of numbers using parallel stream
            int sums = Arrays.stream(nums)
                    .parallel()
                    .sum();

            System.out.println("Sum of numbers (parallel): " + sums);


            // Counting the number of elements in the stream
            long count = fruits.stream()
                    .count();
            System.out.println("Number of fruits: " + count);

            // Checking if all numbers are even
            boolean allEven = number.stream()
                    .allMatch(n -> n % 2 == 0);

            System.out.println("All numbers are even: " + allEven);

            // Checking if no fruit starts with 'z'
            boolean noneStartsWithZ = fruits.stream()
                    .noneMatch(fruit -> fruit.startsWith("z"));

            System.out.println("No fruit starts with 'z': " + noneStartsWithZ);

            List<List<Integer>> nestedList = Arrays.asList(
                    Arrays.asList(1, 2),
                    Arrays.asList(3, 4),
                    Arrays.asList(5, 6)
            );

            // Flattening the nested list into a single stream of integers
            List<Integer> flattenedList = nestedList.stream()
                    .flatMap(List::stream)
                    .collect(Collectors.toList());

            System.out.println("Flattened List: " + flattenedList);

            // Filtering out duplicate numbers and collecting unique ones
            List<Integer> uniqueNumbers = number.stream()
                    .distinct()
                    .collect(Collectors.toList());

            System.out.println("Unique Numbers: " + uniqueNumbers);


            // Creating a stream of integers from 1 to 10 and limiting to first 5
            Stream<Integer> limitedStream = Stream.iterate(1, n -> n + 1)
                    .limit(5);

            limitedStream.forEach(System.out::println);


            // Creating a stream of integers from 1 to 10 and skipping the first 5
    //        Stream<Integer> skippedStream = Stream.iterate(1, n -> n + 1)
    //                .skip(5);
    //
    //        skippedStream.forEach(System.out::println);

            Stream<Integer> numberr = Stream.of(1, 2, 3, 4, 5);
            // Intermediate operations (filtering and mapping)
            Stream<Integer> mappedStream = numberr.filter(n -> {
                        System.out.println("Filtering: " + n);
                        return n % 2 == 0;
                    })
                    .map(n -> {
                        System.out.println("Mapping: " + n);
                        return n * 2;
                    });

            // Terminal operation (collect) - only when it is needed.
            //These operations are not executed until a terminal operation (forEach() in this case) is called.
            mappedStream.forEach(System.out::println);


            String[] strInt = {"1", "2", "3", "4", "5", "6"};


            int[] even = Arrays.stream(strInt)
                    .mapToInt(Integer::parseInt)
                    .filter(n -> n % 2 == 0)
                    .toArray();

            List<Integer> evenn = Arrays.stream(strInt)
                    .mapToInt(Integer::parseInt)
                    .filter(n -> n % 2 == 0)
                    .boxed()
                    .collect(Collectors.toList());

            System.out.println(Arrays.toString(even));
            System.out.println(evenn);

            Stream<String> strings = Stream.of("apple", "ornage", "banana");

    //        strings.forEach(System.out::println);

            Stream<Character> characterStreams = strings.flatMap( strs -> strs.chars().mapToObj( c -> (char) c));

            int[][] twoDArray = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int[] arr = Arrays.stream(twoDArray)  // Stream<int[]>
                    .flatMapToInt(Arrays::stream)  // Flatten to IntStream
                    .toArray();   // Convert to int[]

            System.out.println(Arrays.toString(arr));


            String[][] twoDStrArray = {
                    {"apple", "banana", "cherry"},
                    {"date", "fig", "grape"},
                    {"honeydew", "kiwi", "lemon"}
            };

            String[] sttr = Arrays.stream(twoDStrArray)  // Stream<String[]>
                    .flatMap(Arrays::stream) // Flatten to Stream<String>
                    .toArray(String[]::new);  // Convert to String[]

            System.out.println(Arrays.toString(sttr));

            List<Employee> employeeList = new ArrayList<>();

            employeeList.add(new Employee(101, "Visakh", 24, "Male", "SE", 2022, 58000));
            employeeList.add(new Employee(102, "Nikhina", 20, "Female", "BA", 2023, 40000));
            employeeList.add(new Employee(103, "Aslam", 26, "Male", "FD", 2022, 57000));
            employeeList.add(new Employee(104, "Amal", 27, "Male", "AD", 2021, 27000));
            employeeList.add(new Employee(105, "Sarin", 27, "Male", "TSE", 2021, 25000));
            employeeList.add(new Employee(106, "Alok", 24, "Male", "DE", 2021, 62000));
            employeeList.add(new Employee(107, "Nikhina", 30, "Male", "SE", 2019, 68000));
            employeeList.add(new Employee(108, "Afsal", 28, "Male", "SE", 2020, 65000));
            employeeList.add(new Employee(109, "Silpa", 25, "Female", "TSE", 2021, 25000));
            employeeList.add(new Employee(110, "Blessy", 24, "Female", "DE", 2021, 72000));
            employeeList.add(new Employee(111, "Firoz", 27, "Male", "SE", 2020, 35000));
            employeeList.add(new Employee(112, "Adam", 26, "Male", "DS", 2021, 29000));
            employeeList.add(new Employee(1113, "Arjun", 29, "Male", "FD", 2018, 39000));

            employeeList.stream()
                    .filter(e -> e.getSalary() > 50000)
                    .forEach(System.out::println);

            System.out.print("\n");

            Optional<Employee> maxAge = employeeList.stream()
                            .max(Comparator.comparingInt(Employee::getAge));

            System.out.println(maxAge);

            employeeList.stream()
                    .filter(e -> e.getName().startsWith("A"))
                    .forEach(System.out::println);

            System.out.print("\n");


            employeeList.stream()
                    .filter( e -> e.getAge() > 20 && e.getAge() % 2 == 0)
                    .forEach(System.out::println);

            System.out.print("\n");

            employeeList.stream()
                    .sorted(Comparator.comparingInt(Employee::getAge))
                    .forEach(System.out::println);

            System.out.print("\n");

            Employee max = employeeList.stream()
                    .max(Comparator.comparingInt(Employee::getAge))
                    .orElseThrow(NullPointerException::new);

            System.out.println(max);

            System.out.print("\n");

            Employee min = employeeList.stream()
                    .min(Comparator.comparingInt(Employee::getAge))
                    .orElse(null);

            System.out.println(min);

            employeeList.stream()
                    .sorted(Comparator.comparing(Employee::getName))
                            .forEach(System.out::println);

            System.out.print("\n");

            employeeList.stream()
                    .filter(n -> String.valueOf(n.getYearOfJoining()).endsWith("1"))
                    .forEach(System.out::println);

            System.out.print("\n");


            Map<Integer, List<Employee>> result = employeeList.stream()
                    .collect(Collectors.groupingBy(
                            Employee::getYearOfJoining
                    ));

            System.out.println(result);

            System.out.print("\n");

            Map<Integer, List<Employee>> reverse = new TreeMap<>(Comparator.reverseOrder());

            reverse.putAll(result);


            System.out.println(reverse);

            System.out.print("\n");

            Collection<Employee> latestEmployee = employeeList.stream()
                    .collect(Collectors.groupingBy(
                            emp -> Arrays.asList(emp.getAge(), emp.getGender()),
                            Collectors.maxBy(Comparator.comparing(Employee::getYearOfJoining))
                    )).values().stream()
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .collect(Collectors.toList());

            System.out.println(latestEmployee);

            System.out.print("\n");

            List<StationRecord> records = Arrays.asList(
                    new StationRecord("BandA", "SN001", "Station1", "Location1", LocalDate.of(2023, 5, 10)),
                    new StationRecord("BandA", "SN001", "Station1", "Location1", LocalDate.of(2023, 6, 12)),
                    new StationRecord("BandA", "SN002", "Station2", "Location2", LocalDate.of(2023, 6, 8)),
                    new StationRecord("BandB", "SN001", "Station3", "Location3", LocalDate.of(2023, 6, 5)),
                    new StationRecord("BandB", "SN001", "Station3", "Location3", LocalDate.of(2023, 7, 15))
            );

            Map<String, Optional<StationRecord>> latest = records.stream()
                    .collect(Collectors.groupingBy(
                            s -> s.getBand() + " " + s.getSerialNumber(),
                            Collectors.maxBy(Comparator.comparing(StationRecord::getLocalDate))
                    ));

            System.out.println(latest);

            for(Map.Entry<String, Optional<StationRecord>> station : latest.entrySet()){
                    Optional<StationRecord> s = station.getValue();
            }

            System.out.print("\n");

            Map<String, StationRecord> latest_2 = records.stream()
                    .collect(Collectors.toMap(
                            s -> s.getBand() + " " + s.getSerialNumber(),
                            s -> s,
                            (r1, r2) -> r1.getLocalDate().isAfter(r2.getLocalDate()) ? r1 : r2
                    ));

            System.out.println(latest_2);

//            for(Map.Entry data: latest_2.entrySet()){
//                    StationRecord s = (StationRecord) data.getValue();
//                    System.out.println(s.getLocation());
//            }


            System.out.print("\n");

            Optional<Integer> secondMax = employeeList.stream()
                    .map(Employee::getSalary) //extract salaries
                    .distinct()  // remove duplicates
                    .sorted(Comparator.reverseOrder())
                    .skip(1)  // skip the first salary
                    .findFirst();

            System.out.println(secondMax);

            IntStream.range(1, 10).filter(n -> n % 2 == 0)
                    .forEach(System.out::println);
    }
}

/**
 * The Stream API in Java provides a powerful way to work with collections of objects.
 * t allows you to perform aggregate operations on data, such as filtering, mapping, sorting, and reducing elements.
 * You can create a stream from various sources like collections (List, Set, Map), arrays,
 *
 * Creation - generate streams of infinite elements using methods like
 * Stream.of(), Collection.stream(), or Stream.generate()
 *
 *
 *
 * Intermediate Operations:
 * filter(), map(), flatMap(), distinct(), sorted(), limit(), and skip().
 *
 *
 * Terminal Operations
 * forEach(), collect(), reduce(), count(), anyMatch(), allMatch(), and noneMatch().
 *
 *
 * Lazy Evaluation
 *
 * Parallel Streams
 * map, filter, and reduce.

 *
 * Optional:
 * Optional object, which helps to avoid NullPointerExceptions
 *
 */
