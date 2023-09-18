/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package smartcity.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class HServices extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5;
    HServices(){
        setLayout(null);
        setBounds(500,180,800,500);
       getContentPane().setBackground(Color.LIGHT_GRAY);
        
       JPanel p1=new JPanel();
       p1.setBackground(Color.LIGHT_GRAY);
       p1.setBounds(0,75,400,400);
       add(p1);
       
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("smartcity/management/system/icons/hservice.jpeg"));
        Image i2= i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        p1.add(l1);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.LIGHT_GRAY);
        p2.setBounds(10,0,800,75);
        add(p2);
        
        JLabel l2=new JLabel("LIST OF HOSPITALS");
        l2.setBounds(160,10,500,60);
        l2.setFont(new Font(null,Font.BOLD, 50));
        p2.add(l2);
        
        JLabel l3=new JLabel("<html><ul>" +
        "<li>Apollo Hospital (Bannerghatta Road) Bangalore</li>"+"</ul><html>");
        l3.setBounds(400,75,350,65);
        l3.setFont(new Font(null,Font.ITALIC, 16));
        add(l3);
        
         b1=new JButton("Know more");
         b1.setBounds(440,133,110,30);
         b1.addActionListener(this);
         add(b1);
        
         JLabel l4=new JLabel("<html><ul>" +
        "<li>Fortis hospital, Bangalore (Rajajinagar)</li>"+"</ul><html>");
        l4.setBounds(400,147,350,65);
        l4.setFont(new Font(null,Font.ITALIC, 16));
        add(l4);
        
        b2=new JButton("Know more");
         b2.setBounds(440,195,110,30);
         b2.addActionListener(this);

         add(b2);
         
          JLabel l5=new JLabel("<html><ul>" +
        "<li>Columbia Asia Hospital,Bangalore(Whitefield)</li>"+"</ul><html>");
        l5.setBounds(400,210,550,65);
        l5.setFont(new Font(null,Font.ITALIC, 16));
        add(l5);
        
         b3=new JButton("Know more");
         b3.setBounds(440,260,110,30);
         b3.addActionListener(this);

         add(b3);
        
          JLabel l6=new JLabel("<html><ul>" +
        "<li>Manipal Hospital (Old Airport Road) Bangalore</li>"+"</ul><html>");
        l6.setBounds(400,285,350,65);
        l6.setFont(new Font(null,Font.ITALIC, 16));
        add(l6);
        
         b4=new JButton("Know more");
         b4.setBounds(440,345,110,30);
         b4.addActionListener(this);

         add(b4);
         
           JLabel l7=new JLabel("<html><ul>" +
        "<li>Aster CMI Hospital, Sahakara Nagar</li>"+"</ul><html>");
        l7.setBounds(400,360,350,65);
        l7.setFont(new Font(null,Font.ITALIC, 16));
        add(l7);
        
         b5=new JButton("Know more");
         b5.setBounds(440,410,110,30);
         b5.addActionListener(this);

         add(b5);
         
        setVisible(true);
    }
    
   public void actionPerformed(ActionEvent ae)
    {
      if(ae.getSource() == b1)
        {
            this.setVisible(false);
            new Knowmore1().setVisible(true);
        }
      else if(ae.getSource() == b2)
        {
            this.setVisible(false);
            new Knowmore2().setVisible(true);
        }
      else if(ae.getSource() == b3)
        {
            this.setVisible(false);
            new Knowmore3().setVisible(true);
        }
      else if(ae.getSource() == b4)
        {
            this.setVisible(false);
            new Knowmore4().setVisible(true);
        }
      else if(ae.getSource() == b5)
        {
            this.setVisible(false);
            new Knowmore5().setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new HServices().setVisible(true);
        
    }
}
