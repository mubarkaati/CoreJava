package jdbc.employeeCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {

    public static Connection connection;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql://mysql-193ae69d-coditas-3ac0.a.aivencloud.com:26918/userdemo", "avnadmin", "AVNS_OQ-vtyGq2UKJ_XlZ-CW");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}