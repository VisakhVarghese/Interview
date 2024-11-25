package jdk_.Collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Use Case: Stack is useful for LIFO operations such as function call stacks, undo mechanisms, and parsing expressions.
 */

public class Custom_Stack {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
        Deque<Integer> stack = new LinkedList<>();
        stack.push(1); // Push element
        stack.push(2);
        stack.push(3);

        System.out.println(stack);

// Peek element - get last element
        int top = stack.peek();

        System.out.println(top);

        int poll = stack.poll();

        System.out.println(poll);

// Pop element - remove last element
        int pop = stack.pop();

        System.out.println(pop);

        System.out.println(stack);

// Iterate over elements (not typical for stack)
        for (int num : stack) {
            System.out.println(num);
        }

// Size of Stack
        int size = stack.size();
    }
}
