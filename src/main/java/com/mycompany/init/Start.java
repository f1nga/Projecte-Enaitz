package com.mycompany.init;

import com.mycompany.connection.ConnectorDB;
import com.mycompany.trabajadores.Astronauta;
import java.awt.EventQueue;
import java.sql.SQLException;

/**
 *
 * @author didac
 */
public class Start {

    public static void main(String[] args) throws SQLException {
        //ConnectorDB con = new ConnectorDB();
            //con.connectarBaseDades();  
            
            /*Astronauta a1 = new Astronauta("Joan");
            
            a1.inserirAstronauta(a1.getNom(),"Carrer granota",20,10,0,"militar","data1");*/
                    
            Astronauta a1 = new Astronauta("Joan");
            a1.enviarCoordenades(a1);
    }


    }

