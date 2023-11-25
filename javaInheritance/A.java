package javaInheritance;

public class A {

    String name;
    String phoneNumber;
    String address;
    String id;
}


class B extends A {

    public static void main(String[] args) {
        B b = new B();

    }
}

class Address {
    String city;
    String pinCode;
}

class Employee {
    String name;
    String id;
    static String dk;
    Address address;

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.main();
    }

    public void main() {
        Employee employee = new Employee();
        System.out.println(dk);
        employee.sayHello();
    }
}