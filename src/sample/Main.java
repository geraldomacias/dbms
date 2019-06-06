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

        ScriptRunner script = new ScriptRunner(con, true, true);

        //Reader readerSelects =  new FileReader("commands.sql");
        Reader readerInserts = new FileReader("inserts.sql");
        Reader readerCreate = new FileReader("createTables.sql");
        //Reader readerLog = new FileReader("evalLog.sql");
        //Reader readerClearLog = new FileReader("clearLog.sql");

        long start = System.currentTimeMillis();

        //script.runScript(readerClearLog);
        script.runScript(readerCreate);
        script.runScript(readerInserts);
        //script.runScript(readerSelects);
        //script.runScript(readerLog);
        //script.runScript(readerClearLog);

        long end = System.currentTimeMillis();

        float sec = (end - start) / 1000F; System.out.println(sec + " seconds");

        con.close();
    }
}
