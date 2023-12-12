package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateException {

    public static void main(String[] args) {
        GenerateException generateException = new GenerateException();
        try {
            generateException.takeInput();
        } catch (IOException e) {

        }
    }

    public void takeInput() throws IOException {
            int a = input1();
            int b = input2();
            throw new RuntimeException();
    }

    public int input1() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        return number;
    }

    public int input2() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.readLine();
        bufferedReader.readLine();
        return number;
    }
}