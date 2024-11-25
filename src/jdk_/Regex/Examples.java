package jdk_.Regex;

public class Examples {
    public static void main(String[] args) throws InterruptedException {

                System.out.print("Progress : ");
                Thread.sleep(1000);
                for (int i = 0; i <= 100; i++) {
                    System.out.print("\r" + i + "%");
                    try {
                        Thread.sleep(100); // Simulate some work being done
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("\nTask completed!");

        String input = "Hello\tWorld";
        String replaced = input.replaceAll("\t", "");
        System.out.println(replaced);

    }
}
