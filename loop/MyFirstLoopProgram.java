package loop;

public class MyFirstLoopProgram {

    static int number = 10;

    public void printNumbers(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(i);
        }
    }

    public static void printOddNumber(int number) {
        for (int i = 0; i < number; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(MyFirstLoopProgram.number);
        MyFirstLoopProgram.printOddNumber(20);

    }
}

