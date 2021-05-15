/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;


import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author GAURAV
 */
class First_Page implements ActionListener{
    JFrame f;
    JLabel l1,l2;
    JButton b;
    First_Page(){
        f=new JFrame("Employee Management System");
        f.setBackground(Color.red);
        f.setLayout(null);
       
        b=new JButton("Click here to continue");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(500,600,300,70);
        b.addActionListener(this);
        l2=new JLabel();
        l2.setBounds(0,0,1360,750);
        l2.setLayout(null);
        JLabel lid =new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        lid.setBounds(30,50,1500,100);
        lid.setForeground(Color.RED);
        f.add(lid);
        f.add(b);
        f.setVisible(true);
        f.setLocation(200,100);
        f.setSize(1360,750);
        
        

        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==b){
            f.setVisible(false);
          Login l =new Login();
        }
    }
        
       public static void main(String [] args){
           First_Page fp = new First_Page();
       }
    
    
    
   
    
}
