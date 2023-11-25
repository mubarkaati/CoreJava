package ploymorphism.example;

class Employee {

    int id;
    String name;
    float basicSalary;

    public float printSalary() {
        return this.basicSalary;
    }

    public Employee(int id, String name, float basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }
}

class Developer extends Employee {

    float hra;
    float variable;

    public Developer(float variable, float hra, int id, String name, float basicSalary) {
        super(id, name, basicSalary);
        this.variable = variable;
        this.hra = hra;
    }

    @Override
    public float printSalary() {
        return this.basicSalary + this.hra + this.variable;
    }

    public void hello() {
        System.out.println("hello");
    }
}

class Tester extends Employee {

    float bonus;

    public Tester(float bonus, int id, String name, float basicSalary) {
        super(id, name, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public float printSalary() {
        return this.basicSalary + this.bonus;
    }
}

public class EmployeeApplication {

    public static void main(String[] args) {
        Object employeeDeveloper = new Developer(4000, 1200, 101, "RAM", 12000);
        Object employeeTester = new Tester(6000, 102, "RAVI", 10000);

//        System.out.println("Developer Salary");
//        System.out.println(employeeDeveloper.printSalary());
//        System.out.println("Tester Salary");
//        System.out.println(employeeTester.printSalary());
//
        Employee employee = new Employee(104, "ABC", 843784);
//        System.out.println(employee.printSalary());

        int number = (int) 9854.65;

        //instanceof -> true/false

        boolean isTrue = employeeDeveloper instanceof Employee;
        if (isTrue) {
            Employee employeeDev = (Employee) employeeDeveloper;
            System.out.println(employeeDev.printSalary());
        }
    }
}