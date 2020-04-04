package com.micropro.factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static Connection con=null;
    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error Message : "+e.getMessage());
        }

    }

    public static Connection getConnection() {
        return con;
    }
}
