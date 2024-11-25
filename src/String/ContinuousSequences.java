package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContinuousSequences {
    public static void printSequences(String input) {

//        String input = "1,2,3,5,9,a,6,7,8,4,@,-5,-7,-3,-2,-1";
        String[] splitInput = input.split(",");

        List<Integer> seq = new ArrayList<>();
        List<List<Integer>> seqs = new ArrayList<>();
        Integer previous = null;

            for(String values : splitInput){
                try {
                    Integer current = Integer.parseInt(values);
                    if(previous != null){
                        if((current - previous) == 1){
                            seq.add(current);
                        }else{
                            if(seq.size()>1){
                                seqs.add(seq);
                            }
                            seq = new ArrayList<>();
                            seq.add(current);
                        }
                        previous = current;
                    }else{
                        previous = current;
                        seq.add(current);
                    }


            }catch (NumberFormatException a){
                if(seq.size()>1){
                    seqs.add(seq);
                }

                previous = null;
                seq= new ArrayList<>();
            }
            }

        if(seq.size()>1){
            seqs.add(seq);
        }
        System.out.println(seqs);
    }
}
