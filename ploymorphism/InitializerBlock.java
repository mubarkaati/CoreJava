package ploymorphism;

class ParentA {

    String name;

    public void printHello() {
        System.out.println("Hello From Parent Class");
    }

    public final void printMySalary() {
        System.out.println("9584954");
    }
}

final class ChildA extends ParentA {

    @Override
    public void printHello() {
        System.out.println("Hello From Base Class");
    }
}

public class InitializerBlock {

    public static void main(String[] args) {
        ParentA parentA = new ChildA();
        parentA.printHello();
        parentA.printMySalary();
    }
}