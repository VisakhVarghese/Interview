package Array;

public class GasStation {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        int length = input.length;
        int gasAvailable = 0;
        int gasUsed = 0;
        int paid = 0;
        int startingPoint = 0;

        for(int i=0; i<length; i++){
            gasUsed += input[i];
            paid += cost[i];

            System.out.println(gasUsed +" "+paid);
            gasAvailable += input[i] - cost[i];

            System.out.println(" gas " + gasAvailable);

            if(gasAvailable < 0){
                gasAvailable = 0;
                startingPoint = i+1;
            }
        }

        System.out.println(paid > gasUsed ? -1 : startingPoint);
    }
}
