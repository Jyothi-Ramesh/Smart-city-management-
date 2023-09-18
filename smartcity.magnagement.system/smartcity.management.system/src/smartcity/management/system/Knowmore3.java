/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package smartcity.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Knowmore3 extends JFrame {
    Knowmore3(){
        setLayout(null);
        setBounds(500,150,500,500);
       getContentPane().setBackground(Color.LIGHT_GRAY);
        
              
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.LIGHT_GRAY);
        p2.setBounds(10,10,800,55);
        add(p2);
        
        JLabel l2=new JLabel("Columbia Asia Hospital(Whitefield)");
        l2.setBounds(70,5,460,40);
        l2.setFont(new Font(null,Font.BOLD, 20));
        p2.add(l2);
        
        JLabel l3=new JLabel("<html><ul>"+"<li>Columbia Asia Hospitals is one of the first healthcare companies to enter India through 100% foreign direct investment (FDI) route. The Columbia Asia Group is owned by more than 150 private equity companies and individual investors. </li>"+"</ul><html>");
        l3.setBounds(10,70,420,100);
        l3.setFont(new Font(null,Font.PLAIN, 16));
        add(l3);
        
         JLabel l4=new JLabel("<html><ul>"+"<li>The hospital has International standard infrastructure and follows globally benchmarked standards of medical, nursing and operating protocols making it the preferred healthcare destination for patients from around the world. </li>"+"</ul><html>");
        l4.setBounds(10,180,425,100);
        l4.setFont(new Font(null,Font.PLAIN, 16));
        add(l4);
        
         JLabel l5=new JLabel("<html><ul>"+"<li>It is an international healthcare group operating a chain of modern hospitals across Asia.The centre has a high-end NICU and PICU facility available.The innovative design of the hospitals, from their manageable size to their advanced technology, is focused on creating positive experience for patients.</li>"+"</ul><html>");
        l5.setBounds(10,289,420,125);
        l5.setFont(new Font(null,Font.PLAIN, 16));
        add(l5);
        
        JButton b1=new JButton("Book Appointment");
         b1.setBounds(155,422,145,30);
         add(b1);
        
        
       
        
       
     
        setVisible(true);
    }
    public static void main(String[] args){
        new Knowmore3().setVisible(true);
    }
}
