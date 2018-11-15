package com.example.jdbc;

import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ResourceBundle;

public class TestConnection {
    private ResourceBundle resourceBundle = ResourceBundle.getBundle("database");
    private Logger log = Logger.getLogger(TestConnection.class);

    public void testQueryMethod(String name) {
        String url = resourceBundle.getString("db.url");
        String login = resourceBundle.getString("db.login");
        String password = resourceBundle.getString("db.password");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, login, password);
//            connection.setAutoCommit(false);
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            statement.addBatch("insert into users values(null, 'Simon', 'Pirko', 1219)");
            statement.addBatch("insert into users values(null, 'Simon', 'Pirko', 1220)");
            statement.executeBatch();
            connection.commit();
//            PreparedStatement preparedStatement = connection
//                    .prepareStatement("select * from user where first_name = ?");
//            preparedStatement.setString(1, name);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                System.out.print(resultSet.getString("first_name") + " ");
//                System.out.print(resultSet.getString("last_name") + " ");
//                System.out.println(resultSet.getString("email"));
//            }
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            log.error("SQL Error!");
        }
    }

    public static void main(String[] args) {
        new TestConnection().testQueryMethod("Denis");
    }
}
