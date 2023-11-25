package inheritance;
//Is-A (Thightly Coupling)
public class Parent {

    String name;
    String phoneNumber;
    String birthCity;
}

class Child extends Parent {
    String name;
    String phoneNumber;

    String property;

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

class MyApplication {
    public static void main(String[] args) {
        Child child = new Child();

        System.out.println(child.birthCity);
        Object object = new Child();
        Parent parent = new Child();
        System.out.println(child.toString());
    }
}

class Address {
    String city;
}

class Employee {
    int id;
    String name;
    Address address;

    public static void main(String[] args) {
        Employee employee = new Employee();
    }
}