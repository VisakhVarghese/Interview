package jdk_.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EndOfLine {
    public static void main(String[] args) {
        String regex = "se$";
        String input = "Visakh Varghese";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        boolean matches = matcher.find();
        System.out.println("Ends with 'world': " + matches);
    }
}
