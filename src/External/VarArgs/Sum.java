package VarArgs;

public class Sum {
    public static int sum( int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3,4,5));
    }
}

/**
 * Varargs (variable-length argument lists) in Java allow you to pass an arbitrary number of arguments to a method.
 * This feature is useful when you don't know in advance how many arguments will be passed to the method.
 * Varargs were introduced in Java 5.
 *
 * Syntax
 * To declare a varargs parameter,
 * To declare a varargs parameter, you use an ellipsis (...)
 */
