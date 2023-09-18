/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package smartcity.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Knowmore5 extends JFrame {
    Knowmore5(){
        setLayout(null);
        setBounds(500,150,500,500);
       getContentPane().setBackground(Color.LIGHT_GRAY);
        
              
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.LIGHT_GRAY);
        p2.setBounds(10,10,800,55);
        add(p2);
        
        JLabel l2=new JLabel("Aster CMI Hospital, Sahakara Nagar");
        l2.setBounds(45,5,460,40);
        l2.setFont(new Font(null,Font.BOLD, 20));
        p2.add(l2);
        
        JLabel l3=new JLabel("<html><ul>"+"<li>Aster CMI hospital, one of the top hospitals in Bangalore, with serene ambience, spacious interiors, advanced medical facilities, and best doctors, has always strived to achieve the best clinical outcomes</li>"+"</ul><html>");
        l3.setBounds(10,64,420,100);
        l3.setFont(new Font(null,Font.PLAIN, 16));
        add(l3);
        
         JLabel l4=new JLabel("<html><ul>"+"<li> Equipped with advanced medical equipment and technologies, it has been constantly achieving milestones in the medical field. The establishment enjoys a good connectivity with the rest of the city because of its prominent location.</li>"+"</ul><html>");
        l4.setBounds(10,170,420,105);
        l4.setFont(new Font(null,Font.PLAIN, 16));
        add(l4);
        
         JLabel l5=new JLabel("<html><ul>"+"<li>This hospital is well known for incorporating high end digital technology into its diagnostic, therapeutic and rehabilitative services. An integrated network exists within the hospital to coordinate and execute routine functions with great efficiency.Created a niche for itself in the Indian healthcare fraternity.</li>"+"</ul><html>");
        l5.setBounds(10,282,420,125);
        l5.setFont(new Font(null,Font.PLAIN, 16));
        add(l5);
        
        JButton b1=new JButton("Book Appointment");
         b1.setBounds(155,414,145,30);
         add(b1);
        
        
       
        
       
     
        setVisible(true);
    }
    public static void main(String[] args){
        new Knowmore5().setVisible(true);
    }
}
