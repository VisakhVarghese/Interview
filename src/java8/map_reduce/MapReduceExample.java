package com.javatechie.lambda.demo.map_reduce;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class MapReduceExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);



        List<String> words = Arrays.asList("corejava", "spring", "hibernate");

        int sum = 0;
        for (int no : numbers) {
            sum = sum + no;
        }
        System.out.println(sum);

        int sum1 = numbers.stream().mapToInt(i -> i).sum();
        System.out.println(sum1);

        Integer reduceSum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduceSum);

        Optional<Integer> reduceSumWithMethodReference = numbers.stream().reduce(Integer::sum);
        System.out.println(reduceSumWithMethodReference.get());

        Integer mulResult = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(mulResult);

        Integer maxvalue = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(maxvalue);

        Integer maxvalueWithMethodReference = numbers.stream().reduce(Integer::max).get();
        System.out.println(maxvalueWithMethodReference);


        String longestString = words.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(longestString);

        //get employee whose grade A
        //get salary
        // method 1
        double avgSalary = EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();

//        method 2

        double avgSary = EmployeeDatabase.getEmployees().stream()
                        .collect(Collectors.averagingDouble(Employee::getSalary));

        System.out.println("Method 2 -> " + avgSary);


        System.out.println("Method 1 -> " + avgSalary);

        final List<String> salaryFilter = EmployeeDatabase.getEmployees().stream()
                .filter(emp -> emp.getSalary() > 80000)
                .map(Employee::getName).collect(Collectors.toList());

        for(String name : salaryFilter){
            System.out.println(name);
        }

        List<Employee> emp = EmployeeDatabase.getEmployees();

//        Collections.sort(emp);
//        for(Employee em : emp){
//            System.out.println(em.getSalary());
//        }

//        Collections.sort(emp, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return Integer.compare((int) o1.getSalary(), (int) o2.getSalary());
//            }
//        });

        Collections.sort(emp, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });

        for(Employee em : emp){
//            System.out.println(em.getName());
            System.out.println(em.toString());
        }

        double sumSalary = EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .sum();
        System.out.println(sumSalary);

        //get emp who has second highest salary

        try{
            Employee secondHighestSalary = EmployeeDatabase.getEmployees().stream()
                    .sorted(Comparator.comparing(Employee::getSalary)
                            .reversed())
                    .skip(1)
                    .findFirst()
                    .orElseThrow(()-> new Exception("Second highest salary is not found!"));
            System.out.println(secondHighestSalary);
            System.out.println(secondHighestSalary.getName());
        }catch (Exception e){
            e.printStackTrace();
        }


    }


}
