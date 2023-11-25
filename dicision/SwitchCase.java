package dicision;

public class SwitchCase {

    public static void main(String[] args) {
        int num = 10;
        if (num < 10) {

        } else if (num == 10) {

        } else if (num == 11) {

        } else if (num == 45) {

        }

        int number = 1;
        switch (number) {
            case 1:
                System.out.println("1 number passed");
                break;
            case 2:
                System.out.println("2 number passed");
                break;
            case 3:
                System.out.println("3 number passed");
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }
    }
}