package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserOperation {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name");
        String name = bufferedReader.readLine();
        System.out.println("Enter Age");
        int age = Integer.parseInt(bufferedReader.readLine());
        if (age < 18) {
            throw new UserAgeIsLessThen18("user age should be greater then 18");
        } else {
            System.out.println("Register Successfully!!");
        }
    }
}