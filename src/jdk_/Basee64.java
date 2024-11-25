package jdk_;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
public class Basee64 {
    public static void main(String[] args) throws Exception {
        String originalString = "Hello, World!";

        // Encode string to Base64
        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());
        System.out.println("Encoded string: " + encodedString);

        Path filePath = Paths.get("D:/Interview/Java/Problem_Java/src/jdk/encode.txt");
        byte[] fileContent = Files.readAllBytes(filePath);

        // Encode binary data to Base64
        String encodedStringg = Base64.getEncoder().encodeToString(fileContent);
        System.out.println("Encoded file content: " + encodedStringg);

//        String encodedStrings = "SGVsbG8sIFdvcmxkIQ==";

        // Decode Base64-encoded string
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded string: " + decodedString);

        String encodedStrings = "VmlzYWtoVmFyZ2hlc2U=";
        Path filePaths = Paths.get("D:/Interview/Java/Problem_Java/src/jdk/decode.txt");

        // Decode Base64-encoded string to binary data and write to file
        byte[] decodedBytess = Base64.getDecoder().decode(encodedStrings);
        Files.write(filePaths, decodedBytess);
        System.out.println("Decoded content written to file: " + filePath);
    }
}

/**
 * used to convert binary data into a text format
 * safe for transmission over protocols that handle only text data, such as email systems or some web servers.
 * Base64 encoding transforms binary data (like images or files) into a sequence of printable ASCII characters,
 * and decoding reverses the process, converting Base64-encoded data back into its original binary form.
 * you can perform Base64 encoding using classes from the java.util.Base64 package, which was introduced in Java 8.
 */

/**
 * Supported Characters: Base64 encoding uses a subset of ASCII characters (A-Z, a-z, 0-9, +, /, and = for padding).
 * The encoded string may contain = characters at the end to pad the output to a multiple of 4 characters.
 * Use Cases: Common use cases include encoding binary data for transmission over text-based protocols
 * (e.g., email attachments, HTTP requests).
 */
