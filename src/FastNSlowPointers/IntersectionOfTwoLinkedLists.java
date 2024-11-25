package FastNSlowPointers;

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {

        IntersectionOfTwoLinkedLists list = new IntersectionOfTwoLinkedLists();

        Node head1, head2;

        /*
                Create two linked lists

                1st 3->6->9->15->30
                2nd 10->15->30

                15 is the intersection point
        */

        head1 = new Node(10);
        head2 = new Node(3);

        Node newNode = new Node(6);
        head2.next = newNode;

        newNode = new Node(9);
        head2.next.next = newNode;

        newNode = new Node(15);
        head1.next = newNode;
        head2.next.next.next = newNode;

        newNode = new Node(30);
        head1.next.next = newNode;

        head1.next.next.next = null;

        Node intersectionPoint
                = list.getIntersectionNode(head1, head2);

        if (intersectionPoint == null) {
            System.out.print(" No Intersection Point \n");
        }
        else {
            System.out.print("Intersection Point: "
                    + intersectionPoint.data);
        }

    }

    private Node getIntersectionNode(Node head1, Node head2) {
//        1st 3->6->9->15->30
//        2nd 10->15->30
        int count = 0;
        while (head2 != null) {
            Node temp = head1;
            while (temp != null) {
                // if both Nodes are same
                if (temp == head2) {
                    System.out.println(count);
                    return head2;
                }
                temp = temp.next;
                System.out.println(temp);
                count++;
            }
            head2 = head2.next;
        }
        // If intersection is not present between the lists,
        // return NULL.
        return null;
    }

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
}
