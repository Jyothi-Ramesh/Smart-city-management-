
package smartcity.management.system;
   
import javax.swing.*;
import java.awt.*;
  


public class PharmacyStores extends JFrame {
    
    PharmacyStores()
    {
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(500 , 300 , 1000,400);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(120,56,78,93));
        p1.setBounds(0 , 0 , 400 , 500);
        p1.setLayout(null);
        add(p1);
        
        
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("smartcity/management/system/icons/Pharma.jpg"));
    Image i2 = i1.getImage().getScaledInstance( 400, 400, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel l1 =  new JLabel(i3);
    l1.setBounds(0, 0 , 400 , 400);
    p1.add(l1);
    
        
    JPanel p2 = new JPanel();
    p2.setLayout(null);
    p2.setBounds( 400,0,4500,3000);
    p2.setBackground(new Color(0,0,10));
    add(p2);
    
    
    
    
    JLabel l2 = new JLabel("LIST OF PHARMACY STORES IN BENGALURU ");
    l2.setBounds( 20 , 20 ,3000 , 25);
    l2.setFont(new Font("SAN_SERIF", Font.HANGING_BASELINE,25));
    l2.setForeground(Color.WHITE);
    p2.add(l2);
    
    JLabel l3 = new JLabel("Apollo Pharmacy");
    l3.setBounds( 60 ,60 , 700 , 45);
    l3.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE,20));
    l3.setForeground(Color.WHITE);
    p2.add(l3);
    
    JButton b1 = new JButton("view more");
    b1.setBounds( 60, 100 ,100 ,25);
    b1.setBackground(new Color(133, 193, 233));
    b1.setForeground(Color.BLACK);
    b1.setBorder(BorderFactory.createEmptyBorder());
    p2.add(b1);
    
    
    JLabel l4 = new JLabel(" Maruthi Pharmacy");
    l4.setBounds(60 , 60 , 1500 ,175);
    l4.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE,20));
    l4.setForeground(Color.WHITE);
    p2.add(l4);
    
    JButton b2 = new JButton("view more");
    b2.setBounds( 60, 165 ,100 ,25);
    b2.setBackground(new Color(133, 193, 233));
    b2.setForeground(Color.BLACK);
    b2.setBorder(BorderFactory.createEmptyBorder());
    p2.add(b2);

   
    
     JLabel l5 = new JLabel("Garuda Pharma");
    l5.setBounds(60 , 60 , 2500 ,305);
    l5.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE,20));
    l5.setForeground(Color.WHITE);
    p2.add(l5);
    
     JButton b3 = new JButton("view more");
    b3.setBounds( 60, 230 ,100 ,25);
    b3.setBackground(new Color(133, 193, 233));
    b3.setForeground(Color.BLACK);
    b3.setBorder(BorderFactory.createEmptyBorder());
    p2.add(b3);
    
     JLabel l6 = new JLabel("MedPlus Pharmacy");
    l6.setBounds(60 , 60 ,4500 ,435);
    l6.setFont(new Font("SAN_SERIF", Font.ROMAN_BASELINE,20));
    l6.setForeground(Color.WHITE);
    p2.add(l6);
    
     JButton b4 = new JButton("view more");
    b4.setBounds( 60, 295 ,100 ,25);
    b4.setBackground(new Color(133, 193, 233));
    b4.setForeground(Color.BLACK);
    b4.setBorder(BorderFactory.createEmptyBorder());
    p2.add(b4);

    setVisible(true);
        
    }
    
    public static void main(String args[])
    {
        new PharmacyStores().setVisible(true);
    }
    
}
