package LinkedList;


import java.util.ArrayList;
import java.util.List;

class ListNodes {
    int val;
    ListNodes next;
    ListNodes(int x) {
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}

public class SampleLinkedList {
    public static void main(String[] args) {
        // Example linked list: 1 -> 2 -> 3 -> 4
        ListNodes head = new ListNodes(1);
        head.next = new ListNodes(2);
        head.next.next = new ListNodes(3);
        head.next.next.next = new ListNodes(4);

        // Get the first value in the linked list
        int firstValue = getFirstValue(head);
        System.out.println("The first value in the linked list is: " + firstValue);
    }

    public static int getFirstValue(ListNodes head) {
        if (head == null) {
            throw new IllegalArgumentException("The linked list is empty.");
        }

        List<Integer> values = new ArrayList<>();
        ListNodes current = head;
        while (current != null) {
            values.add(current.val);
            current = current.next;
            System.out.println(current);
        }
        System.out.println(values);
        return head.val;
    }
}

