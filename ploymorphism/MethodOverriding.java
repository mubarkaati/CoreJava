package ploymorphism;

class A {

    public int sum(int a, int b) {
        return a + b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    protected void printHello() {
        System.out.println("Hello");
    }

    private void printAnyStatement() {
        System.out.println("Hello");
    }
}

class B extends A {

    String name;

    public int sum(int a, int b) {
        return a + b + 10;
    }

    @Override
    public int mul(int a, int b) {
        return (a * b) + 2;
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}

public class MethodOverriding {

    public static void main(String[] args) {
        A a = new A();
        int result = a.sum(3, 6);
        System.out.println(result);

        A a1 = new B();

        a1.sub(4,7);

        int result2 = a1.sum(3, 6);
        System.out.println(result2);

        int resultMul = a1.mul(5, 8);
        System.out.println(resultMul);

        B b = new B();
        b.sayHello();
        b.sub(4, 7);
    }
}