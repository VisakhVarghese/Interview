package Collections.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        //1
        Vector<Integer> v =
                new Vector<Integer>();
        //2
        Vector<Integer> vSize =
                new Vector<Integer>(15);
        //3
        Vector<Integer> vInc =
                new Vector<Integer>(15,
                        5);
        //4
        Collection<Integer> collection = new ArrayList<>();
        Vector<Integer> vCollection =
                new Vector<Integer>(collection);

        v.add(1);
        v.add(2);
        System.out.println(v);
        v.remove(1);
        System.out.println(v);
        v.set(0,21);
        System.out.println(v);
        v.add(0,10);
        System.out.println(v);



        //Synchronization
        //Dynamic Size

        //Disadvantage
        //Performance
    }
}

/**
 * It also maintains an insertion order
 * rarely used in a non-thread environment as it is synchronized
 * due to this, it gives a poor performance in adding, searching, deleting, and updating its elements.
 */

/**
 * Aduvandages
 * Vector is synchronized, making it safe to use in a multi-threaded environment.
 * Dynamic Size: The size of a Vector can grow or shrink dynamically as elements are added or removed
 *
 */
