package abstraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee {

    private String id;

    private String name;

    private float salary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

public class AbstractExample {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of employee");

        int employeeSize = Integer.parseInt(bufferedReader.readLine());

        Employee[] employees = new Employee[employeeSize];

        AbstractExample abstractExample = new AbstractExample();

        int count = 0;
        while (count < employeeSize) {
            Employee employee = abstractExample.createEmployee(bufferedReader);
            employees[count++] = employee;
        }
        count = 0;
        while (count < employeeSize) {
            Employee employee = employees[count++];
            abstractExample.printEmployee(employee);
        }
    }

    public Employee createEmployee(BufferedReader bufferedReader) throws IOException {
        Employee employee = new Employee();
        System.out.println("Enter employee name");
        employee.setName(bufferedReader.readLine());
        System.out.println("Enter employee id");
        employee.setId(bufferedReader.readLine());
        System.out.println("Enter employee salary");
        employee.setSalary(Float.parseFloat(bufferedReader.readLine()));
        return employee;
    }

    public void printEmployee(Employee employee) {
        System.out.println("*************************************");
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println("*************************************");
    }
}