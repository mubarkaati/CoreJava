package day1;

class A {

    String name;

    public A() {
        System.out.println("Hello");
    }

    public A(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

public class ObjectAndClasses {

    public void printAObject(A a1) {
        System.out.println(a1);
    }

    public static void main(String[] args) {
        ObjectAndClasses objectAndClasses = new ObjectAndClasses();
        A a = new A();
        a.name = "abc";
        objectAndClasses.printAObject(a);
    }
}

class P {
    String hello;

    public P(String hello) {
        super();
        this.hello = hello;
    }
}

class C extends P {

    public C(String hello) {
        super(hello);
    }

    public static void main(String[] args) {
        C c = new C("abc");
    }
}