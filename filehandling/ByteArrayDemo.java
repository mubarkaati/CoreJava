package filehandling;

import java.io.*;

public class ByteArrayDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("byteDemo.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String statement = "hello how are you";
        for (int i = 0; i < statement.length(); i++) {
            byteArrayOutputStream.write(statement.charAt(i));
        }
        byteArrayOutputStream.writeTo(fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] data = new byte[10];
        fileInputStream.read(data);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        int i = 0;
        while (i != -1) {
            i = byteArrayInputStream.read();
            System.out.print((char) i);
        }
    }
}