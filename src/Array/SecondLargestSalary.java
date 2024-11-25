package Array;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestSalary {
    public static void main(String[] args) {
        int[] salaries = {50000, 20000, 60000, 30000, 90000};

        int first_largest = 0;
        int second_largest = 0;

        for(int salary : salaries){
            if(salary > first_largest){
                second_largest = first_largest;
                first_largest = salary;
            }else if(salary > second_largest && salary != first_largest ){
                second_largest = salary;
            }
        }

        System.out.println( "first largest :" + first_largest);
        System.out.println( "second largest :" + second_largest);

        System.out.println(salaries[(salaries.length) - (salaries.length-1)]);
    }
}
