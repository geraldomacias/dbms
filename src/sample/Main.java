package sample;

import java.sql.Connection;
import java.sql.*;

public class Main {
    public static Connection getConnection() throws SQLException {

        try {
            Class.forName ("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            String url = "jdbc:h2:~/test";
            String user = "USERNAME"; // CHANGE THIS
            String password = "PASSWORD"; // CHANGE THIS

            // create a connection to the database
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (SQLException e) {
            System.out.println(e);
        return null;
    }

    public static void main(String[] args) throws SQLException {
        Connection con = getConnection();
        Statement statement = con.createStatement();

        statement.addBatch("CREATE TABLE IF NOT EXISTS Players(id INTEGER PRIMARY KEY AUTO_INCREMENT, team INTEGER, " +
                "Player_Name TEXT, OutS DOUBLE, OutD DOUBLE, InS DOUBLE, InD DOUBLE, Reb DOUBLE)");

        statement.executeBatch();

    }
}
