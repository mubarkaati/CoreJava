package abstraction;

//(0-100%)
//abstract class cannot
abstract class AbstractDemo {

    public abstract String getUser();

    public abstract String addUser();

    public String updateUser() {
        System.out.println("Hello");
        return "";
    }
}

class Child extends AbstractDemo {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getUser() {
        return name;
    }

    @Override
    public String addUser() {
        System.out.println("Enter name");
        return "user added successfully";
    }
}

class Child2 extends AbstractDemo {

    @Override
    public String getUser() {
        return "";
    }

    @Override
    public String addUser() {
        return "";
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {
        AbstractDemo child1 = new Child();
        AbstractDemo child2 = new Child2();
        child1.updateUser();
        child2.updateUser();
    }
}