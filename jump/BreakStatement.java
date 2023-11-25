package jump;

public class BreakStatement {

    public static void main(String[] args) {
        for (int j = 0; j < 4; j++) {
            if (j == 2) {
                continue;
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                if (i == 5) {
                    break;
                }
            }
        }
    }
}