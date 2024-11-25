package jdk_.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnyCharacter {
    public static void main(String[] args) {
        String regex = "a.b";
        String[] testStrings = {"acb", "a-b", "ab", "axxb"};

        Pattern pattern = Pattern.compile(regex);

        for (String testString : testStrings) {
            Matcher matcher = pattern.matcher(testString);
            boolean matches = matcher.matches(); // Check if the entire string matches the pattern
            System.out.println("Input: \"" + testString + "\" matches '" + regex + "': " + matches);
        }

        // Example with ".*"
        String regex2 = "h.*";
        String[] testStrings2 = {"", "hello", "12345"};

        Pattern pattern2 = Pattern.compile(regex2);

        for (String testString : testStrings2) {
            Matcher matcher2 = pattern2.matcher(testString);
            boolean matches2 = matcher2.matches();
            System.out.println("Input: \"" + testString + "\" matches '" + regex2 + "': " + matches2);
        }
    }
}

/**
 * the dot (.) is a special character that matches any single character except a newline (\n).
 * This makes it a powerful tool for creating flexible patterns.
 */
