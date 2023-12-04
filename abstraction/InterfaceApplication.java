package abstraction;

interface A321 {

    void hello();
    void hello1();

}

interface A432 extends A321 {

}

abstract class Class123 implements A321 {

    public void hello1() {

    }
}

public class InterfaceApplication extends Class123 {

    @Override
    public void hello() {

    }
}