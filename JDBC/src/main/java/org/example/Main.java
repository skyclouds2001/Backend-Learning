package org.example;

import java.sql.*;

public class Main {
    public static void main (String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/csy";
            String user = "root";
            String password = "root123456";
            Connection conn = DriverManager.getConnection(url, user, password);

            String sql1 = "select * from course";
            Statement state = conn.createStatement();
            ResultSet res1 = state.executeQuery(sql1);
            System.out.println(res1);

            PreparedStatement preparedStatement = conn.prepareStatement("select ? from course");
            preparedStatement.setString(1, "*");
            ResultSet res2 = preparedStatement.executeQuery();
            System.out.println(res2);

            state.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}