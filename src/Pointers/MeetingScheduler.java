package Pointers;

import java.util.*;

/**
 *
 To determine the minimum number of meeting rooms needed to conduct all the meetings without any overlaps,
 we can use a two-pointer technique with sorting. The idea is to track the start and end times of meetings separately.
 By sorting these times and using two pointers to traverse them, we can determine the peak number of concurrent meetings.
 */
class MeetingScheduler {

    public static int minMeetingRooms(List<List<Integer>> meetingTimings) {
        if (meetingTimings == null || meetingTimings.isEmpty()) {
            return 0;
        }

        // Separate start and end times into different lists
        List<Integer> startTimes = new ArrayList<>();
        List<Integer> endTimes = new ArrayList<>();

        for (List<Integer> timing : meetingTimings) {
            startTimes.add(timing.get(0));
            endTimes.add(timing.get(1));
        }

        // Sort the start and end times
        Collections.sort(startTimes);
        Collections.sort(endTimes);

        System.out.println(startTimes);
        System.out.println(endTimes);

        int startPointer = 0;
        int endPointer = 0;
        int roomsRequired = 0;
        int maxRooms = 0;

        // Traverse through all the start times
        while (startPointer < startTimes.size()) {
            if (startTimes.get(startPointer) < endTimes.get(endPointer)) {
                roomsRequired++;
                startPointer++;
                maxRooms = Math.max(maxRooms, roomsRequired);
            } else {
                roomsRequired--;
                endPointer++;
            }

            // Debug print statements
            System.out.println("Start Pointer: " + startPointer + ", End Pointer: " + endPointer + ", Rooms Required: " + roomsRequired + ", Max Rooms: " + maxRooms);
        }

        return maxRooms;
    }

    public static void main(String[] args) {
        List<List<Integer>> meetingTimings = Arrays.asList(
                Arrays.asList(2, 8),
                Arrays.asList(3, 9),
                Arrays.asList(5, 11),
                Arrays.asList(11, 15),
                Arrays.asList(8, 20)
        );

        System.out.println("Minimum number of meeting rooms required: " + minMeetingRooms(meetingTimings));
    }
}

