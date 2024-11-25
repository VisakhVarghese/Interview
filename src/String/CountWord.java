package String;

import java.util.HashMap;
import java.util.Map;

public class CountWord {
    public static void main(String[] args) {
        String value = "JAVA test Program java TEST PROGRAM pROGRAm";

        String[] str = value.toLowerCase().split(" ");

        Map<String, Integer> result = new HashMap<>();
        for(String ch : str){
            if(result.containsKey(ch)){
               result.put(ch, result.getOrDefault(ch,0)+1);
            }else {
                result.put(ch,1);
            }
        }
        System.out.println(result);
    }
}
