package sk.itsovy.kutka.server.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TEST {
    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/moviedatabase?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String pass = "Mdngrjmgf951159-";

        try {

            System.out.println("Connecting to database: " + jdbcUrl);
            Connection connection = DriverManager.getConnection(jdbcUrl, user, pass);
            System.out.println("Connection successful!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
