package jdk_;

public class BasicOperations {
    public static void main(String[] args) {
        int a =10;
        int e = a++ + --a;
        int d = ++a + a++ + --a;
        int b = ++a + a++ + --a;
        int c = ++a + a;
        System.out.println(e);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);

    }
}
