/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author GAURAV
 */
public class Details implements ActionListener{
    
   JFrame f1;
   JLabel l1,l2;
   JButton b1,b2,b3,b4;
   Details(){
       f1=new JFrame("Details");
       f1.setBackground(Color.WHITE);
       f1.setLayout(null);
       
       l1= new JLabel("Employee Details");
       l1.setBounds(230,10,200,40);
       l1.setBackground(Color.WHITE);
       l1.setLayout(null);
       f1.add(l1);
       b1=new JButton("add");
       b1.setBackground(Color.BLACK);
       b1.setForeground(Color.WHITE);
       b1.setBounds(200,80,100,40);
       b1.addActionListener(this);
       f1.add(b1);
       b2=new JButton("view");
       b2.setBackground(Color.BLACK);
       b2.setForeground(Color.WHITE);
       b2.setBounds(300,80,100,40);
       b2.addActionListener(this);
       f1.add(b2);
       b3=new JButton("remove");
       b3.setBackground(Color.BLACK);
       b3.setForeground(Color.WHITE);
       b3.setBounds(200,140,100,40);
       b3.addActionListener(this);
       f1.add(b3);
       b4=new JButton("update");
       b4.setBackground(Color.BLACK);
       b4.setForeground(Color.WHITE);
       b4.setBounds(300,140,100,40);
       b4.addActionListener(this);
       f1.add(b4);
       
       
       
       f1.setVisible(true);
       f1.setLocation(450,200);
       f1.setSize(700,500);
   }
   
   

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            f1.setVisible(false);
            new add_employee();
        }
          if(e.getSource()==b2){
            f1.setVisible(false);
            new view_employee();
        }
           if(e.getSource()==b3){
            f1.setVisible(false);
            new remove_employee();
        }
            if(e.getSource()==b4){
            f1.setVisible(false);
            new search_employee();
        }
        
    }
    public static void main(String[] args){
        Details d= new Details();
    }
}
