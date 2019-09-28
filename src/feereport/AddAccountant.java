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
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author manish raypurkar
 */
public class AddAccountant extends JFrame implements ActionListener{
    
    JPanel p=new JPanel();
        
    JLabel id=new JLabel ("Accountant id :");
    JLabel name=new JLabel ("Name :");
    JLabel pass=new JLabel ("Password :");
    JLabel email=new JLabel ("email :");
    JLabel contact=new JLabel ("contact No :");
    
    JTextField ipname=new JTextField();
    JTextField ipid=new JTextField();
    JPasswordField ippass=new JPasswordField();
    JTextField ipmail=new JTextField();
    JTextField ipcontact=new JTextField(); 
    
    JButton add =new JButton("ADD");
    
    
    JLabel img =new JLabel(new ImageIcon("E:\\back48.png"));
    
    JLabel head =new JLabel("ADD ACCOUNTANT");



    public AddAccountant()  {
        
        p.setLayout(null);
                
        id.setBounds(300,300,200,100);
        name.setBounds(300,400,200,100);
        pass.setBounds(300,500,200,100);
        email.setBounds(300,600,200,100);
        contact.setBounds(300,700,200,100);
        
        ipid.setBounds(500,320,300,50);
        ipname.setBounds(500,420,300,50);
        ippass.setBounds(500,520,300,50);
        ipmail.setBounds(500,620,300,50);
        ipcontact.setBounds(500,720,300,50);
        
        add.setBounds(480,850,150,50);
        
        img.setBounds(30,100,60,40);

        head.setBounds(450,100,400,100);
        
        head.setFont(new Font ("Arial",Font.BOLD,30)); 
        head.setForeground(Color.ORANGE);
        
        add.setFont(new Font ("Arial",Font.BOLD,30)); 
        
        id.setFont(new Font ("Arial",Font.BOLD,25)); 
        name.setFont(new Font ("Arial",Font.BOLD,25)); 
        pass.setFont(new Font ("Arial",Font.BOLD,25)); 
        email.setFont(new Font ("Arial",Font.BOLD,25)); 
        contact.setFont(new Font ("Arial",Font.BOLD,25)); 
        ipid.setFont(new Font ("Arial",Font.BOLD,25)); 
        ipname.setFont(new Font ("Arial",Font.BOLD,25)); 
        ippass.setFont(new Font ("Arial",Font.BOLD,25)); 
        ipmail.setFont(new Font ("Arial",Font.BOLD,25)); 
        ipcontact.setFont(new Font ("Arial",Font.BOLD,25)); 


        
        p.add(add);
        
        p.add(img);
        
        p.add(head);

        
        p.add(id);
        p.add(name);
        p.add(pass);
        p.add(email);
        p.add(contact);
        p.add(ipid);
        p.add(ipname);
        p.add(ippass);
        p.add(ipmail);
        p.add(ipcontact);
        add(p);
        
        
         setTitle("Add Accountant");
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
      
        add.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
    
            Database obj=new Database();
            Connection con=null;
            ResultSet rs;
            con= obj.establish();
          String query ="insert into accountant (username,password,aid,email,contact) values('"+ ipname.getText()+ "','" + ippass.getText() + "','" + ipid.getText()+ "','" + ipmail.getText() + "','"+ipcontact.getText()+"')";
            
          
                      if(!ipid.getText().isEmpty() && !ipname.getText().isEmpty() && !ippass.getText().isEmpty() && !ipmail.getText().isEmpty() && !ipcontact.getText().isEmpty ())
                      {
          try{
                Statement st =con.createStatement();
                
              int x=  st.executeUpdate(query);
                if(x>0)
                {
                    JOptionPane.showMessageDialog(null,"RECORD/DATA ADDED SUCCESSFULLY","INSERTED",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
               JOptionPane.showMessageDialog(null,"RECORD/DATA NOT ADDED SUCCESSFULLY","NOT INSERTED",JOptionPane.INFORMATION_MESSAGE);
   
                }
            }
        catch(SQLException ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null," ACCOUNTANT ID IS ALREADY OR ENTER VALID DATA INPUT ","INVALID DATA!",JOptionPane.INFORMATION_MESSAGE );

        }
                      }
                      else
                      {
                           JOptionPane.showMessageDialog(null,"PLEASE FILL ALL DATA FIRST..!","REQUIRED",JOptionPane.INFORMATION_MESSAGE);

                      }
    }
    
    
}
