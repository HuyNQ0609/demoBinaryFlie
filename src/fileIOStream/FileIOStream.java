package fileIOStream;

import java.io.*;
public class FileIOStream {
    /* Ghi tep nhi phan bang FileOutputStream */
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11};
        try {
            File file = new File("D:\\Module 2\\17-IO Binary File & Serialization\\Demo\\src\\fileIOStream\\text.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

            for (int i : arr) {
                dataOutputStream.writeInt(i); /* Ghi du lieu kieu int */
            }
            dataOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
