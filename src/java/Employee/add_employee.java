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
public class add_employee implements ActionListener {
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
JButton b,b1,b2,b3;
JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id13,id14,id15,id16,id17,lab,lab1;
JFrame f;

add_employee(int i){}
add_employee(){
    f=new JFrame("ADD EMPLOYEE");
    f.setBackground(Color.WHITE);
    f.setLayout(null);
    f.setVisible(true);
    id8=new JLabel();
    id8.setBounds(320,30,500,50);
    id8.setForeground(Color.BLACK);
    f.add(id8);
    id1=new JLabel("Name");
    id1.setBounds(50,150,100,30);
    f.add(id1);
    t1=new JTextField();
    t1.setBounds(200,150,150,30);
     f.add(t1);
    id2 = new JLabel("Father's Name");
        id2.setBounds(400,150,200,30);
    
        f.add(id2);

        t2=new JTextField();
        t2.setBounds(600,150,150,30);
        f.add(t2);

        id3= new JLabel("Age");
        id3.setBounds(50,200,100,30);
        
        f.add(id3);

        t3=new JTextField();
        t3.setBounds(200,200,150,30);
        f.add(t3);

        id4= new JLabel("Date Of Birth");  
        id4.setBounds(400,200,200,30);
     
        f.add(id4);

        t4=new JTextField();
        t4.setBounds(600,200,150,30);
        f.add(t4);

        id5= new JLabel("Address");
        id5.setBounds(50,250,100,30);
        
        f.add(id5);

        t5=new JTextField();
        t5.setBounds(200,250,150,30);
        f.add(t5);

        id6= new JLabel("Phone");
        id6.setBounds(400,250,100,30);
        
        f.add(id6);

        t6=new JTextField();
        t6.setBounds(600,250,150,30);
        f.add(t6);

        id7= new JLabel("Email Id");
        id7.setBounds(50,300,100,30);
       
        f.add(id7);

        t7=new JTextField();
        t7.setBounds(200,300,150,30);
        f.add(t7);

        id9= new JLabel("Education");
        id9.setBounds(400,300,100,30);
           
        f.add(id9);

        t8=new JTextField();
        t8.setBounds(600,300,150,30);
        f.add(t8);

        id10= new JLabel("Job Post");
        id10.setBounds(50,350,100,30);
       
        f.add(id10);

        t9=new JTextField();
        t9.setBounds(200,350,150,30);
        f.add(t9);


        id11= new JLabel("Aadhar No");
        id11.setBounds(400,350,100,30);
        
        f.add(id11);

        t10=new JTextField();
        t10.setBounds(600,350,150,30);
        f.add(t10);

        id12= new JLabel("Employee Id");
        id12.setBounds(50,400,150,30);
       
        f.add(id12);

        t11=new JTextField();   
        t11.setBounds(200,400,150,30);
        f.add(t11);

        

        lab=new JLabel();
        lab.setBounds(200,450,250,200);
	f.add(lab);

        lab1=new JLabel("");
        lab1.setBounds(600,450,250,200);
        f.add(lab1);

        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(250,550,150,40);
        
        f.add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,550,150,40);
        
        f.add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        
       
        f.setSize(900,700);
        f.setLocation(400,150);
}


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            try{
                conn n= new conn();
                String a=t1.getText();
                String b=t2.getText();
                String c=t3.getText();
                String d=t4.getText();
                String f1=t5.getText();
                String g=t6.getText();
                String h=t7.getText();
                String i=t8.getText();
                String j=t9.getText();
                String k=t10.getText();
                String l=t11.getText();
                String q= "Insert into EMPLOYEE values('"+a+"','"+b+"','"+c+"','"+d+"','"+f1+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"')";
                n.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Data Submitted successfully");
                f.setVisible(false);
                new Details();
                

                
                
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if(e.getSource()==b1){
        f.setVisible(false);
        new Details();
    }
    }
    public static void main(String[] args){
        add_employee a =new add_employee();
    }
}
