package filehandling;

import java.io.*;

public class BufferDemo {


    public static void main(String[] args) throws IOException {
        File file = new File("buffered.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        String statement = "hello how are you";
        bufferedOutputStream.write(statement.getBytes());
        bufferedOutputStream.flush();
        bufferedOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        byte[] data = new byte[20];
        bufferedInputStream.read(data);
        int i = 0;
        while (i != -1) {
            i = bufferedInputStream.read();
            System.out.print((char) i);
        }
    }
}