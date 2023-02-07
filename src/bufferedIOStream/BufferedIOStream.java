package bufferedIOStream;

import java.io.*;

public class BufferedIOStream {
    /* Ghi file nhi phan bang BufferedOutputStream */
    public static void main(String[] args) {
        String data = "This is a line of text inside the file";
        try {
            FileOutputStream file = new FileOutputStream("D:\\Module 2\\17-IO Binary File & Serialization\\Demo\\src\\bufferedIOStream\\output.txt");
            BufferedOutputStream output = new BufferedOutputStream(file);
            byte[] array = data.getBytes();
            output.write(array);
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}