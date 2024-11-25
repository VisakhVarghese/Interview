package jdk_.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        // Define the regex pattern
        String regex1 = "a*b"; // a should be followed by exactly one b
        String regex2 = "\\s+";
        String regex3 = "a?b";
        String regex4 = "a+b";
        String regex5 = "\\s+";
        // Define the String
        String input1 = "aabb";
        String input2 = "The quick      brown fox ju mps over the lazy dog.";

        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(input1);

        boolean matches1 = matcher1.matches();

        System.out.println("Zero or more 'a' followed by 'b': - * "+ matches1);

        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(input1);

        boolean matches3 = matcher3.matches();

        System.out.println("Zero or one 'a' followed by 'b' - ? : "+ matches3);

        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(input1);

        boolean matches4 = matcher4.matches();

        System.out.println("one or more 'a' followed by 'b' - + : "+ matches4);

        // Create a Pattern object
        Pattern pattern2 = Pattern.compile(regex2);

        // Create a Matcher object
        Matcher matcher2 = pattern2.matcher(input2);

        // Replace all spaces with a single space
        String result = matcher2.replaceAll(" ");

        // Print the result
        System.out.println("Modified string: " + result);


    }
}

/**
 * a regular expression (regex) is a sequence of characters that define a search pattern.
 * his search pattern can be used for various string operations such as
 * searching,
 * matching,
 * replacing text.
 */

/**
 * Java provides the java.util.regex package for pattern matching with regular expressions.
 * The key classes in this package are:
 *
 * Pattern: A compiled representation of a regular expression.
 * Matcher: An engine that performs match operations on a character sequence by interpreting a Pattern.
 */

/**
 * Steps
 * Pattern.compile(regex): Compiles the given regular expression into a pattern.
 * pattern.matcher(input): Creates a matcher that will match the given input against the pattern.
 * matcher.matches(): Attempts to match the entire input sequence against the pattern.
 */

/**
 * Common Regex Patterns:
 * .: Any character (except newline)
 * ^: Start of a line
 * $: End of a line
 * *: Zero or more occurrences of the previous character
 * +: One or more occurrences of the previous character
 * ?: Zero or one occurrence of the previous character
 * \\d: Any digit
 * \\w: Any word character (alphanumeric + underscore)
 * \\s: Any whitespace character
 * [abc]: Any of the characters a, b, or c
 * [^abc]: Any character except a, b, or c
 * a{3}: Exactly three occurrences of 'a'
 * a{3,}: Three or more occurrences of 'a'
 * a{3,5}: Between three and five occurrences of 'a'
 */