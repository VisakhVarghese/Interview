package String;


import java.util.Stack;

public class ValidParanthesis {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            switch (ch){
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != ']'){
                        return false;
                    }
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != ')'){
                        return false;
                    }
                    break;
                default:
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "{[()]}";
        String s2 = "{[(])}";
        String s3 = "{{[[(())]]}}";

        System.out.println("Is \"" + s1 + "\" balanced? " + isBalanced(s1));
        System.out.println("Is \"" + s2 + "\" balanced? " + isBalanced(s2));
        System.out.println("Is \"" + s3 + "\" balanced? " + isBalanced(s3));
    }
}

