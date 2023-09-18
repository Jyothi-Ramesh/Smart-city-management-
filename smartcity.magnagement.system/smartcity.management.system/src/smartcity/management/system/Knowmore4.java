/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package smartcity.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Knowmore4 extends JFrame {
    Knowmore4(){
        setLayout(null);
        setBounds(500,150,500,500);
       getContentPane().setBackground(Color.LIGHT_GRAY);
        
              
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.LIGHT_GRAY);
        p2.setBounds(10,10,800,55);
        add(p2);
        
        JLabel l2=new JLabel("Manipal Hospital (Old Airport Road)");
        l2.setBounds(55,5,460,40);
        l2.setFont(new Font(null,Font.BOLD, 20));
        p2.add(l2);
        
        JLabel l3=new JLabel("<html><ul>"+"<li>Established in 1991, Manipal Hospital is the third largest healthcare network in India.It is NABH and NABL (ISQUA) accredited.It is also ISO 9001:2008 certified for all comprehensive protocols including clinical, nursing, diagnostics and allied areas.</li>"+"</ul><html>");
        l3.setBounds(10,64,420,105);
        l3.setFont(new Font(null,Font.PLAIN, 16));
        add(l3);
        
         JLabel l4=new JLabel("<html><ul>"+"<li>Manipal Hospital Whitefield is 284-bedded inpatient facility.It is also accredited with the AAHRPP Accreditation (Association for the Accreditation of the Human Research Protection Programs)</li>"+"</ul><html>");
        l4.setBounds(10,168,420,100);
        l4.setFont(new Font(null,Font.PLAIN, 16));
        add(l4);
        
         JLabel l5=new JLabel("<html><ul>"+"<li>The Hospital offers a wide range of Preventive and Curative care and is the third-largest healthcare network in India.With world-class infrastructure and best doctors, the hospital uses advanced technologies to deliver personalized care for faster recovery with zero infection risk.</li>"+"</ul><html>");
        l5.setBounds(10,270,420,125);
        l5.setFont(new Font(null,Font.PLAIN, 16));
        add(l5);
        
        JButton b1=new JButton("Book Appointment");
         b1.setBounds(155,410,145,30);
         add(b1);
        
        
       
        
       
     
        setVisible(true);
    }
    public static void main(String[] args){
        new Knowmore4().setVisible(true);
    }
}
