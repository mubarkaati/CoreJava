package examples;

//input from user and find number is odd or even

import java.util.Scanner;

public class NumberPrograms {

    public boolean isOdd(int number) {
        if (number % 2 == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number int");
        int number = scanner.nextInt();
        NumberPrograms numberPrograms = new NumberPrograms();
        boolean isOdd = numberPrograms.isOdd(number);
        if (isOdd) {
            System.out.println("Number is odd");
        }
        else {
            System.out.println("Number is even");
        }
    }
}