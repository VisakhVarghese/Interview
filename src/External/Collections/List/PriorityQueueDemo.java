package Collections.List;

import java.util.*;

class The_Comparator implements Comparator<Integer> {
//    public int compare(String str1, String str2)
//    {
//        String first_Str;
//        String second_Str;
//        first_Str = str1;
//        second_Str = str2;
//        return second_Str.compareTo(first_Str);
//    }

    @Override
    public int compare(Integer o1, Integer o2) {
        int first_Str;
        int second_Str;
        first_Str = o1;
        second_Str = o1;
        return o1 - o2;
    }
}


public class PriorityQueueDemo {
    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

//        PriorityQueue<Integer> pq =
//                new PriorityQueue<>(new The_Comparator());
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(comparator);
//        Deque<Integer> pq =
//                new LinkedList<>();
//        Deque<Integer> pq =
//                new ArrayDeque<>();
        pq.add(6);
        pq.add(1);
        pq.add(3);
        pq.add(4);
        pq.add(8);
        pq.add(9);
        pq.add(2);

        // Creating a comparator
        Comparator comp = pq.comparator();

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        // Displaying the comparator values
        System.out.println("Since the Comparator value is: " + comp);

        System.out.println("The elements with the highest priority element at front of queue"
                + "order:");
        while(!pq.isEmpty()){
            System.out.print(" "+pq.poll());
        }
    }
}
