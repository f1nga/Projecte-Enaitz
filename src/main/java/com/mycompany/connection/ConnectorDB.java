package com.mycompany.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectorDB {
    private Connection con;
    
    public ConnectorDB() {
        connectarBaseDades();
    }
    
    void connectarBaseDades() {
        con = null;
        String url = "jdbc:mysql://localhost:3306/carrera_espacial?autoReconnect=true&useSSL=false";
        String usuari = "root";
        String password = "o4f7g9k66";
        
        try {
            con = (Connection) DriverManager.getConnection(url, usuari, password);
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
