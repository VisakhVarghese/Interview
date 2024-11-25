package jdk_.Collection;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Use Case: PriorityQueue is useful when elements need to be processed based on priority,
 * such as in Dijkstra's algorithm and event simulation systems.
 *
 * Operations:
 *
 * Add: O(log n)
 * Remove: O(log n)
 * Peek: O(1)
 */

public class Custom_Priority_Queue {
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(5); // Add element
        pq.add(1);
        pq.add(3);

// Peek element
        int top = pq.peek();

        System.out.println(top);

// Remove element
        int removed = pq.poll();

        System.out.println(removed);

// Iterate over elements (order is not guaranteed)
        for (int num : pq) {
            System.out.println(num);
        }

// Size of PriorityQueue
        int size = pq.size();
    }
}
