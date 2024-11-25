package jdk_;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.security.Key;
import java.util.Base64;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private transient String password; // this field won't be serialized by default
    private static Key key;

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = encryptPassword(password);
    }

    static {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128);
            key = keyGen.generateKey();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


//    private void writeObject(ObjectOutputStream oos) throws IOException {
//        oos.defaultWriteObject();
//        oos.writeObject(encryptPassword(password));
//    }
//
//    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
//        ois.defaultReadObject();
//        this.password = decryptPassword((String) ois.readObject());
//    }

    private String encryptPassword(String password) {
        // Simple encryption logic (for demonstration purposes)
//        return "encrypted" + password;
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encrypted = cipher.doFinal(password.getBytes());
            return Base64.getEncoder().encodeToString(encrypted);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private String decryptPassword(String password) {
        // Simple decryption logic (for demonstration purposes)
//        return password.substring(9);
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(password));
            return new String(decrypted);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "', password='" + password + "'}";
    }
}


/**
 * you should use a robust encryption algorithm from a well-established cryptography library,
 * such as AES provided by the Java Cryptography Architecture (JCA).
 * AES Encryption: The encryptPassword and decryptPassword methods use AES encryption and decryption.
 * SecretKey: A SecretKey is generated for AES encryption. This key must be securely managed and made available
 * for both serialization and deserialization processes.
 * In a real-world application, you would securely store and retrieve this key.
 */


/**
 * Avoiding Serialization of Non-Serializable Fields:
 *
 * Some fields may reference objects that do not implement Serializable. Marking such fields as transient allows
 * the object containing them to be serialized without encountering NotSerializableException.
 *
 * Reducing Serialized Data Size:
 *
 * Certain fields may contain temporary or derived data that is not necessary to persist.
 * Excluding these fields by marking them as transient reduces the size of the serialized object,
 * which can improve performance and save storage space.
 *
 * Security:
 *
 * For security reasons, sensitive information such as passwords or keys should not be serialized.
 * Marking these fields as transient ensures they are not inadvertently exposed when the object is serialized.
 *
 * Resource Management:
 *
 * Fields that represent resources such as file handles, network connections, or threads should be marked as
 * transient because these resources cannot be serialized and need to be re-established after deserialization.
 */
