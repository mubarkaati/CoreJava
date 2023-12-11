package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculationDemo {

    public static void main(String[] args) {
        CalculationDemo calculationDemo = new CalculationDemo();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            bufferedReader.readLine();
        } catch (IOException e) {
            System.out.println("Exception occurred during taking input");
        }
        System.out.println(calculationDemo.performCalculation(9, 0));
        System.out.println("Hello");
        System.out.println("Hello1");
        System.out.println("Hello2");
        System.out.println("Hello3");
    }

    public int performCalculation(int a, int b) {
        int result = 0;
        try {
            result = a/b;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            bufferedReader.readLine();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Exception occurred");
        }
        return result;
    }
}