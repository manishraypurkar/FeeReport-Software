/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// admin manish raypurkar

package feereport;

import java.awt.Color;
import java.awt.Font;
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
import javax.swing.JTextField;


public class AddStudent extends JFrame implements ActionListener
        
 {
    JPanel p=new JPanel();
    
    JLabel name=new JLabel ("Name :");
    JLabel roll=new JLabel ("Roll No :");
    JLabel course=new JLabel ("Course :");
    JLabel mail=new JLabel ("Email :");
    JLabel contact=new JLabel ("Contact No :");
    JLabel fee=new JLabel ("Fee :");
    JLabel feepaid=new JLabel ("Fees Paid:");
    JLabel feedue=new JLabel ("Fess Due :");
    JLabel city=new JLabel ("City :");
    JLabel address=new JLabel ("Address :");
    JLabel state=new JLabel ("State :");
    JLabel country=new JLabel ("Country :");
    
    JTextField ipname=new JTextField();
    JTextField iproll=new JTextField();
    JTextField ipmail=new JTextField();
    JTextField ipcontact=new JTextField(); 
    JTextField ipcourse=new JTextField();
    JTextField ipfee=new JTextField();
    JTextField ipfeepaid=new JTextField();
    JTextField ipfeedue=new JTextField();
    JTextField ipaddress=new JTextField();
    JTextField ipstate=new JTextField();
    JTextField ipcon=new JTextField();
    JTextField ipcity=new JTextField();
    
    
    
    JButton add =new JButton("ADD");
    
     
    JLabel img =new JLabel(new ImageIcon("E:\\back48.png"));
    
    JLabel head =new JLabel("ADD STUDENT");
    
    
    
     AddStudent()
    {
         p.setLayout(null);
        
        name.setBounds(300,20,200,80);
        roll.setBounds(300,100,200,80);
        mail.setBounds(300,180,200,80);
        course.setBounds(300,260,200,80);
        fee.setBounds(300,340,200,80);
        feepaid.setBounds(300,420,200,80);
        feedue.setBounds(300,500,200,80);
        address.setBounds(300,580,200,80);
        city.setBounds(300,660,200,80);
        state.setBounds(300,740,200,80);
        country.setBounds(300,820,200,80);
        contact.setBounds(300,900,200,80);
        
        
        ipname.setBounds(500,30,300,50);
        iproll.setBounds(500,110,300,50);
        ipmail.setBounds(500,190,300,50);
        ipcourse.setBounds(500,280,300,50); 
        ipfee.setBounds(500,350,300,50);
        ipfeepaid.setBounds(500,430,300,50);
        ipfeedue.setBounds(500,510,300,50);
        ipaddress.setBounds(500,590,300,50);
        ipcity.setBounds(500,670,300,50);
        ipstate.setBounds(500,750,300,50);
        ipcon.setBounds(500,830,300,50);
        ipcontact.setBounds(500,910,300,50);
        
        
        add.setBounds(860,450,200,60);
        
        img.setBounds(30,0,60,40);

        head.setBounds(450,0,400,50);
        
       // head.setFont(new Font ("Arial",Font.BOLD,30));
        head.setFont(new Font ("Arial",Font.BOLD,25));
        
        name.setFont(new Font ("Arial",Font.BOLD,25));
        roll.setFont(new Font ("Arial",Font.BOLD,25));
        mail.setFont(new Font ("Arial",Font.BOLD,25));
        course.setFont(new Font ("Arial",Font.BOLD,25));
        fee.setFont(new Font ("Arial",Font.BOLD,25));
        feepaid.setFont(new Font ("Arial",Font.BOLD,25));
        feedue.setFont(new Font ("Arial",Font.BOLD,25));
        address.setFont(new Font ("Arial",Font.BOLD,25));
        city.setFont(new Font ("Arial",Font.BOLD,25));
        state.setFont(new Font ("Arial",Font.BOLD,25));
        country.setFont(new Font ("Arial",Font.BOLD,24));
        contact.setFont(new Font ("Arial",Font.BOLD,25));
        add.setFont(new Font ("Arial",Font.BOLD,25));
        
        ipname.setFont(new Font ("Arial",Font.BOLD,25));
        iproll.setFont(new Font ("Arial",Font.BOLD,25));
        ipmail.setFont(new Font ("Arial",Font.BOLD,25));
        ipcourse.setFont(new Font ("Arial",Font.BOLD,25));
        ipfee.setFont(new Font ("Arial",Font.BOLD,25));
        ipfeepaid.setFont(new Font ("Arial",Font.BOLD,25));
        ipfeedue.setFont(new Font ("Arial",Font.BOLD,25));
        ipaddress.setFont(new Font ("Arial",Font.BOLD,25));
        ipcity.setFont(new Font ("Arial",Font.BOLD,25));
        ipstate.setFont(new Font ("Arial",Font.BOLD,25));
        ipcon.setFont(new Font ("Arial",Font.BOLD,25));
        ipcontact.setFont(new Font ("Arial",Font.BOLD,25));
        
        add.setFont(new Font ("Arial",Font.BOLD,25));
        add.setBackground(Color.BLACK);
        add.setForeground(Color.ORANGE);

        
        
          p.add(add);
        
        p.add(img);
        
       // p.add(head);

        
        
        p.add(name);
        p.add(roll);
        p.add(mail);
        p.add(course);
        p.add(fee);
        p.add(feepaid);
        p.add(feedue);
        p.add(address);
        p.add(city);
        p.add(state);
        p.add(country);
        p.add(contact);
        
        p.add(ipname);
        p.add(iproll);
        p.add(ipmail);
        p.add(ipcourse);
        p.add(ipfee);
        p.add(ipfeepaid);
        p.add(ipfeedue);
        p.add(ipaddress);
        p.add(ipcity);
        p.add(ipstate);
        p.add(ipcon);
        p.add(ipcontact);
        add(p);
        
        
        setTitle("Add Student");
        setLocation(350,50);
        setSize(1200,1050);
        //setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        add.addActionListener(this);
             
        img.addMouseListener(new MouseAdapter(){ 
            
            public void mouseClicked(MouseEvent me)
    {
        Accountant a = new Accountant();
        a.setVisible(true);
        dispose();
    }}); 
        
    }
 
      public void actionPerformed(ActionEvent e){
         
         
    Database obj=new Database();
    Connection con=null;
    ResultSet rs;
    con= obj.establish();
         
         
         
    String query ="insert into student (name,rollno,email,course,fee,feepaid,feedue,address,city,state,country,contact) values('"+ ipname.getText()+ "','" + iproll.getText() + "','" + ipmail.getText()+ "','" + ipcourse.getText() + "','"+ipfee.getText()+  "','"+ipfeepaid.getText()+"','"+ipfeedue.getText()+"','"+ipaddress.getText()+"','"+ipcity.getText()+"','"+ipstate.getText()+"','"+ipcon.getText()+"','"+ipcontact.getText()+"')";
         
         
             if(!ipname.getText().isEmpty() && !iproll.getText().isEmpty() && !ipmail.getText().isEmpty() && !ipfee.getText().isEmpty() && !ipfeepaid.getText().isEmpty ()&& !ipfeedue.getText().isEmpty() && !ipcourse.getText().isEmpty() && !ipaddress.getText().isEmpty() && !ipcity.getText().isEmpty() && !ipstate.getText().isEmpty() && !ipcon.getText().isEmpty() && !ipcontact.getText().isEmpty())

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
