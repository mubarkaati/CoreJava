package jdbc.employeeCRUD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class EmployeeService {

    public static void main(String[] args) throws IOException, SQLException {
        Connection connection = GetConnection.connection;
        EmployeeService employeeService = new EmployeeService();
        Employee employee = employeeService.createEmployeeObject();

        boolean isSaved = employeeService.saveEmployee(employee, connection);

        System.out.println("Employee Saved Status : " + isSaved);
    }

    public boolean saveEmployee(Employee employee, Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into employee values(?,?,?)");
        preparedStatement.setInt(1, employee.getId());
        preparedStatement.setString(2, employee.getUsername());
        preparedStatement.setString(3, employee.getPassword());
        return preparedStatement.execute();
    }

    public Employee createEmployeeObject() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Employee employee = new Employee();
        System.out.println("Enter Employee Id");
        employee.setId(Integer.parseInt(bufferedReader.readLine()));
        System.out.println("Enter Employee Username");
        employee.setUsername(bufferedReader.readLine());
        System.out.println("Enter Employee Password");
        employee.setPassword(bufferedReader.readLine());
        return employee;
    }
}