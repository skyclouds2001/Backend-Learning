package jdbc_learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc {
    public static void main (String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/csy";
            String user = "root";
            String password = "root123456";
            Connection conn = DriverManager.getConnection(url, user, password);

            String sql = "select * from course";
            Statement state = conn.createStatement();

            ResultSet res = state.executeQuery(sql);
            System.out.println(res);

            state.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
