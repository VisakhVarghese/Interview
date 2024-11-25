package String;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String str1 = normalize("Silent");
        String str2 = normalize("listen");


        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(str1);
        System.out.println(stringBuffer);
        stringBuffer.append("visakh");
        System.out.println(stringBuffer);

        if(str1.isEmpty() || str2.isEmpty()){
            return;
        }

        HashMap<Character, Integer> ang1 = checkAnagram(str1);
        HashMap<Character, Integer> ang2 = checkAnagram(str2);

        boolean r = ang1.equals(ang2);

        System.out.println(r);


    }

    private static String normalize(String str) {
        //        It is faster than StringBuffer because it is not synchronized.
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
            if (Character.isLetter(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    public static HashMap<Character, Integer> checkAnagram(String str){

        HashMap<Character, Integer> re = new HashMap<>();

        for(int i=0; i<str.length(); i++){
             char c = str.charAt(i);

             re.put(c, re.getOrDefault(c,0)+1);
        }

        return re;
    }
}

/**
 * Summary of Differences:
 * Immutability:
 *
 * String: Immutable
 * StringBuffer: Mutable
 * StringBuilder: Mutable
 * Thread Safety:
 *
 * String: Thread-safe (due to immutability)
 * StringBuffer: Thread-safe (methods are synchronized)
 * StringBuilder: Not thread-safe
 * Performance:
 *
 * String: Slower for many modifications due to immutability
 * StringBuffer: Slower than StringBuilder due to synchronization
 * StringBuilder: Fastest for many modifications in a single-threaded environment
 * Use Cases:
 *
 * String: When string content does not change frequently or when thread safety is not required.
 * StringBuffer: When string content changes frequently and thread safety is required.
 * StringBuilder: When string content changes frequently and thread safety is not a concern.
 */
