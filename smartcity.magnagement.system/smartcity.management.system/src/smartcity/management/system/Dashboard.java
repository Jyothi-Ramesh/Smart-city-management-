package smartcity.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
   
    JButton b1,b2,b3,b4,b5,b6,b7;
    Dashboard()
    {
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    setLayout(null);
    
    JPanel p1 = new JPanel();
    p1.setLayout(null);
    p1.setBounds(0,0,1950,65);
    p1.setBackground(new Color(0,0,102));
    add(p1);    
    
    ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("smartcity/management/system/icons/newcustomer.jpg"));
    Image i5=i4.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
    ImageIcon i6 = new ImageIcon(i5);
    JLabel l2 = new JLabel(i6);
    l2.setBounds(0,0,70,70);
    p1.add(l2);
    
    JLabel l3 = new JLabel("WELCOME TO SMART CITY DASHBOARD");
    l3.setFont(new Font("Tahoma",Font.BOLD,30));
    l3.setForeground(Color.WHITE);
    l3.setBounds(80,10,33000,40);
    p1.add(l3);
    
    JPanel p2 = new JPanel();
    p2.setLayout(null);
    p2.setBounds(0,65,300,1000);
    p2.setBackground(new Color(0,0,102));
    add(p2); 
    ////////////////////////////////////////////////////////////////////////
    b1 = new JButton("Hospital services");
    b1.setBackground(new Color(0,0,102));
    b1.setFont(new Font("Tahoma",Font.PLAIN,20));
    b1.setForeground(Color.WHITE);
    b1.addActionListener(this);
    b1.setBounds(0,0,300,90);
    p2.add(b1);
    
    
    b2 = new JButton("Grocery services");
    b2.setBackground(new Color(0,0,103));
    b2.setFont(new Font("Tahoma",Font.PLAIN,20));
    b2.setForeground(Color.WHITE);
    b2.addActionListener(this);
    b2.setBounds(0,100,300,90);
    p2.add(b2);
    
    b3 = new JButton("School services");
    b3.setBackground(new Color(0,0,104));
    b3.setFont(new Font("Tahoma",Font.PLAIN,20));
    b3.setForeground(Color.WHITE);
    b3.addActionListener(this);
    b3.setBounds(0,200,300,90);
    p2.add(b3);
    
    b4 = new JButton("Pharmacy List");
    b4.setBackground(new Color(0,0,102));
    b4.setFont(new Font("Tahoma",Font.PLAIN,20));
    b4.setForeground(Color.WHITE);
    b4.addActionListener(this);
    b4.setBounds(0,300,300,90);
    p2.add(b4);
    
    b5 = new JButton("Library services");
    b5.setBackground(new Color(0,0,102));
    b5.setFont(new Font("Tahoma",Font.PLAIN,20));
    b5.setForeground(Color.WHITE);
    b5.setBounds(0,400,300,90);
    p2.add(b5);
    
    b6 = new JButton("Job services");
    b6.setBackground(new Color(0,0,102));
    b6.setFont(new Font("Tahoma",Font.PLAIN,20));
    b6.setForeground(Color.WHITE);
    b6.setBounds(0,500,300,90);
    p2.add(b6);
    
    b7 = new JButton("Travel services");
    b7.setBackground(new Color(0,0,102));
    b7.setFont(new Font("Tahoma",Font.PLAIN,20));
    b7.setForeground(Color.WHITE);
    b7.setBounds(0,600,300,90);
    p2.add(b7);
    
    
    ///////////////////////////////////////////////////////////////////////////
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("smartcity/management/system/icons/lgscreen.jpg"));
    Image i2=i1.getImage().getScaledInstance(1950,1000,Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel l1 = new JLabel(i3);
    l1.setBounds(0,0,1950,1000);
    add(l1);
    
    setVisible(true);
    }
    
     @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
            new HServices().setVisible(true);
        }
        else if(ae.getSource() == b2)
        {
          new GServices().setVisible(true);
        }
        else if(ae.getSource() == b3)
        {
          new SchoolsList().setVisible(true);
        }
        else if(ae.getSource() == b4)
        {
          new PharmacyStores().setVisible(true);
        }
        
    }
    public static void main(String[] args)
    {
        Dashboard d = new Dashboard();
    }
}