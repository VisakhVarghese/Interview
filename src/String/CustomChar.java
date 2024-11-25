package String;

import java.util.ArrayList;
import java.util.List;

public class CustomChar {

    public static List<Integer> findingIndexOfNeedle(String str){

        String v = "ere";//"needle";
        List<Integer> indices= new ArrayList<>();

        int index = str.indexOf(v);
//        System.out.println(index);

        while (index >= 0){
            indices.add(index);
            index = str.indexOf(v, index+1);
//            System.out.println(str.substring(str.lastIndexOf(index)));
        }

        return indices;

//        char[] chr1 = str.toCharArray();
//        for(int i=0; i<=chr1.length -1; i++){
//
//            String value1 = String.valueOf(chr1[i]);
//            String value2 = String.valueOf(chr1[i+1]);
//
//           if(value1.equals("n")&&value2.equals("e")){
//               System.out.println("Index value : " +i);
//           }
//
//
//
//        }

    }

    public static void main(String[] args) {
        String needle = "Thereisaneedleinthis.Canyoufindtheneedlehere?";
//        Main obj1 = new Main();
        List<Integer> index = findingIndexOfNeedle(needle);
//        for (int value:
//             index) {
//            System.out.println(value);
//        }
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(index);
//        index.forEach(System.out::println);
        System.out.println(index);
    }
}