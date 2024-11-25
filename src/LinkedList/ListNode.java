package LinkedList;

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) {
          this.val = val;
          this.next = null;
      }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "[" + val +"]";
    }
}

/**
 * A singly linked list is a data structure where each node has two components:
 * Value (val): Holds the data.
 * Next (next): A reference (or pointer) to the next node in the list.
 * 1 -> 2 -> 3 -> 4 -> 5
 *
 * Input: head points to the first node of this list.
 *
 *
 * Initialize Pointers:
 *
 * prev = null (this will eventually become the new head of the reversed list).
 * current = head (the node currently being processed).
 * next (temporary variable to hold the reference to the next node).
 *
 *
 *
 */


