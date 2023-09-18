package smartcity.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class Signup extends JFrame implements ActionListener
{
    JButton b1,b2;
    JTextField t1,t2,t3,t4;
    Choice c1;
    Signup(){
        setBounds(350,200,900,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0,0,500,450);
        p1.setLayout(null);
        add(p1);
        
        JLabel l1 = new JLabel("Username");
        l1.setFont(new Font ("Tahoma",Font.BOLD,16));
        l1.setBounds(50,50,145,25);
        setLayout(null);
        p1.add(l1);
        
        t1 = new JTextField();
        t1.setBounds(200,50,180,25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);
        
        JLabel l2 = new JLabel("Name");
        l2.setFont(new Font ("Tahoma",Font.BOLD,16));
        l2.setBounds(50,100,145,25);
        setLayout(null);
        p1.add(l2);
        
         t2 = new JTextField();
        t2.setBounds(200,100,180,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2); 
        
        JLabel l3 = new JLabel("Password");
        l3.setFont(new Font ("Tahoma",Font.BOLD,16));
        l3.setBounds(50,150,145,25);
        setLayout(null);
        p1.add(l3);
        
         t3 = new JTextField();
        t3.setBounds(200,150,180,25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t3); 
        
        JLabel l4 = new JLabel("SecurityQuestion");
        l4.setFont(new Font ("Tahoma",Font.BOLD,16));
        l4.setBounds(50,200,145,25);
        setLayout(null);
        p1.add(l4);
        
        c1 = new Choice();
        c1.add("Your nick name");
        c1.add("Your favourite city");
        c1.add("Your favourite sportsperson");
        c1.add("Your birth place");
        c1.setBounds(200,200,210,25);
        p1.add(c1);
        
        JLabel l5 = new JLabel("Answer");
        l5.setFont(new Font ("Tahoma",Font.BOLD,16));
        l5.setBounds(50,250,140,25);
        setLayout(null);
        p1.add(l5);
        
        t4 = new JTextField();
        t4.setBounds(200,250,180,25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t4);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("smartcity/management/system/icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(250,250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l6 = new JLabel(i3);
        setLayout(null);
        l6.setBounds(580,50,250,250);
        add(l6);
        
        b1 = new JButton("Create");
        b1.setFont(new Font("Tahoma", Font.BOLD, 16));
        b1.setBackground(Color.WHITE);
        b1.setForeground(new Color(133,193,233));
        b1.addActionListener(this);
        b1.setBounds(80,300,100,30);
        p1.add(b1);
        
        b2 = new JButton("Back");
        b2.setFont(new Font("Tahoma", Font.BOLD, 16));
        b2.setBackground(Color.WHITE);
        b2.setForeground(new Color(133,193,233));
        b2.addActionListener(this);
        b2.setBounds(250,300,100,30);
        p1.add(b2); 
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
          String Username = t1.getText();
          String Name = t2.getText();
          String Password = t3.getText(); 
          String SecurityQuestion = c1.getSelectedItem();
          String Answer = t4.getText();
          
          String query = "insert into account values('"+Username+"','"+Name+"','"+Password+"','"+SecurityQuestion+"','"+Answer+"')";
          try{
            Conn c = new Conn();
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Account created successfully");
            new Login().setVisible(true);
            this.setVisible(false);
            
          }catch(HeadlessException | SQLException e)
          {
             
              
          }
        }
        else if(ae.getSource() == b2)
        {
          new Login().setVisible(true);
          this.setVisible(false);
         
           
        }
    }
    
    
    
    
    public static void main(String[] args)
    {
        new Signup().setVisible(true);
    }
}
