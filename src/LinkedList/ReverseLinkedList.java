package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

//        1 -> 2 -> 3 -> 4 -> 5

        ListNode prev = null;
        ListNode current = head;

//        while (current != null) {
//            System.out.print(current.val + " ");
//            current = current.next;
//        }
//        System.out.println(); // for a new line after printing the list

        while (current != null) {
            ListNode next = current.next;
            System.out.println(next);// Store the next node
            current.next = prev;          // Reverse the current node's pointer
            System.out.println("Reverse :" + current.next);
            prev = current;              // Move prev to this node
            System.out.println(prev);
            current = next;              // Move to next node
            System.out.println(current);
        }

        System.out.println(prev);// prev will be the new head after the loop

        ListNode current1 = prev;

        while (current1 != null) {
            System.out.print(current1.val + " ");
            current1 = current1.next;
        }
        System.out.println();

    }
}

