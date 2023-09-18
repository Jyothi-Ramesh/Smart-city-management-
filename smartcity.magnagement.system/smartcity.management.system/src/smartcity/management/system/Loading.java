
package smartcity.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Loading extends JFrame implements Runnable{
    JProgressBar p;
    Thread t;
    Connection conn;
    String Username;
    
    
    Loading(String user){
        
        Username = user;
        t = new Thread((Runnable)this);
       setBounds(700,250,650,400);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
      JLabel l1 = new JLabel("SMART CITY APPLICATION");
          l1.setBounds(60,-170,600,400);
          l1.setFont(new Font("Raleway", Font.BOLD, 35));
          l1.setForeground(Color.BLUE);
   add(l1);
    
    p = new JProgressBar();
    p.setStringPainted(true);
    p.setBounds(150,100,300,25);
    
   add(p);
    
    JLabel l2= new JLabel("  PLEASE WAIT... ");
          l2.setBounds(225,130,150,25);
          l2.setFont(new Font("Tahoma", Font.PLAIN, 10));
          l2.setForeground(Color.BLUE);
   add(l2);
   
   JLabel l3= new JLabel ("Welcome "+ Username);
          l3.setBounds(50,310,400,25);
          l3.setFont(new Font("Tahoma", Font.BOLD, 16));
          l3.setForeground(Color.BLUE);
   add(l3);
 
    setUndecorated(true);
            setUploading();
    }
    
    public static void main(String[] args)
    {
        new Loading("").setVisible(true);
    }
    
     public void setUploading() {
            setVisible(false);
            t.start();
	}
    

    public void run(){
     try{
         for (int i=1;i<101;i++){
             int m = p.getMaximum();
         int n= p.getValue();
         if(n<m){
          p.setValue(p.getValue()+1);
         }
         else{
             i=101;
             setVisible(false);
             //Home
         }
         
         }
     Thread.sleep(1050);
     this.setVisible(false);
     new Dashboard().setVisible(true);
     
     }catch(InterruptedException e){}
    }
}




    
   

