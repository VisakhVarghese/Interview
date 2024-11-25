package FunctionalInterface;

public class FunctionalInterfaceDemo implements Operation{
    public static void main(String[] args) {
        Operation addition = (a, b) -> a + b;
        Operation subtraction = (a, b) -> a - b;

        System.out.println(addition.operate(2,3));
        System.out.println(subtraction.operate(3,2));
        Operation op = new FunctionalInterfaceDemo();
        System.out.println(op.operate(1,2));
    }

    @Override
    public int operate(int a, int b) {
        return a+b;
    }
}
