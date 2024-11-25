package MergeIntervels;

import java.util.*;

public class EmployeFreeTime {
    public static void main(String[] args) {
//        int[][] arr = {{1,2},{5,6},{1,3},{4,10}};
        // Create and initialize a 2D list
        List<List<Interval>> schedule1 = Arrays.asList(
                Arrays.asList(new Interval(1, 2), new Interval(5, 6)),
                Arrays.asList(new Interval(1, 3)),
                Arrays.asList(new Interval(4, 10))
        );
//        List<List<Interval>> schedule2 = Arrays.asList(
//                Arrays.asList(new Interval(1, 3), new Interval(6, 7)),
//                Arrays.asList(new Interval(2, 4)),
//                Arrays.asList(new Interval(2, 5), new Interval(9, 12))
//        );
//        System.out.println(schedule1.get(1));
        // Step 1: Flatten the schedule into a single list of intervals

        System.out.println(schedule1);

        List<Interval> allInter = new ArrayList<>();

        for(List<Interval> emp : schedule1){
            allInter.addAll(emp);
        }

        System.out.println(allInter);

        // Sort intervals by start time
//        Collections.sort(allInter, (a, b) -> Integer.compare(a.start, b.start));
//        Collections.sort(allInter, Comparator.comparingInt(a -> a.start));
        allInter.sort(Comparator.comparingInt(a -> a.start));


        System.out.println(allInter);

        List<Interval> result = new ArrayList<>();
        Interval prev = allInter.get(0);

        System.out.println(prev);

        // Iterate through the sorted intervals to find gaps
        for (int i = 1; i < allInter.size(); i++) {
            Interval curr = allInter.get(i);
            if (prev.end < curr.start) {
                // If there is a gap between the current interval and the previous one, add it to the result
                result.add(new Interval(prev.end, curr.start));
            }
            // Update prev to be the interval with the later end time
            if (curr.end > prev.end) {
                prev = curr;
            }
        }

        System.out.println(result);

    }

    static class Interval {
        int start;
        int end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "[" + start + ", " + end + "]";
        }
    }
}


