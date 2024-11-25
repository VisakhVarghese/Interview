import java.util.ArrayList;
import java.util.List;

public class NumberReversel {
    public static void main(String[] args) {
        int number = 42465;
        List<Integer> reverseNumber= reverseNumber(number);
        System.out.println(reverseNumber);
    }

    private static List<Integer> reverseNumber(int number) {

        int r = 0;
        int n = number;
        List<Integer> rev = new ArrayList<>();
        while(n > 0){
            r = n % 10;
            n = n / 10;
            rev.add(r);
        }
        return rev;
    }
}
