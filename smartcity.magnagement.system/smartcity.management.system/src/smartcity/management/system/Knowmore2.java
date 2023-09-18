/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package smartcity.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Knowmore2 extends JFrame {
    Knowmore2(){
        setLayout(null);
        setBounds(500,150,500,500);
       getContentPane().setBackground(Color.LIGHT_GRAY);
        
              
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.LIGHT_GRAY);
        p2.setBounds(10,10,800,55);
        add(p2);
        
        JLabel l2=new JLabel("Fortis hospital, Bangalore (Rajajinagar)");
        l2.setBounds(45,5,460,40);
        l2.setFont(new Font(null,Font.BOLD, 20));
        p2.add(l2);
        
        JLabel l3=new JLabel("<html><ul>"+"<li>Fortis Hospital, Bangalore (Rajajinagar), a multi-specialty hospital, began its operation in 2006 in Bangalore. Since 2006, the hospital has established itself as a trusted institution in the field of medical facilities and healthcare. </li>"+"</ul><html>");
        l3.setBounds(10,65,420,100);
        l3.setFont(new Font(null,Font.PLAIN, 16));
        add(l3);
        
         JLabel l4=new JLabel("<html><ul>"+"<li>It is ranked No. 3 amongst the best hospitals in the world and number 1 in India for Medical Tourism by Medical Travel and Tourism Quality Alliance (MTQUA).</li>"+"</ul><html>");
        l4.setBounds(10,170,420,100);
        l4.setFont(new Font(null,Font.PLAIN, 16));
        add(l4);
        
         JLabel l5=new JLabel("<html><ul>"+"<li>Fortis Hospital, Rajajinagar specializes in cutting edge medical technology and dedicated patient care service.Specializations include Cardiology and Cardiac Surgery, Urology, Nephrology, Neurosciences, Orthopaedics, Digestive Care, Emergency Care, and Critical Care</li>"+"</ul><html>");
        l5.setBounds(10,272,420,125);
        l5.setFont(new Font(null,Font.PLAIN, 16));
        add(l5);
        
        JButton b1=new JButton("Book Appointment");
         b1.setBounds(155,410,145,30);
         add(b1);
        
        
       
        
       
     
        setVisible(true);
    }
    public static void main(String[] args){
        new Knowmore2().setVisible(true);
    }
}
