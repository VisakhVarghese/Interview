package Array;

import java.util.*;
import java.util.stream.Collectors;

public class SortArrayByFrequency {
    public static void main(String[] args) {

//        int[] arr = {1,1,2,2,2,3};
        int[] arr = {2,3,1,3,2};
        List<Integer> list;

        Map<Integer, Integer> frequency = new HashMap<>();

        list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        for (int value : arr){
//            list.add(value);
            frequency.put(value, frequency.getOrDefault(value, 0)+1);
        }

        //method 1
//        Collections.sort(list, (a,b)->{
//            int freqA = frequency.get(a);
//            int freqB = frequency.get(b);
//
//            if(freqA != freqB){
//                return freqA - freqB;
//            }else{
//                return b - a;
//            }
//        });

        list.sort((a, b) -> {
            int freqA = frequency.get(a);
            int freqB = frequency.get(b);

            if (freqA != freqB) {
                return a - b ;
            } else {
                return b - a;
            }
        });

        for (int i=0; i<arr.length; i++){
            arr[i] = list.get(i);
        }

        System.out.println(Arrays.toString(arr));


//        System.out.println(frequency);

        //convert into list to sort the hash map
        List<Map.Entry<Integer, Integer>> lists = new ArrayList<>(frequency.entrySet());

        System.out.println(lists);

        for (Map.Entry<Integer, Integer> hash : lists){

        }

//        list.sort(Map.Entry.comparingByValue());

//        list.sort((e1, e2)-> {
//
//            if(e1 == e2){
//                return e2.getValue().compareTo(e1.getValue());
//            }else{
//                return e1.getValue().compareTo(e2.getValue());
//            }
//        });

        System.out.println(list);
    }
}
