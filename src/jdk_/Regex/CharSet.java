package jdk_.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharSet {
    public static void main(String[] args) {
        String regex = "[abc]";
        String[] testStrings = {"a", "b", "c", "d", "abc"};

        Pattern pattern = Pattern.compile(regex);

        for (String testString : testStrings) {
            Matcher matcher = pattern.matcher(testString);
            boolean matches = matcher.find(); // Check if any substring matches the pattern
            System.out.println("Input: \"" + testString + "\" matches '" + regex + "': " + matches);
        }

        // Example with "a[bc]d"
        String regex2 = "a[bc]d";
        String[] testStrings2 = {"abbd", "acd", "aad", "abcd"};

        Pattern pattern2 = Pattern.compile(regex2);

        for (String testString : testStrings2) {
            Matcher matcher2 = pattern2.matcher(testString);
            boolean matches2 = matcher2.matches();
            System.out.println("Input: \"" + testString + "\" matches '" + regex2 + "': " + matches2);
        }
    }
}

/**
 * character set in regular expressions, denoted by square brackets [ ],
 * allows you to specify a set of characters that you want to match.
 * Any single character within the brackets will be matched.
 * This is useful for creating patterns that need to match one character out of several possible characters.
 *
 * How Character Sets Work
 * [abc]: Matches any single character that is 'a', 'b', or 'c'.
 */

/**
 * Character Options:
 *
 * Use [abc] to match any one of the characters 'a', 'b', or 'c'.
 * For example, [0-9] matches any single digit.
 */