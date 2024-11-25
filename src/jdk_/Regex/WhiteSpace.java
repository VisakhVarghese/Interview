package jdk_.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WhiteSpace {
    public static void main(String[] args) {
        String regex = "\\s";  // Whitespace character
        String[] inputs = {"a", " a", "a ", " a ", "a  b", "a\tb", "\n", "\r\n", "Visakh Varghese"};

        Pattern pattern = Pattern.compile(regex);

        for (String input : inputs) {
            Matcher matcher = pattern.matcher(input);
            boolean found = matcher.find();
            System.out.print("Input: \"" + input + "\" matches '[");
            while (matcher.find()) {
                System.out.print(matcher.group() + "] [");
            }
            System.out.println("]: " + found);
            System.out.println(matcher.replaceAll("!"));
        }

        String input = "Replace visakh \r\t with space";

        System.out.println("Original string: " + input);
    }
}

/**
 * \s: Matches any whitespace character, which includes spaces, tabs, line breaks, etc
 * Example Strings
 * Consider the following strings:
 *
 * "a"
 * " a"
 * "a "
 * " a "
 * "a b"
 * "a\tb" - Matches the tab character between a and b.
 * "\n" - Matches the newline character.
 * "\r\n" - Matches the carriage return followed by a newline character.
 */
