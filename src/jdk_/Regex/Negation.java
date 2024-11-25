package jdk_.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Negation {
    public static void main(String[] args) {
        String regex = "[^abc]";
        String[] testStrings = {"d", "e", "a", "b", "abc"};

        Pattern pattern = Pattern.compile(regex);

        for (String testString : testStrings) {
            Matcher matcher = pattern.matcher(testString);
            boolean matches = matcher.matches(); // Check if the entire string matches the pattern
            System.out.println("Input: \"" + testString + "\" matches '" + regex + "': " + matches);
        }

        // Example with "a[^bc]d"
        String regex2 = "a[^bc]d";
        String[] testStrings2 = {"aed", "a_d", "abd", "acd"};

        Pattern pattern2 = Pattern.compile(regex2);

        for (String testString : testStrings2) {
            Matcher matcher2 = pattern2.matcher(testString);
            boolean matches2 = matcher2.matches();
            System.out.println("Input: \"" + testString + "\" matches '" + regex2 + "': " + matches2);
        }
    }
}

/**
 * negation operator in regular expressions is used within square brackets to match any single character
 * that is not within the specified set. This is done using [^...].
 *
 * How Negation Works
 * [^abc]: Matches any single character except 'a', 'b', or 'c'
 */
