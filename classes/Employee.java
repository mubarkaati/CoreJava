package classes;

public class Employee {

    int empId;
    String empName;
    float empSalary;

    public Employee(int empId, String empName, float empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public Employee(float empSalary) {
        this.empSalary = empSalary;
    }

    public Employee() {
    }
}

class EmployeeApplication {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "abc", 87844);
        employee = null;
        Employee employee1 = new Employee(96575);
        Employee employee2 = new Employee();
    }
}