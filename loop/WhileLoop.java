package loop;

public class WhileLoop {

    public static void main(String[] args) {
        int number = 1000;
        while (number > 0) {
            System.out.println(number);
            number = number / 10;
        }

        number = 1000;

        do {
            System.out.println(number);
        } while (number > 1000);
    }
}