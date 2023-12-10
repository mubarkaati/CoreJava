package filehandling;

import java.io.*;

public class FileHandlingDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        if (file.isFile()) {
            System.out.println("File exists");
        }
        else {
            boolean isCreated = file.createNewFile();
            System.out.println("File Created Status : " + isCreated);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        System.out.println("Enter data");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        for (int i = 0; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            fileOutputStream.write(currentChar);
        }
        fileOutputStream.flush();
        fileOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream(file);
        int i = 0;
        while (i != -1) {
            i = fileInputStream.read();
            System.out.print((char) i);
        }
        fileInputStream.close();
    }
}