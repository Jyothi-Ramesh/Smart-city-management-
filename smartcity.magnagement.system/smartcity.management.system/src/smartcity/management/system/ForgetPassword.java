package smartcity.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.*;

public class ForgetPassword extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;
    
    
   
    ForgetPassword(){
       setBounds(400,200,850,400); 
       getContentPane().setBackground(Color.WHITE);
      setLayout(null);
      
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("smartcity/management/system/icons/forgotpassword.jpg"));
      Image i2 = i1.getImage().getScaledInstance(250,300, Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel l6 = new JLabel(i3);
        setLayout(null);
        l6.setBounds(580,70,200,200);
        add(l6);
        
        JPanel p = new JPanel();
        //p.setBackground(new Color(133,193,233));
        p.setBounds(30,30,500,300);
        p.setLayout(null);
        add(p);
        
        JLabel l1 = new JLabel("Username");
        l1.setFont(new Font ("Tahoma",Font.BOLD,16));
        l1.setBounds(50,30,145,25);
        setLayout(null);
        p.add(l1);
        
        t1 = new JTextField();
        t1.setBounds(200,30,150,25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p.add(t1);
        
        b1 = new JButton("Search");
        b1.setFont(new Font("Tahoma", Font.BOLD, 16));
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.setBounds(380,30,100,25);
        p.add(b1);
        
        
        JLabel l2 = new JLabel("Name");
        l2.setFont(new Font ("Tahoma",Font.BOLD,16));
        l2.setBounds(50,80,145,25);
        setLayout(null);
        p.add(l2);
        
         t2 = new JTextField();
        t2.setBounds(200,80,150,25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p.add(t2); 
        
        JLabel l3 = new JLabel("SecurityQuestion");
        l3.setFont(new Font ("Tahoma",Font.BOLD,16));
        l3.setBounds(50,130,145,25);
        setLayout(null);
        p.add(l3);
        
        t3 = new JTextField();
        t3.setBounds(200,130,200,25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p.add(t3); 
        
        
        
        JLabel l4 = new JLabel("Answer");
        l4.setFont(new Font ("Tahoma",Font.BOLD,16));
        l4.setBounds(50,180,145,25);
        setLayout(null);
        p.add(l4);
        
        t4 = new JTextField();
        t4.setBounds(200,180,150,25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p.add(t4);
        
        b2 = new JButton("Retrive");
        b2.setFont(new Font("Tahoma", Font.BOLD, 16));
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        b2.setBounds(380,180,100,25);
        p.add(b2);
        
         JLabel l5 = new JLabel("Password");
        l5.setFont(new Font ("Tahoma",Font.BOLD,16));
        l5.setBounds(50,230,140,25);
        setLayout(null);
        p.add(l5);
        
         t5 = new JTextField();
        t5.setBounds(200,230,150,25);
        t5.setBorder(BorderFactory.createEmptyBorder());
        p.add(t5);
        
        b3 = new JButton("Back");
        b3.setFont(new Font("Tahoma", Font.BOLD, 16));
        b3.setBackground(Color.GRAY);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        b3.setBounds(130,270,100,25);
        p.add(b3);
        
        
    }  
        
    
    @Override
      public void actionPerformed(ActionEvent ae)
    {  
        Conn c = new Conn();
        if(ae.getSource() == b1)
        {
            try{
                
            
          String sql = "select * from account where Username = '"+t1.getText()+"'";
          ResultSet rs = c.s.executeQuery(sql);
          while(rs.next()){
              t2.setText(rs.getString("Name"));
              t3.setText(rs.getString("SecurityQuestion"));
          }
            }catch(SQLException e){
                
            }
        }
        else if(ae.getSource() == b2)
        {
         try{
                
            
          String sql = "select * from account where Answer = '"+t4.getText()+"' AND Username = '"+t1.getText()+"'";
          ResultSet rs = c.s.executeQuery(sql);
          while(rs.next()){
              t2.setText(rs.getString("Name"));
              t5.setText(rs.getString("Password"));
          }
            }catch(SQLException e){
                
            } 
           
        }else if(ae.getSource() == b3){
          this.setVisible(false);
           new Login().setVisible(true);  
        }
    }
        
    
    public static void main(String[] args)
    {
        new ForgetPassword().setVisible(true);
    }
}
