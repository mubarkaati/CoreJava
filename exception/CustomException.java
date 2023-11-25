package exception;

import java.io.IOException;

public class CustomException {

    public static void main(String[] args) {
        try {
            Demo demo = new Demo("Usman");
            demo.sayHello(0);
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        finally {
            System.out.println("Last Point");
        }
    }
}

class Demo {

    static String name;

    public Demo(String name) {
        Demo.name = name;
    }

    public void sayHello(int number) {
        divide(number);
        System.out.println(Demo.name);
    }

    private void divide(int number) {
        int num = 10 / number;
    }
}