package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MinAddToParanthesisValid {
    public static void main(String[] args) {
        String expr = "{{{{}}";
        System.out.println(countMinReversals(expr));
    }

    static int countMinReversals(String str)
    {
        // Step 1: Initialize a stack of char type and ans as 0.
        Stack<Character> st = new Stack<Character>();
        int ans = 0;

        // Step 2: Run a loop for each character of the string
        for (int i = 0; i < str.length(); i++) {

            // Step 2.1: If ' { ' encountered push it to the
            // stack
            if (str.charAt(i) == '{')
                st.add(str.charAt(i));
                // Step 2.2: If ' } ' is encountered
            else {
                // Step 2.2.1: If stack has a '{' present for
                // '}' encountered, pop from the stack.
                if (!st.isEmpty())
                    st.pop();

                    // Step 2.2.2: If stack is empty, change '}' to
                    // '{' and push it to stack and increment ans by
                    // 1
                else {
                    st.add('{');
                    ans++;
                }
            }
        }
        // Step 3: if stack size is odd return -1.
        if (st.size() % 2 != 0)
            return -1;

        // Step 4: Increment ans by ( stackSize/2 ).
        ans += st.size() / 2;

        return ans;
    }
}




//        String input = "()))((";
//        Map<String, Integer> r = new HashMap<>();
//        char[] ch = input.toCharArray();
//        int left = 0;
//        int right = 0;
//        String[] str = input.split("");
//        System.out.println(Arrays.toString(str));

//        for (String c : str){
//            if(c.equals("(")){
////                r.put(c,r.getOrDefault(c,0)+1);
//                right++;
//            } else if (c.equals(")")) {
////                r.put(c,r.getOrDefault(c,0)+1);
//                left++;
//            }
//        }
//
//        System.out.println(Math.abs(right-left));
//    }
//}
