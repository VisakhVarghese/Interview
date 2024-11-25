package String;

import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = " Hello World VisakhVarghese";

        String[] strArr = str.trim().split(" ");

        System.out.println(strArr[strArr.length-1].length());
    }
}
