package abstraction;

interface A123 {

    public static final String name = "abc";

    public abstract void hello();

    float calculateArea();

    default void helloStatement() {
        System.out.println("Hello");
    }

    static void helloStatement1() {
        System.out.println("Hello static");
    }
}

interface A124 extends A123 {
}

class InterfaceImpl implements A123 {

    @Override
    public void hello() {

    }

    @Override
    public float calculateArea() {
        return 0;
    }

    @Override
    public void helloStatement() {
        System.out.println("");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {
        A123 a123 = new InterfaceImpl();
        a123.helloStatement();
    }
}