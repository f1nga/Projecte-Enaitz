package com.mycompany.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectorDB {
    public  Connection con;
    
    public ConnectorDB() {
        connectarBaseDades();
    }
    
    public void connectarBaseDades() {
        con = null;
        String url = "jdbc:mysql://localhost:3306/Contactes?autoReconnect=true&useSSL=false";
        String usuari = "root";
        String password = "pass";
        
        try {
            con = (Connection) DriverManager.getConnection(url, usuari, password);
            System.out.println("Conexio correcte!");
        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
     public void setCon(Connection con) {
        this.con = con;
    }
     public Connection getCon() {
        return con;
    }
}
