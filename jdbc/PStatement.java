package jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class PStatement {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            Connection connection = DriverManager.getConnection("jdbc:mysql://mysql-193ae69d-coditas-3ac0.a.aivencloud.com:26918/userdemo", "avnadmin", "AVNS_OQ-vtyGq2UKJ_XlZ-CW");
            PreparedStatement createEmployee = connection.prepareStatement("insert into employee values(?,?,?)");

            System.out.println("Enter Employee Id");
            Integer employeeId = Integer.parseInt(bufferedReader.readLine());
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employee where id = " + employeeId);
            if (resultSet.next()) {
                throw new RuntimeException("Employee Already Exists");
            }
            createEmployee.setInt(1, employeeId);
            System.out.println("Enter Employee Username");
            createEmployee.setString(2, bufferedReader.readLine());
            System.out.println("Enter Employee Password");
            createEmployee.setString(3, bufferedReader.readLine());

            boolean status = createEmployee.execute();
            if (status == false) {
                int count = createEmployee.getUpdateCount();
                System.out.println(count);
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}