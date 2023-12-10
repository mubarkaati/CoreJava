package filehandling;

import java.io.*;

public class GenerateMusic {

    public static void main(String[] args) throws IOException {
        File file = new File("musicfile.mp3");
        File newFile = new File("newMusic.mp3");
        if (!file.exists()) {
            System.out.println("File Not Exists");
        }
        System.out.println("File Exists");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(newFile);
        int i = 0;
        while (i != -1) {
            i = fileInputStream.read();
            System.out.print((char) i);
            fileOutputStream.write(i);
        }
        fileOutputStream.flush();
        fileOutputStream.close();
        fileInputStream.close();
    }
}