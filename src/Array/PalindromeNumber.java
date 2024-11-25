package Array;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 123;

        int temp = 0;

        while(number != 0){
            int rem = number % 10;
            temp = temp * 10 + rem;
            number = number/10;
        }

        if(temp == number){
            System.out.println("Number is palindrome : " + temp);
        }else{
            System.out.println("Not palindrome : "+ temp);
        }
    }
}
