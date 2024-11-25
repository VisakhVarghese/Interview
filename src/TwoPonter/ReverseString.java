package TwoPonter;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString solution = new ReverseString();

        // Test Case 1
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s1);
        System.out.println(java.util.Arrays.toString(s1)); // Expected: ["o","l","l","e","h"]

        // Test Case 2
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        solution.reverseString(s2);
        System.out.println(java.util.Arrays.toString(s2));
    }

    private void reverseString(char[] s1) {

        int left = 0;
        int right = s1.length - 1;

        while (left < right){

            char temp = s1[left];
            s1[left] = s1[right];
            s1[right] = temp;

            left ++;
            right --;

        }
    }
}
