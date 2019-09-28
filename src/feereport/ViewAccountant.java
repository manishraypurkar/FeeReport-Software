/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feereport;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Admin
 */
public class ViewAccountant extends JFrame {
    
 
    JPanel p =new JPanel();
    JLabel img =new JLabel(new ImageIcon("E:\\back48.png"));  
    JLabel head =new JLabel("VIEW ACCOUNTANT"); 

    public ViewAccountant() 
    {
      p.setLayout(null);
        
        img.setBounds(40,20,60,40);

        head.setBounds(450,20,400,50);
        head.setFont(new Font ("Arial",Font.BOLD,25));
        
        head.setForeground(Color.ORANGE);
                
                
        p.add(img);
        
       p.add(head);
       add(p);   
        
        
        
         setTitle("View Accountant");
        setLocation(350,50);
        setSize(1200,1000);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
             
        img.addMouseListener(new MouseAdapter(){ 
            
            public void mouseClicked(MouseEvent me)
    {
        Admin a = new Admin();
        a.setVisible(true);
        dispose();
    }}); 
        
        
       
        
    }
    
    
     public void action()
    {
    
            Database obj=new Database();
            Connection con=null;
            ResultSet rs;
            con= obj.establish();
            
            String query= "select * from accountant;";
           


    
            try{
                Statement st =con.createStatement();
                rs =st.executeQuery(query);
                
                
                JTable t =new JTable();
                
                t.setModel(new DefaultTableModel(
                 new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}

            },
            new String [] {
               "Accountant id","Name","password","email","contact"
            }));
                
        
                                    t.setFont(new Font ("Arial",Font.BOLD,20));
                                    t.setEnabled(false);
                                    t.setBounds(0,120,1200,1050);
                t.setModel(DbUtils.resultSetToTableModel(rs));
                JTableHeader header= t.getTableHeader();
                header.setBounds(0,70,1200,50);
                header.setFont(new Font ("Arial",Font.BOLD,20));


                p.add(header);
                p.add(t);
               
              }
            
            catch(SQLException e)
            {
                e.printStackTrace();
                
            }
    
    
    
    
    
    
    
    }  

  
}
