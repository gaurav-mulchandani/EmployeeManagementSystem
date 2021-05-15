/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author GAURAV
 */
public class remove_employee implements ActionListener {
JFrame f;
JButton b1,b2;
JLabel l1;
JTextField t1;
remove_employee(int i){}

remove_employee(){
    f=new JFrame("Delete Employee");
    f.setBackground(Color.WHITE);
    f.setVisible(true);
    l1=new JLabel("Employee id");
    l1.setForeground(Color.BLACK);
    l1.setBounds(50,150,100,30);
    f.add(l1);
    t1=new JTextField();
    t1.setBounds(200,150,150,30);
    f.add(t1);
    b1=new JButton("Submit");
    b1.setBackground(Color.BLACK);
    b1.setForeground(Color.WHITE);
    b1.setBounds(250,550,150,40);
    b1.addActionListener(this);
    f.add(b1);
     b2=new JButton("Cancel");
    b2.setBackground(Color.BLACK);
    b2.setForeground(Color.WHITE);
    b2.setBounds(450,550,150,40);
    b2.addActionListener(this);
    f.add(b2);
  
    f.setLayout(null);
     f.setSize(900,700);
        f.setLocation(400,150);
    
    
    
}


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            try{
                conn c2 = new conn();
                String a = t1.getText();
                String q="Delete from EMPLOYEE WHERE emp_id='"+a+"'";
                c2.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Data Deleted Succesfully");
                f.setVisible(false);
                new Details();
                
            } catch (Exception ex) {
               ex.printStackTrace();
            }
            if(e.getSource()==b2){
                f.setVisible(false);
                new Details();
                
                
                
            }
        }
        
    }
    public static void main(String[] args){
        new remove_employee();
    }
    
}
