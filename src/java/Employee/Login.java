/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author GAURAV
 */
public class Login implements ActionListener{
    JFrame f1;
    JLabel l1,l2,l3;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    Login(){
      f1=new JFrame("Login Page");
     f1.setBackground(Color.WHITE);
      f1.setLayout(null);
      l1 =new JLabel("Username");
      l1.setBounds(40,20,100,30);
      f1.add(l1);
      l2= new JLabel("Password");
      l2.setBounds(40,70,100,30);
      f1.add(l2);
      t1 = new JTextField();
      t1.setBounds(150,20,150,30);
      f1.add(t1);
      t2 = new JPasswordField();
      t2.setBounds(150,70,150,30);
      f1.add(t2);
       
      b1= new JButton("Login");
      b1.setBackground(Color.BLACK);
      b1.setForeground(Color.WHITE);
      b1.setBounds(40,140,120,30);
      b1.addActionListener(this);
      f1.add(b1);
      b2= new JButton("Cancel");
      b2.setBackground(Color.BLACK);
      b2.setForeground(Color.WHITE);
      b2.setBounds(160,140,120,30);
      b2.addActionListener(this);
      f1.add(b2);
      f1.setSize(600,300);
      f1.setLocation(400,300);
     f1.setVisible(true);
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
        
        try{
            conn c1 = new conn();
            String u=t1.getText();
            String v=t2.getText();
            String q="select * from login where username='"+u+"' and password='"+v+"'";
            ResultSet rs=c1.s.executeQuery(q);
            if(rs.next()){
                new Details().f1.setVisible(true);
                f1.setVisible(false);
                 }else{
                JOptionPane.showMessageDialog(null,"Invalid Login");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
        if(e.getSource()==b2){
            f1.setVisible(true);
            
        }
    }
            
       public static void main(String[] args){
           Login l = new Login();
       }
}
    
    

