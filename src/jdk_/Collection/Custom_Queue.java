package jdk_.Collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Use Case: Queue is useful for FIFO operations such as scheduling tasks, breadth-first search in graphs, and buffering.
 */
public class Custom_Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("First"); // Add element
        queue.add("Second");
        queue.add("Third");

// Peek element - get first element - head
        String front = queue.peek();

        System.out.println(front);

// Remove element - remove last element
        String removed = queue.poll();

        System.out.println(removed);

// Iterate over elements (not typical for queue)
        for (String item : queue) {
            System.out.println(item);
        }

// Size of Queue
        int size = queue.size();
    }
}
