package jdbc.tools;

import jdbc.employeeCRUD.GetConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

import static java.lang.Integer.parseInt;

public class ToolsCrud {

    public static void main(String[] args) throws IOException, SQLException {
        Connection connection = GetConnection.connection;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter your choice: \n1. Add\n2. Get\n3. Update\n4. Delete\n5. Exit");
            Integer choice = parseInt(bufferedReader.readLine());
            ToolsCrud toolsCrud = new ToolsCrud();
            switch (choice) {
                case 1:
                    toolsCrud.addTool(bufferedReader, connection);
                    break;
                case 2:
                    Tool[] tools = toolsCrud.getToolInObject(connection);
                    for (int i = 0; i < tools.length && tools[i] != null; i++) {
                        System.out.println(tools[i]);
                    }
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

    private Tool[] getToolInObject(Connection connection) throws SQLException {
        Tool[] tools = new Tool[100];
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from tool");
        int currentIndex = 0;
        while (resultSet.next()) {
            Tool tool = new Tool();
            tool.setId(resultSet.getInt(1));
            tool.setName(resultSet.getString(2));
            tools[currentIndex++] = tool;
        }
        return tools;
    }

    private void deleteTool(BufferedReader bufferedReader, Connection connection) throws IOException, SQLException {
        System.out.println("Enter toolId");
        Integer toolId = Integer.parseInt(bufferedReader.readLine());
        deleteToolFromDB(connection, toolId);
    }

    private void deleteToolFromDB(Connection connection, Integer toolId) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("delete from tool where id = ?");
        preparedStatement.setInt(1, toolId);
        int deleteCount = preparedStatement.executeUpdate();
        System.out.println("Tool deleted with count : " + deleteCount);
    }

    private void updateTool(BufferedReader bufferedReader, Connection connection) throws IOException, SQLException {
        System.out.println("Enter toolId");
        Integer toolId = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter new name for tool");
        String toolName = bufferedReader.readLine();
        updateToolInDB(connection, toolId, toolName);
    }

    private void updateToolInDB(Connection connection, Integer toolId, String toolName) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("update tool set name = ? where id = ?");
        preparedStatement.setInt(2, toolId);
        preparedStatement.setString(1, toolName);
        Integer count = preparedStatement.executeUpdate();
        System.out.println("Row Updated with count : " + count);
    }

    private void getTools(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from tool");
        System.out.println("***********************");
        while (resultSet.next()) {
            System.out.println("Id : " + resultSet.getInt(1) + " Name : " + resultSet.getString(2));
        }
        System.out.println("***********************");
    }

    private void addTool(BufferedReader bufferedReader, Connection connection) throws IOException, SQLException {
        System.out.println("Enter tool Id");
        Integer id = parseInt(bufferedReader.readLine());
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