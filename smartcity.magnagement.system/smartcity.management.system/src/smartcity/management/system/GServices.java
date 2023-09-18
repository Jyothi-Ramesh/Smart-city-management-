package smartcity.management.system;
import javax.swing.*;
import java.awt.*;

public class GServices extends JFrame {
    GServices(){
     setLayout(null);
        setBounds(500,180,800,500);
       getContentPane().setBackground(Color.LIGHT_GRAY);
        
       JPanel p1=new JPanel();
       p1.setBackground(Color.LIGHT_GRAY);
       p1.setBounds(0,75,400,400);
       add(p1);
       
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("smartcity/management/system/icons/gservies.jpg"));
        Image i2= i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        p1.add(l1);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.LIGHT_GRAY);
        p2.setBounds(10,0,800,75);
        add(p2);
        
        JLabel l2=new JLabel("LIST OF GROCERY STORES");
        l2.setBounds(135,10,500,60);
        l2.setFont(new Font(null,Font.BOLD, 35));
        p2.add(l2);
        
       JLabel l3=new JLabel("<html><ul>" +
        "<li>Max Hypermarket India Pvt Ltd (Spar)</li>"+"</ul><html>");
        l3.setBounds(400,75,350,65);
        l3.setFont(new Font(null,Font.ITALIC, 16));
        add(l3);
        
         JButton b1=new JButton("Know more");
         b1.setBounds(440,125,110,30);
         add(b1);
        
         JLabel l4=new JLabel("<html><ul>" +
        "<li>Metro Cash And Carry India Pvt Ltd</li>"+"</ul><html>");
        l4.setBounds(400,145,350,65);
        l4.setFont(new Font(null,Font.ITALIC, 16));
        add(l4);
        
        JButton b2=new JButton("Know more");
         b2.setBounds(440,194,110,30);
         add(b2);
         
          JLabel l5=new JLabel("<html><ul>" +
        "<li>Reliance Fresh supermarket, Moodalapalya</li>"+"</ul><html>");
        l5.setBounds(400,210,550,65);
        l5.setFont(new Font(null,Font.ITALIC, 16));
        add(l5);
        
        JButton b3=new JButton("Know more");
         b3.setBounds(440,260,110,30);
         add(b3);
        
          JLabel l6=new JLabel("<html><ul>" +
        "<li>Loyal City Supermarket,Whitefield</li>"+"</ul><html>");
        l6.setBounds(400,274,350,65);
        l6.setFont(new Font(null,Font.ITALIC, 16));
        add(l6);
        
         JButton b4=new JButton("Know more");
         b4.setBounds(440,324,110,30);
         add(b4);
         
           JLabel l7=new JLabel("<html><ul>" +
        "<li>All Season Supermarket</li>Panathur Main Rd"+"</ul><html>");
        l7.setBounds(400,350,350,65);
        l7.setFont(new Font(null,Font.ITALIC, 16));
        add(l7);
        
          JButton b5=new JButton("Know more");
         b5.setBounds(440,408,110,30);
         add(b5);
         
        setVisible(true);
    }
    public static void main(String[] args){
        new GServices().setVisible(true);
    }
}

