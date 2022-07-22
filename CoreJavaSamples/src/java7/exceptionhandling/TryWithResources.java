package java7.exceptionhandling;

import java.io.*;

public class TryWithResources implements Closeable {

    public static void main(String[] args) {
        final File file = new File("C:\\Users\\Aakash\\Documents\\aakashfileexample.txt");
        // pre Java 7 start
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            // read a file
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // pre Java 7 try-catch ends

        // post Java 7
        try (TryWithResources resources = new TryWithResources();
             FileInputStream fis1 = new FileInputStream(file)) {
            // read a file
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws IOException {

    }
}
