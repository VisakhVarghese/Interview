package String;

import java.util.HashMap;
import java.util.Map;

public class StringRepeationCount {
    public static void main(String[] args) {
        String str = "visakh varghese";
//        String[] strs = {"Visakh", "Sarin", "Aslam"};
        Map<Character,Integer> count = findStringCount(str);
        for(Map.Entry<Character,Integer> values : count.entrySet()){
            StringBuilder stringBuilder = new StringBuilder();
            if(values.getValue() == 1){
                stringBuilder.append("Key :").append(values.getKey()).append(", Value: ").append((values.getValue())).append("\n");
                System.out.println(stringBuilder);
            }
        }
//        System.out.println(count);
    }

    private static Map<Character, Integer> findStringCount(String str) {

        Map<Character,Integer> result = new HashMap<>();

        for(char ch : str.toCharArray()){
            System.out.println(ch);
            if(!Character.isWhitespace(ch)){
                result.put(ch, result.getOrDefault(ch,0)+1);
            }
        }

        for(char ch2 : str.toCharArray()){
            if(!Character.isWhitespace(ch2)) {
                if (result.get(ch2) == 1) {
                    System.out.println(ch2);
                }
            }
        }

        return result;
    }
}


