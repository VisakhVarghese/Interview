package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "Visakh Varghese";

//        System.out.println(str.trim());

        Map<Character, Integer> result = new LinkedHashMap<>();

        String[] strings = str.trim().toLowerCase().split(" ");

//        System.out.println(Arrays.toString(strings));
        StringBuilder stringBuffer = new StringBuilder();

        for(String s : strings) {
            stringBuffer.append(s);
        }
        System.out.println(stringBuffer);

//        System.out.println(stringBuffer.toString());

        for(char c : str.trim().toLowerCase().toCharArray()){
            if(c != ' '){
//                System.out.println(c);
                result.put(c,result.getOrDefault(c, 0)+1);
            }
        }

//        for(String s : strings){
//            System.out.println(s);
//            result.put(s,result.getOrDefault(s, 0)+1);
//        }

        System.out.println(result);

        for (char ch : str.toLowerCase().toCharArray()){
            if(ch != ' '){
                if(result.get(ch) == 1){
                    System.out.println(ch);
//                    break;
                    System.exit(0);
                }
            }
        }

//       for (Map.Entry<Character, Integer> entry : result.entrySet()){
//           if(entry.getValue() == 1){
//               System.out.println(entry.getKey());
//               break;
//           }
//       }
    }
}
