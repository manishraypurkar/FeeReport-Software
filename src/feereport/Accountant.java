/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** 
 *
 * @author manish raypurkar 
 */

package feereport;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class Accountant extends JFrame implements ActionListener{
    
    JPanel p =new JPanel();
    
     JLabel head =new JLabel("ACCOUNTANT HOME");
    
    JButton add =new JButton("Add Student");
    JButton view =new JButton("View Student");
    JButton edit =new JButton("Edit Student");
    JButton due=new JButton("Due Fees");
    JButton log =new JButton("Logout");
    
     JLabel back =new JLabel(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\FeeReport\\blur-close-up-computer-keyboard-459737.jpg"));

    
    

    public Accountant() {
        
        p.setLayout(null);
        
                        back.setBounds(0,0,1200,1000);

        
         head.setBounds(420,50,500,80);
         add.setBounds(420,200,300,80);
         view.setBounds(420,350,300,80);
         edit.setBounds(420,500,300,80);
         due.setBounds(420,650,300,80);
         log.setBounds(420,800,300,80);
         
        head.setFont(new Font ("Arial",Font.BOLD,30));
        add.setFont(new Font ("Arial",Font.BOLD,25));
        view.setFont(new Font ("Arial",Font.BOLD,25));
        edit.setFont(new Font ("Arial",Font.BOLD,25));
        due.setFont(new Font ("Arial",Font.BOLD,25));
        log.setFont(new Font ("Arial",Font.BOLD,25));
        
        head.setForeground(Color.ORANGE);
        
        add.setBackground(Color.LIGHT_GRAY);
        view.setBackground(Color.LIGHT_GRAY);
        edit.setBackground(Color.LIGHT_GRAY);
        due.setBackground(Color.LIGHT_GRAY);
        log.setBackground(Color.LIGHT_GRAY);
        
        
        p.add(head);
        p.add(add);
        p.add(view);
        p.add(edit);
        p.add(due);
        p.add(log);
        p.add(back);

        
         add(p); 
        setTitle("Accountant Home");
        setLocation(350,50);
        setSize(1200,1000);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add.addActionListener(this);
        view.addActionListener(this);
        edit.addActionListener(this);
        due.addActionListener(this);
        log.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        
          
    Database obj=new Database();
    Connection con=null;
    ResultSet rs;
    con= obj.establish();
        
        
     
        String s=e.getActionCommand();
        if(s.equalsIgnoreCase("add student"))
        {
            AddStudent a =new AddStudent();
            a.setVisible(true);
            dispose();
        }
        
        else if (s.equalsIgnoreCase("view student"))
        {
           ViewStudent v =new ViewStudent();
            v.setVisible(true);
            dispose(); 
            v.action();
        }
        else if(s.equalsIgnoreCase("edit student"))
        {
           EditStudent es =new EditStudent();
            es.setVisible(true);
            dispose();
        }
        
        else if(s.equalsIgnoreCase("due fees"))
        {
            DueFees d =new DueFees();
            d.setVisible(true);
            dispose();
            d.action();
        }
        else{
            int input = JOptionPane.showConfirmDialog(null," ARE YOU SURE ?","LOGOUT",JOptionPane.OK_OPTION,JOptionPane.INFORMATION_MESSAGE);
                
                       System.out.println(input);
                       
                       if (input==0)
                       {
                          Login l=new Login();
                          l.setVisible(true);
                          dispose(); 
                          
                       }    
           }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }    
    
}
