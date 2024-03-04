package jdbc.tools;

import jdbc.employeeCRUD.GetConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class ToolsCrud {

    public static void main(String[] args) throws IOException, SQLException {
        Connection connection = GetConnection.connection;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter your choice: 1. Add\n2. Get\n3. Update\n4. Delete\n5. Exit");
            Integer choice = Integer.parseInt(bufferedReader.readLine());
            ToolsCrud toolsCrud = new ToolsCrud();
            switch (choice) {
                case 1:
                    toolsCrud.addTool(bufferedReader, connection);
                    break;
                case 2:
                    toolsCrud.getTools(connection);
                    break;
                case 3:
                    toolsCrud.updateTool(bufferedReader, connection);
                    break;
                case 4:
                    toolsCrud.deleteTool(bufferedReader, connection);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    private void deleteTool(BufferedReader bufferedReader, Connection connection) {

    }

    private void updateTool(BufferedReader bufferedReader, Connection connection) {

    }

    private void getTools(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from tool");
        while (resultSet.next()) {
            System.out.println("Id : " + resultSet.getInt(1) + " Name : " + resultSet.getString(2));
        }
    }

    private void addTool(BufferedReader bufferedReader, Connection connection) throws IOException, SQLException {
        System.out.println("Enter tool Id");
        Integer id = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter tool name");
        String toolName = bufferedReader.readLine();
        Tool tool = new Tool();
        tool.setId(id);
        tool.setName(toolName);
        saveTool(connection, tool);
    }

    private void saveTool(Connection connection, Tool tool) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("insert into tool values(?,?)");
        statement.setInt(1, tool.getId());
        statement.setString(2, tool.getName());
        statement.execute();
        System.out.println("Tool added successfully!!");
    }
}