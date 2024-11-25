package jdk_.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnyWord {
    public static void main(String[] args) {
        String regex = "\\w";  // Word character
        String[] inputs = {"a", "1", "_", "abc", "123", "a_b", " ", "!@#"};

        Pattern pattern = Pattern.compile(regex);

        for (String input : inputs) {
            Matcher matcher = pattern.matcher(input);
            System.out.println(matcher.find());
            System.out.print("Input: \"" + input + "\" matches '");
            while (matcher.find()) {
                System.out.print("[" + matcher.group() + "] ");
            }
            System.out.println("'");
        }
    }
}

/**
 * The regex pattern \\w is used to match any word character. In most regex flavors (including Java),
 * a word character is defined as any alphanumeric character (letters and digits) plus the underscore (_).
 * \\w: Matches any word character (a-z, A-Z, 0-9, and _).
 */

/**
 * matches(): Checks if the entire input string matches the pattern exactly.
 * find(): Searches the input string for occurrences that match the pattern.
 * It can find multiple matches within the same input string.
 */