package jdk_;

public class UnasignedAirthOpe {
    public static void main(String[] args) {
        int unsignedInt1 = Integer.parseUnsignedInt("4000000000"); // 4 billion
        int unsignedInt2 = Integer.parseUnsignedInt("2");

        // Unsigned division
        int unsignedDivision = Integer.divideUnsigned(unsignedInt1, unsignedInt2);
        System.out.println("Unsigned Division: " + unsignedDivision); // Output: 2000000000

        // Unsigned remainder
        int unsignedRemainder = Integer.remainderUnsigned(unsignedInt1, unsignedInt2);
        System.out.println("Unsigned Remainder: " + unsignedRemainder); // Output: 0

        long unsignedLong1 = Long.parseUnsignedLong("10000000000000000000"); // 10 quintillion
        long unsignedLong2 = Long.parseUnsignedLong("3");

        // Unsigned division
        long unsigneddDivision = Long.divideUnsigned(unsignedLong1, unsignedLong2);
        System.out.println("Unsigned Division: " + unsigneddDivision); // Output: 3333333333333333333

        // Unsigned remainder
        long unsigneddRemainder = Long.remainderUnsigned(unsignedLong1, unsignedLong2);
        System.out.println("Unsigned Remainder: " + unsigneddRemainder); // Output: 1
    }
}
