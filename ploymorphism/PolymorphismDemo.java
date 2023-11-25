package ploymorphism;

public class PolymorphismDemo {

    public PolymorphismDemo() {
    }

    public PolymorphismDemo(int a) {
        System.out.println(a);
    }

    //Compile Time
    //based on count of parameters
    //based on dataTypes
    //within a class
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public int sum(int a, float b) {
        return a + (int) b;
    }

    public int sum(String name) {
        return 9;
    }

    public static void main(String[] args) {
        PolymorphismDemo polymorphismDemo = new PolymorphismDemo();
        polymorphismDemo.sum(4, 7.9F);
        polymorphismDemo.sum(4, 7, 9);
        polymorphismDemo.sum("jdfhdk");
        PolymorphismDemo polymorphismDemo1 = new PolymorphismDemo(7);
    }
}