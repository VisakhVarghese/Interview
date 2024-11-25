package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Visakh Varghese";

        char[] ch = str.toCharArray();

        List<Character> reverseString = new ArrayList<>();

        for(int i=0; i<ch.length; i++){
           reverseString.add(ch[ch.length-i-1]);
        }

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(str);

        byte[] btArr = str.getBytes();

        System.out.println(Arrays.toString(btArr));

        byte[] result = new byte[btArr.length];

        for(int i=0; i<btArr.length; i++){
            result[i] = btArr[btArr.length-i-1];
        }

        System.out.println(new String(result));

        System.out.println(stringBuilder.reverse());

        System.out.println(reverseString);
    }
}
