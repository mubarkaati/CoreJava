package wrapperclasses;

public class WrapperDemo {

    public static void main(String[] args) {
        int num1 = 1000;
        Integer num2 = new Integer(1000);
        Integer num3 = 5;   // autoboxing
        int num4 = new Integer(200);   // unboxing
        System.out.println(num1 == num2);
    }
}