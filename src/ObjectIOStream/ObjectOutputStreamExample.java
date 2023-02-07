package ObjectIOStream;

import java.io.*;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream outputStream = null;
        try {
            File file = new File("D:\\Module 2\\17-IO Binary File & Serialization\\Demo\\src\\ObjectIOStream\\fileTest.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            outputStream = new ObjectOutputStream(fileOutputStream);
            Student student = new Student("Huy", 22);
            outputStream.writeObject(student);
            System.out.println("Success!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert outputStream != null;
            outputStream.close();
        }
    }
}
