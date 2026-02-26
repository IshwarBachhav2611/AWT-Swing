import java.awt.Color;

import javax.swing.*;
public class CheckBoxDemo {
    JFrame f;
    JCheckBox cb1,cb2,cb3,cb4;
    JLabel l;
    CheckBoxDemo(){
        f = new JFrame();
        f.setSize(500,500);
        f.setLocation(1000,100);
        f.getContentPane().setBackground(Color.white);
        f.setLayout(null);

        l = new JLabel("Select Cources");
        l.setBounds(10,10,200,20);
        f.add(l);

        cb1 = new JCheckBox("Java");
        cb1.setBounds(10,30,100,20);
        f.add(cb1);

        cb2 = new JCheckBox("Python");
        cb2.setBounds(120,30,100,20);
        f.add(cb2);

        cb3 = new JCheckBox("Java");
        cb3.setBounds(10,60,100,20);
        f.add(cb3);

        cb4 = new JCheckBox("Java");
        cb4.setBounds(120,60,100,20);
        f.add(cb4);

        f.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        f.setVisible(true);
        
    }
    public static void main(String[] args){
        new CheckBoxDemo();
    }
}
