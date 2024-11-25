package jdk_;

public class LexicographicOrder {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "Apple";
        String str5 = "Apple";

        String str4 = new String("Apple");

        int result = str1.compareTo(str2);

        System.out.println(result);

        result = str1.compareTo(str3);
        // coz a > A in Unicode

        System.out.println(result);

        result = str1.compareToIgnoreCase(str3);

        System.out.println(result);

        result = str1.compareToIgnoreCase(str4);

        System.out.println(result);

        boolean isEqual = str1.equals(str2);

        System.out.println(isEqual);

        isEqual = str1.equals(str3);

        System.out.println(isEqual);

        isEqual = str1.equalsIgnoreCase(str3);

        System.out.println(isEqual);

        isEqual = str1.equalsIgnoreCase(str4);

        System.out.println(isEqual);

        isEqual = str3 == str4;

        System.out.println(isEqual);

        isEqual = str3 == str5;

        System.out.println(isEqual);

    }
}
