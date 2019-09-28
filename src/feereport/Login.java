/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feereport;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Admin
 */
public class Login extends JFrame  implements ActionListener
{
    JPanel p=new JPanel();
    JLabel type=new JLabel ("Select Type :");
    JLabel username=new JLabel ("Username :");
    JLabel pass=new JLabel ("Password :");
    
    JTextField ipuser=new JTextField();
    JPasswordField ippass=new JPasswordField();
    
    JButton login =new JButton(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\FeeReport\\login2.png"));
    
    Vector v =new Vector();
    JComboBox select =new JComboBox(v);
    
    JLabel back =new JLabel(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\FeeReport\\art-artist-black-and-white-265047.jpg"));

    JLabel info =new JLabel(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\FeeReport\\icon.png"));
    
    JLabel head =new JLabel("FEE REPORT SOFTWARE");
    
   JLabel me =new JLabel("@DESIGNED & DEVELOPED BY MANISH ANIL RAYPURKAR");

    
    
    Login()
    {   p.setLayout(null);
              
         info.setBounds(900,60,200,70);
         me.setBounds(400,850,400,60);

        back.setBounds(0,0,1200,1000);
        head.setBounds(450,100,400,100);
        
        type.setBounds(350,250,200, 100);
        username.setBounds(350,350,200, 100);
        pass.setBounds(350,450,200, 100);
        
        
        select.setBounds(500,280,300,50);
        ipuser.setBounds(500,380,300,50);
        ippass.setBounds(500,480,300,50);
        
        login.setBounds(580,580,80,50);

       
       me.setFont(new Font ("",Font.BOLD,14)); 
      // me.setForeground(Color.BLACK);

       head.setFont(new Font ("Arial",Font.BOLD,30)); 
       type.setFont(new Font ("Arial",Font.BOLD,20));
       username.setFont(new Font ("Arial",Font.BOLD,20));
       pass.setFont(new Font ("Arial",Font.BOLD,20));
       select.setFont(new Font ("Arial",Font.BOLD,20));
       ipuser.setFont(new Font ("Arial",Font.BOLD,20));
       ippass.setFont(new Font ("Arial",Font.BOLD,20));

       head.setForeground(Color.ORANGE);
        
        
        
        
        v.add(0,"admin");
        v.add(1,"Accountant");
       
        
         p.add(me);

        p.add(head);
        p.add(login);
        p.add(select);
        p.add(ipuser);
        p.add(ippass);
        p.add(username);
        p.add(pass);
        p.add(type);
        
        p.add(info);

        p.add(back);

        add(p);
        
        setTitle("Login");
        setLocation(350,50);
        setSize(1200,1000);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
        
         info.addMouseListener(new MouseAdapter() {
           
            public void mouseClicked(MouseEvent me)
            {
                JOptionPane.showMessageDialog(null,"DESIGNED AND DEVELOPED BY MANISH ANIL RAYPURKAR","DEVELOPER",JOptionPane.INFORMATION_MESSAGE);
                
            }

        });
       
        
        
        
        
       login .addActionListener(this);

    }
   
   
    public void actionPerformed(ActionEvent e)
    {
         
    Database obj=new Database();
    Connection con=null;
    ResultSet rs;
    con= obj.establish();
     
    String s= e.getActionCommand();
    Object o=select.getSelectedItem();
    
             if(!ipuser.getText().isEmpty() && !ippass.getText().isEmpty() && select.getSelectedItem()!=null )
             {  
    
    if(o.equals("admin") )
    {  
         String query ="select username ,password from admin where aid =1;" ;   

     try
     {
         
     Statement stmt=con.createStatement();
     rs=stmt.executeQuery(query);
     String x= ipuser.getText();
     String y=ippass.getText();
     
     
     while(rs.next()){
    
         if(x.equalsIgnoreCase(rs.getString(1)) &&  y.equals(rs.getString(2)) )
         {
                     Admin  a =new Admin();
                       a.setVisible(true);
                         dispose();
                    System.out.println("login successfully");
      }
        
          else  
         {
              System.out.println("wrong credentials");
              
      JOptionPane.showMessageDialog(null,"Wrong Password / Username","wrong data",JOptionPane.INFORMATION_MESSAGE);
ipuser.setText("");
ippass.setText("");
username.requestFocus();
      }
        
     }
     
     
     }catch(SQLException ex){
         
         ex.printStackTrace();
     }
            
}
    else{
                String query ="select username ,password from accountant where username ='"+ipuser.getText()+"';";   
               // "select * from userid WHERE pass = '" + id +  "' AND pwd = '" + pwd + "'"; 

        try
     {
         
     Statement stmt=con.createStatement();
     rs=stmt.executeQuery(query);
     String x= ipuser.getText();
     String y=ippass.getText();
     
     if(rs.next())
     {
    
         if(x.equalsIgnoreCase(rs.getString(1)) &&  y.equals(rs.getString(2)) )
         {
                     Accountant  a =new Accountant();
                       a.setVisible(true);
                         dispose();
                    System.out.println("login successfully");
           }      
     }
     else
             {
                        System.out.println("wrong credentials");
              
                        JOptionPane.showMessageDialog(null,"Wrong Password / Username","wrong data",JOptionPane.INFORMATION_MESSAGE);
                        ipuser.setText("");
                        ippass.setText("");
                        username.requestFocus();
            }
           
     
     }catch(SQLException ex){
         
         ex.printStackTrace();
     }

       }
    }
             else
             {
           JOptionPane.showMessageDialog(null,"PLEASE FILL ALL DATA FIRST..!","REQUIRED",JOptionPane.INFORMATION_MESSAGE);

             }
    }
    
}