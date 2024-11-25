package Practise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Interview {
    public static void main(String[] args) {

        int[] num = {1, 2, 4};

        String[] strs = new String[num.length];

        for (int i = 0; i < num.length; i++) {
            strs[i] = String.valueOf(num[i]);
        }

        Arrays.sort(strs, (a, b) -> (b + a).compareTo(a + b));

        System.out.println(Arrays.toString(strs));
    }
}
