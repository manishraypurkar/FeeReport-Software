/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feereport;

import java.awt.Color;
import java.awt.Font;
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

/** 
 *
 * @author manish raypurkar 
 */
public class Admin extends JFrame implements ActionListener{
     JPanel p=new JPanel();
    
    JLabel head =new JLabel("ADMIN HOME");
    
    JButton add =new JButton("Add Accountant");
    JButton view =new JButton("View Accountant");
    JButton log =new JButton("Logout");
      
   JLabel back =new JLabel(new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\FeeReport\\blur-close-up-computer-keyboard-459737.jpg"));

    
    
    Admin()
    {
        p.setLayout(null);
        
                back.setBounds(0,0,1200,1000);

        
         head.setBounds(520,100,200,80);
         add.setBounds(500,250,200,80);
         view.setBounds(500,400,200,80);
         log.setBounds(500,550,200,80);
         
        head.setFont(new Font ("Arial",Font.BOLD,30));
         
        add.setFont(new Font ("Arial",Font.BOLD,20));
        view.setFont(new Font ("Arial",Font.BOLD,20));
        log.setFont(new Font ("Arial",Font.BOLD,20));
        
        head.setForeground(Color.ORANGE);
        
        add.setBackground(Color.LIGHT_GRAY);
        view.setBackground(Color.LIGHT_GRAY);
        log.setBackground(Color.LIGHT_GRAY);



        
         p.add(add);
         p.add(view);
         p.add(log);
         p.add(head);
          p.add(back);

         
        add(p); 
        setTitle("Admin Home");
        setLocation(350,50);
        setSize(1200,1000);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add.addActionListener(this);
        view.addActionListener(this);
        log.addActionListener(this);
        
    }
     public void actionPerformed(ActionEvent e) 
    {
        
    
        String s=e.getActionCommand();
        
        if(s.equalsIgnoreCase("add accountant"))
        {
            AddAccountant a =new AddAccountant();
            a.setVisible(true);
            dispose();
            
           
            
        }
        else if(s.equalsIgnoreCase("view accountant"))
        {
            
            ViewAccountant v =new ViewAccountant();
             v.setVisible(true);
             dispose();
             v.action();
            
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


   
    
    

