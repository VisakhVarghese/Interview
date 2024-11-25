package jdk_;

import java.io.*;

public class CustomFile {

    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "D:/Interview/Java/Problem_Java/src/jdk/encode.txt";

        //BufferedReader - used to efficiently read text frm the character input stream (FileReader)
//        BufferedWriter is used to efficiently write text to a character output stream (FileWriter in this case).
//        To read from a file in Java, you typically use FileInputStream, BufferedReader, or Scanner classes.
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        To write to a file in Java, you typically use FileOutputStream, BufferedWriter, or PrintWriter classes
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){

            writer.write("Hello Visakh \n");
            writer.write("End \n");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //read or write binary data (like images, videos, etc.), you would use FileInputStream, FileOutputStream,
        // and appropriate buffers for efficient handling of byte data.

        String sourceFilePath = "D:/Realme/01VISHAL.jpg";
        String distFilePath  = "D:/Courses/visal.jpg";

        try(FileInputStream fileInputStream = new FileInputStream(sourceFilePath);
        FileOutputStream fileOutputStream = new FileOutputStream(distFilePath)){
            byte[] buffer = new byte[1024];
            int byteRead;

            while((byteRead = fileInputStream.read(buffer)) != -1){
                fileOutputStream.write(buffer, 0, byteRead);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        FileInputStream fis = null;
        try {
            // Open the input stream
            fis = new FileInputStream("D:/Interview/Java/Problem_Java/src/jdk/encode.txt");

            int content;
            // Read the file byte by byte
            while ((content = fis.read()) != -1) {
                // Convert byte to char and display it
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    // Close the input stream
                    fis.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        FileOutputStream fos = null;
        try {
            // Open the output stream
            fos = new FileOutputStream("D:/Interview/Java/Problem_Java/src/jdk/encode.txt");

            String content = "Hello, World!";
            // Convert the string to bytes and write to the file
            fos.write(content.getBytes());

            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    // Close the output stream
                    fos.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
