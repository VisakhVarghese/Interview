package Array;

import java.util.Arrays;
import java.util.Comparator;

//How do the sort() method of Collections class work
//Internally the Sort method does call Compare method of the classes it is sorting.
//        To compare two elements, it asks “Which is greater?” Compare method returns -1, 0,
//        or 1 to say if it is less than, equal, or greater to the other. It uses this result to
//        then determine if they should be swapped for their sort.



public class CreateLargestNumber {
    public static void main(String[] args) {
        int[] arr = {5,23,90};
        String result = createLargestNumber(arr);
        System.out.println(result);
    }

    private static String createLargestNumber(int[] arr) {
        String[] strArr = new String[arr.length];

        for(int i=0; i<arr.length; i++){
            strArr[i] = String.valueOf(arr[i]);
        }

        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println(o1 + " " + o2);
                String order1 = o1+o2;
                String order2 = o2+o1;
                System.out.println(order1 + " " + order2);
                System.out.println(order1.compareTo(order2));
                // compareTo - used to compare string based on the Unicode value of each character in the strings
                //compareTo() method compares the given string with the current string lexicographically
                return order2.compareTo(order1);
            }
        });

//        System.out.println(Arrays.toString(strArr));
        StringBuilder stringBuilder = new StringBuilder();

        for(String s : strArr){
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}