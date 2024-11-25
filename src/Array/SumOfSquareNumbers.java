package Array;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfSquareNumbers {
    public static void main(String[] args) {
        int input = 10;
        boolean result = findSumOfSquars(input);
        System.out.println(result);


//        System.out.println(hs);
    }

    private static boolean findSumOfSquars(int c) {
            HashSet<Integer> set = new HashSet<>();
            set.add(0);
            int limit = (int)Math.sqrt(c);
            System.out.println(limit);
            for(int i=0;i<=limit;i++) {
                System.out.println(set);
                set.add(i*i);
                if(set.contains(c-(i*i))) return true;
            }
            return false;

//        List<Integer> hs = new ArrayList<>();
//        for(int i=1; i<=input; i++ ){
//            hs.add(i*i);
//        }
//
//        System.out.println(hs);
//        for (int i=0; i<hs.size(); i++){
//            System.out.println(hs.size());
//            if(hs.get(i) <= input ){
//                if(!hs.contains(input)){
//                    int rem = Math.abs(hs.get(i)-input);
//                    System.out.println("remaining value : "+rem);
//                    if(hs.contains(rem)){
//                        System.out.println("rem1");
//                        return true;
//                    }
//                }else{
//                    return true;
//                }
//            }
//        }
//        return input == 0;
    }
}
