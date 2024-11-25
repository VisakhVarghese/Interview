package jdk_.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Range {
    public static void main(String[] args) {
//        Meaning: The character 'a' must appear at least 3 times and at most 5 times consecutively.
       // String regex = "a{3,5}"; // {min,max} Quantifier in Regular Expressions
        //String input = "aaaaaa";

        String regex = "a{3,5}";
        String[] testStrings = {"aaa", "aaaa", "aaaaa", "aa", "aaaaaa", "bbaaaabb"};

        Pattern pattern = Pattern.compile(regex);

        for (String testString : testStrings) {
            Matcher matcher = pattern.matcher(testString);
            boolean matches = matcher.find(); // Check if any substring matches the pattern
            System.out.println("Input: \"" + testString + "\" matches '" + regex + "': " + matches);
        }
    }
}

/**
 * Conclusion
 * The {min,max} quantifier is a powerful tool in regular expressions that allows
 * you to specify a range for the number of occurrences of a pattern. By understanding how it works,
 * you can create more precise and flexible patterns to match a variety of string formats.
 */