package LinkedList;

public class CustomLinkedList {
    public static void main(String[] args) {

        ListNodes head = new ListNodes(3);
        head.next = new ListNodes(4);
        head.next = new ListNodes(5);

       while (head != null){
           System.out.print(head);
           head = head.next;
       }

    }

    static class ListNodes{
        int v;

        ListNodes next;

        ListNodes(int v){
            this.v = v;
            this.next = null;
        }

        @Override
        public String toString(){
            return "[" + v +"]";
        }

    }
}
