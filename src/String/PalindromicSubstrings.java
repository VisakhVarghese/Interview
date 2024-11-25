package String;

import java.util.HashSet;
import java.util.Set;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        String s = "aaa";

//        int minLength = 2;

        int count = 0;

//        Set<String> removeDuplicate = new HashSet<>();

        for(int i=0; i<=s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
//                System.out.println(s.charAt(i) +" "+s.charAt(j));

                String subString = s.substring(i,j);
                System.out.println(subString);

                if(isPalindrome(subString)){
                    count++;
//                    removeDuplicate.add(subString);
                }
            }
        }

        System.out.println(count);
//        System.out.println(removeDuplicate.size());
    }

    private static boolean isPalindrome(String subString) {
        int left = 0 ;
        int right = subString.length() - 1;

//        if(subString.length() == 1){
//            return true;
//        }

        while ((left < right)){
            if(subString.charAt(left) != subString.charAt(right)){
//                System.out.println("substring :"+ subString);
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
