package Employee;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class search_employee implements ActionListener{
    JFrame f;
    JTextField t;
    JLabel l,l5;
    JButton b,b2;

    search_employee(){
        f=new JFrame("search");
        f.setBackground(Color.green);
        f.setLayout(null);



        l=new JLabel("Employee Id");
        l.setVisible(true);
        l.setBounds(40,50,250,30);
        l.setForeground(Color.white);
        Font F1=new Font("serif",Font.BOLD,25);
        l.setFont(F1); 
     
        f.add(l);

        t=new JTextField();
        t.setBounds(240,50,220,30);
        f.add(t);

        b=new JButton("Search");
        b.setBounds(240,150,100,30);
        b.addActionListener(this);
        f.add(b);


        b2=new JButton("Cancel");
        b2.setBounds(360,150,100,30);
        b2.addActionListener(this);
        f.add(b2);

        f.setSize(500,270);
        f.setLocation(450,250);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b2){
            f.setVisible(false);
            Details d=new Details();
        }
        if(ae.getSource()==b){
            new update_employee(t.getText());
            f.setVisible(false);
        }

    }
    
    public static void main(String[]args){
        new search_employee();
    } 	
}