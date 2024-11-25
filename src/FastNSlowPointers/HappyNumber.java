package FastNSlowPointers;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HappyNumber {

    public static void main(String[] args) {

        int number = 100;

        boolean result = isHappy(number);

        System.out.println(result);
    }

    private static boolean isHappy(int number) {
        Set<Integer> value = new LinkedHashSet<>();
        while (number != 1 && !value.contains(number)){
            value.add(number);
            number = getNext(number);
        }
        System.out.println(value);
        return number == 1;
    }

    private static int getNext(int number) {
        int totalSum = 0;

        while (number > 0){
            int digit = number % 10; // will get each number of the value.
            totalSum += digit * digit;
//            System.out.println(totalSum);
            number = number / 10; // get next value
        }
//        System.out.println(totalSum);
        return totalSum;
    }

}
