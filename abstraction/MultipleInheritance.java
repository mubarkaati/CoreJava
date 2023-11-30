package abstraction;

interface Parent1Interface {

    void hello();
}

interface Parent2Interface {

    void hello();

    int printAnyNumber();
}

interface Parent3Interface {

    void hello();
}

class ChildImpl implements Parent1Interface, Parent2Interface, Parent3Interface {

    public void hello() {
        System.out.println("Hello");
    }

    @Override
    public int printAnyNumber() {
        return 8;
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Parent1Interface p1 = new ChildImpl();

        Parent2Interface p2 = new ChildImpl();

        p1.hello();

        p2.hello();
        p2.printAnyNumber();
    }
}