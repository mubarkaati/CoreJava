package variables;

public class VariableDemo {

    final String address = "indkf";

    String name;
    //instance variable

    static String phoneNumber;

    public void printNumber1To10() {
        int number;
        //local variable
    }

    public static void main(String[] args) {
        VariableDemo variableDemo3 = new VariableDemo();
        System.out.println(variableDemo3.address);
        VariableDemo variableDemo = new VariableDemo();
        variableDemo.name = "inheritance/usman";
        variableDemo.printNumber1To10();
        VariableDemo variableDemo1 = new VariableDemo();
        variableDemo1.name = "avc";
        System.out.println(VariableDemo.phoneNumber);
        VariableDemo.phoneNumber = "984397483";
        System.out.println(VariableDemo.phoneNumber);
        VariableDemo.phoneNumber = "947384845";
        System.out.println(VariableDemo.phoneNumber);
    }
}