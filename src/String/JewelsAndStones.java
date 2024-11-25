package String;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public static void main(String[] args) {
        JewelsAndStones solution = new JewelsAndStones();

        // Test Case 1
        String jewels1 = "aA";
        String stones1 = "aAAbbbb";
        System.out.println("Test Case 1: " + solution.numJewelsInStones(jewels1, stones1)); // Expected: 3

        // Test Case 2
        String jewels2 = "z";
        String stones2 = "ZZ";
        System.out.println("Test Case 2: " + solution.numJewelsInStones(jewels2, stones2));
    }

    private int numJewelsInStones(String jewels, String stones) {

        Set<Character> values = new HashSet<>();

        for(char stone : stones.toCharArray()){
            values.add(stone);
        }

        System.out.println(values);
        int count = 0;

        for(char jowel : jewels.toCharArray()){
            if(values.contains(jowel)){
                count++;
            }
        }

        return count;
    }
}
