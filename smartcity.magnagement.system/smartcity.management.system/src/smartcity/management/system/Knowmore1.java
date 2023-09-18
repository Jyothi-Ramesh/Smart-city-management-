/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package smartcity.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Knowmore1 extends JFrame {
    Knowmore1(){
        setLayout(null);
        setBounds(500,150,500,500);
       getContentPane().setBackground(Color.LIGHT_GRAY);
        
              
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.LIGHT_GRAY);
        p2.setBounds(10,10,800,55);
        add(p2);
        
        JLabel l2=new JLabel("Apollo Hospital (Bannerghatta Road)Bangalore");
        l2.setBounds(10,5,460,40);
        l2.setFont(new Font(null,Font.BOLD, 20));
        p2.add(l2);
        
        JLabel l3=new JLabel("<html><ul>"+"<li>Apollo Hospital (Bannerghatta Road) Bangalore established in 2007 is one of the most modern hospital, committed to investing in the latest medical technology to ensure that all their patients benefit from the latest knowledge.</li>"+"</ul><html>");
        l3.setBounds(10,75,420,100);
        l3.setFont(new Font(null,Font.PLAIN, 16));
        add(l3);
        
         JLabel l4=new JLabel("<html><ul>"+"<li>They are equipped with state-of-the-art technology making it a powerhouse of healthcare in Bengaluru.The hospital uses Protocol and Care Pathway based treatment models to ensure the best outcomes for patients.</li>"+"</ul><html>");
        l4.setBounds(10,182,420,100);
        l4.setFont(new Font(null,Font.PLAIN, 16));
        add(l4);
        
         JLabel l5=new JLabel("<html><ul>"+"<li>The Hospital is accredited by the Joint Commission International (JCI), which is the gold standard accreditation for health care organizations The hospital uses Protocol and Care Pathway based treatment models to ensure the best outcomes for patients.</li>"+"</ul><html>");
        l5.setBounds(10,286,420,125);
        l5.setFont(new Font(null,Font.PLAIN, 16));
        add(l5);
        
        JButton b1=new JButton("Book Appointment");
         b1.setBounds(155,410,145,30);
         add(b1);
        
        
       
        
       
     
        setVisible(true);
    }
    public static void main(String[] args){
        new Knowmore1().setVisible(true);
    }
}
