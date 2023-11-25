package inheritance;

class ADemo {

    String name;

    String phoneNumber;

    String username;

    ADemo() {
        super();
    }

    ADemo(String name) {
        super();
        System.out.println(name);
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}

class BDemo extends ADemo {

    String childName;

    static String demo;

    public BDemo() {
        super();
    }

    public static BDemo hello() {
        return new BDemo();
    }

    public void displayParentDetails() {
        System.out.println(childName);
        System.out.println(this.childName);
        System.out.println(super.name);
        System.out.println(super.phoneNumber);
        System.out.println(super.username);
        super.sayHello();
    }

    public static void main(String[] args) {
        BDemo bDemo = new BDemo();
        bDemo.displayParentDetails();
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {
        BDemo bDemo = new BDemo();
        bDemo.name = "abc";
        bDemo.username = "xyz@csjb";
        bDemo.phoneNumber = "84638434";
        bDemo.displayParentDetails();
        System.out.println(BDemo.hello().childName);
    }
}