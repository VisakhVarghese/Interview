package jdk_;

import java.io.*;

public class Serilization {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30, "password123");

//        Serilize
        try (FileOutputStream fileOut = new FileOutputStream("D:/Interview/Java/Problem_Java/src/jdk/encode.txt");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(person);
            System.out.println("Serialized data is saved in encode.txt");
        } catch (IOException i) {
            i.printStackTrace();
        }

        Person person1 = null;
//        deserilize
        try (FileInputStream fileIn = new FileInputStream("D:/Interview/Java/Problem_Java/src/jdk/encode.txt");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            person1 = (Person) in.readObject();
            System.out.println("Deserialized Person:");
            System.out.println(person1);
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
    }

}

/**
 * Serialization in Java is the process of converting an object into a byte stream, so it can be easily saved to a file,
 * transferred over a network, or stored in a database
 * Deserialization is the reverse process where the byte stream is converted back into a copy of the original object.
 * This mechanism allows objects to be transferred or persisted without losing their state.
 */

/**
 * Key Concepts of Serialization and Deserialization
 * Serializable Interface: An object must implement the Serializable interface to be serializable.
 * This interface is a marker interface (it does not contain any methods).
 * ObjectOutputStream: Used to write the object to an OutputStream.
 * ObjectInputStream: Used to read the object from an InputStream.
 */

/**
 * serialVersionUID: It is recommended to define a serialVersionUID in the class to ensure compatibility
 * between different versions of the class during deserialization.
 *
 * transient Keyword: Fields marked with the transient keyword are not serialized.
 * This is useful for sensitive information like passwords or fields that can be derived from other fields.
 *
 * Custom Serialization: You can customize the serialization process by implementing the writeObject and readObject methods.
 *
 * Inheritance: If a superclass implements Serializable, then its subclasses are automatically serializable.
 *
 * Security: Be cautious with deserialization because it can lead to security vulnerabilities.
 * Ensure the byte stream comes from a trusted source.
 */
