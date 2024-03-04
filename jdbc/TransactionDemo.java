package jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://mysql-193ae69d-coditas-3ac0.a.aivencloud.com:26918/userdemo", "avnadmin", "AVNS_OQ-vtyGq2UKJ_XlZ-CW");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            System.out.println("Inserting Data");
            statement.execute("insert into user values(8, 'ABC')");
            System.out.println("Enter anything");
            Integer.parseInt(bufferedReader.readLine());
            connection.commit();
            System.out.println("Data Inserted Success");
        } catch (Exception e) {
            System.out.println("Exception Occurred");
            connection.rollback();
            System.out.println("Roll Backed");
        }
    }
}