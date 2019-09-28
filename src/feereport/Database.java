/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feereport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author manish raypurkar
 */
public class Database {
    
    
    
    
     static final String url = "jdbc:mysql://localhost:3306/FeeReport";
	//String name = "com.mysql.jdbc.Driver";
	static final String user ="Manish";
	static final String pass ="Manish";
     
    Connection con;
Connection establish()
{
   
    try {
          con =DriverManager.getConnection(url,user,pass);
         // System.out.println("connection establish");
     
    }
    catch (SQLException e)
    {
        e.printStackTrace();
       
     
       JOptionPane.showMessageDialog(null,"CHECK YOUR CONNECTION","CONNECTION LOSS..!",JOptionPane.INFORMATION_MESSAGE);
    }
         return con;
    
   
}

    
}
