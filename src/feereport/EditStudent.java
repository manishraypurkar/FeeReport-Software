
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
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class EditStudent extends JFrame implements ActionListener{
 
    
    
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
    
    
    
    JButton load =new JButton("Load Record");
    JButton update =new JButton("UPDATE");
    
     
    JLabel img =new JLabel(new ImageIcon("E:\\back48.png"));
    
    JLabel head =new JLabel("ADD STUDENT");
    
    JSeparator sep=new JSeparator() ;
    
     EditStudent()
    {
        
         p.setLayout(null);
         
         
         sep.setBounds(200,90,800,30);
        
        roll.setBounds(300,5,200,80);
        name.setBounds(300,100,200,80);
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
        
        
        iproll.setBounds(500,10,300,50);
        ipname.setBounds(500,110,300,50);
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
        
        
        update.setBounds(860,450,200,60);
        load.setBounds(860,10,200,60);
        
        img.setBounds(30,0,60,40);

        head.setBounds(450,0,400,50);
        
       // head.setFont(new Font ("Arial",Font.BOLD,30));
        head.setFont(new Font ("Arial",Font.BOLD,25));
        
        roll.setFont(new Font ("Arial",Font.BOLD,25));
        name.setFont(new Font ("Arial",Font.BOLD,25));
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
        
        update.setFont(new Font ("Arial",Font.BOLD,25));
        
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
        
        update.setFont(new Font ("Arial",Font.BOLD,25));
        update.setBackground(Color.BLACK);
        update.setForeground(Color.ORANGE);
        
        load.setFont(new Font ("Arial",Font.BOLD,25));
        load.setBackground(Color.BLACK);
        load.setForeground(Color.ORANGE);
        
        
       sep.setFont(new Font ("Arial",Font.BOLD,20));
       sep.setForeground(Color.BLACK);


        
        
          p.add(update);
          p.add(load);
        
        p.add(img);
        
       // p.add(head);

        
         p.add(sep);

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
        
        
        
        
        
        
        setTitle("Edit Student");
        setLocation(350,50);
        setSize(1200,1000);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
             
        img.addMouseListener(new MouseAdapter(){ 
            
            public void mouseClicked(MouseEvent me)
    {
        Accountant a = new Accountant();
        a.setVisible(true);
        dispose();
    }}); 
        
        
        
        load.addActionListener(this);
        update.addActionListener(this);
        
        
    }
     
     
     public void actionPerformed(ActionEvent e){
            
         
    Database obj=new Database();
    Connection con=null;
    ResultSet rs;
    con= obj.establish();
       
    String qload ="select * from student where rollno ="+iproll.getText()+";";
         
         
         String s =e.getActionCommand();
         
         if(s.equalsIgnoreCase("load record"))
         {
             if(!iproll.getText().isEmpty() )
             {
                 
               try{
                Statement st =con.createStatement();
                rs=  st.executeQuery(qload);
                
                if(rs.next())
                {
                    ipname.setText(rs.getString(1));
                    ipmail.setText(rs.getString(3));
                    ipcourse.setText(rs.getString(4));
                    ipfee.setText(rs.getString(5));
                    ipfeepaid.setText(rs.getString(6));
                    ipfeedue.setText(rs.getString(7));
                    ipaddress.setText(rs.getString(8));
                    ipcity.setText(rs.getString(9));
                    ipstate.setText(rs.getString(10));
                    ipcon.setText(rs.getString(11));
                    ipcontact.setText(rs.getString(12));
                   
                }
                else{
                            JOptionPane.showMessageDialog(null,"ROLL NO IS NOT FOUNDED","NOT FOUND!",JOptionPane.INFORMATION_MESSAGE );
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
             JOptionPane.showMessageDialog(null,"PLEASE ENTER ROLL NO FIRST TO LOAD RECORD..!","REQUIRED",JOptionPane.INFORMATION_MESSAGE);
   
             }
   
         }
         else if (s.equalsIgnoreCase("update")){
             
  String query ="update student SET name='"+ipname.getText()+"',email='"+ipmail.getText()+"',fee='"+ipfee.getText()+"',feepaid='"+ipfeepaid.getText()+"',feedue='"+ipfeedue.getText()+"',address='"+ipaddress.getText()+"',city='"+ipcity.getText()+"',state='"+ipstate.getText()+"',country='"+ipcon.getText()+"',contact='"+ipcontact.getText() +"'where rollno="+iproll.getText()+";";

             
             
             
             
                          if(!ipname.getText().isEmpty() && !iproll.getText().isEmpty() && !ipmail.getText().isEmpty() && !ipfee.getText().isEmpty() && !ipfeepaid.getText().isEmpty ()&& !ipfeedue.getText().isEmpty() && !ipcourse.getText().isEmpty() && !ipaddress.getText().isEmpty() && !ipcity.getText().isEmpty() && !ipstate.getText().isEmpty() && !ipcon.getText().isEmpty() && !ipcontact.getText().isEmpty())
                          {
                              
                              
                              
                      try {
               
                             Statement st =con.createStatement();
            
                             int x=st.executeUpdate(query);
                                if(x>0)
                                {
                                     System.out.println("record is UPDATED successfully");
                                     JOptionPane.showMessageDialog(null,"RECORD UPDATED SUCCEESSFULLY","UPDATED..!",JOptionPane.INFORMATION_MESSAGE );
                                     
                                     
                                }
                                else
                                {
                                     System.out.println("record is NOT UPDATED successfully");
                                     JOptionPane.showMessageDialog(null,"RECORD NOT UPDATED SUCCEESSFULLY, ROLL NO IS REQUIRED TO BE EXIST","NOT UPDATED..!",JOptionPane.INFORMATION_MESSAGE );
                                }
               
               
                           }
           
                      catch(SQLException ex)
                      {
                                 ex.printStackTrace();
                    JOptionPane.showMessageDialog(null,"ENTER VALID DATA INPUT  ..!","INVALID DATA",JOptionPane.INFORMATION_MESSAGE );

                                 
                         }
                              
                          }
                          else
                          {
                            JOptionPane.showMessageDialog(null,"PLEASE FILL ALL DATA FIRST..!","REQUIRED",JOptionPane.INFORMATION_MESSAGE);

                          }
             }
     }
    
}
