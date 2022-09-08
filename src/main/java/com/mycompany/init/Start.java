package com.mycompany.init;

import com.mycompany.connection.ConnectorDB;
import java.sql.SQLException;

/**
 *
 * @author didac
 */
public class Start {

    public static void main(String[] args) throws SQLException {
        ConnectorDB con = new ConnectorDB();
    }
}
