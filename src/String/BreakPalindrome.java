package String;

public class BreakPalindrome {
    public static void main(String[] args) {
        String palindrome = "bbb";
        if (palindrome.length() <= 1){
            System.out.println(" ");
        }else {
            char[] ar = palindrome.toCharArray();
            System.out.println(ar.length);
            for(int i=0;i<ar.length/2;i++){
                if(ar[i] != 'a'){
                    ar[i] = 'a';
                }
            }
            ar[ar.length -1] = 'b';
            System.out.println(ar);
        }
    }
}
