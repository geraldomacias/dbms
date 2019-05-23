package sample;

import java.io.*;
import java.sql.*;

public class Main {
    public static Connection getConnection() throws SQLException {

        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            String url = "jdbc:h2:~/test";
            String user = "root"; // CHANGE THIS
            String password = "Moka2003"; // CHANGE THIS

            // create a connection to the database
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }

    public static void main (String[] args) throws SQLException, IOException {
        Connection con = getConnection();
        //Statement statement = con.createStatement();

        //statement.execute("INSERT INTO Stats (speed, strength) VALUES (3, 3);");

        ScriptRunner script = new ScriptRunner(con, true, true);

        Reader readerCommands =  new FileReader("commands.sql");
        Reader readerCreate = new FileReader("createTables.sql");

        script.runScript(readerCreate);
        script.runScript(readerCommands);

        con.close();
    }
}
