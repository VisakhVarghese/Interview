import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] numbers = new int[]{0,1,2, 3, 5, 7, 11, 13, 17};
        Set<Integer> primeNumbers = new TreeSet<>();
        for(int number : numbers){
            boolean isPrime = true;
            if(number <= 1){
              isPrime = false;
            }

            for(int i=2; i<number/2; i++){
                System.out.println(Math.sqrt(number));
                if(number % i ==0){
                    isPrime = false;
                }
            }

            if(isPrime){
                primeNumbers.add(number);
            }

        }
        System.out.println(primeNumbers);
    }
}
