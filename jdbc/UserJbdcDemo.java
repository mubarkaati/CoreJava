package jdbc;

import com.mysql.cj.protocol.Resultset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class UserJbdcDemo {

    public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException {
//        1 - Step
        Class.forName("com.mysql.cj.jdbc.Driver");
//        2 - Step
        Connection connection = DriverManager.getConnection("jdbc:mysql://mysql-193ae69d-coditas-3ac0.a.aivencloud.com:26918/userdemo", "avnadmin", "AVNS_OQ-vtyGq2UKJ_XlZ-CW");
//        DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname", "root", "root");
        if (connection != null) {
            System.out.println("Connection Created...");
        } else {
            System.out.println("Something went wrong");
        }

        Statement statement = connection.createStatement();
        statement.execute("create table if not exists user (id int primary key, name varchar(255));");
//        statement.execute("insert into user values(1, 'A')");
//        statement.execute("insert into user values(2, 'B')");
//        statement.execute("insert into user values(3, 'C')");
//        statement.execute("insert into user values(4, 'D')");
//        statement.execute("insert into user values(5, 'E')");

        ResultSet resultset = statement.executeQuery("select * from user");
//        -1 -> boolean (true or false) 0 -> 1 -> 2 -> 3
        while (resultset.next()) {
            System.out.println("Id: " + resultset.getInt(1) + " Name: " + resultset.getString(2));
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name to replace");
        String newName = bufferedReader.readLine();
        Integer id = Integer.parseInt(bufferedReader.readLine());

        int rowCount = statement.executeUpdate("update user set name = '" + newName + "' where id = " + id);
        System.out.println(rowCount);

        resultset = statement.executeQuery("select * from user");
//        -1 -> boolean (true or false) 0 -> 1 -> 2 -> 3
        while (resultset.next()) {
            System.out.println("Id: " + resultset.getInt(1) + " Name: " + resultset.getString(2));
        }
    }
}