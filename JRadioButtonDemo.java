import java.awt.Color;

import javax.swing.*;
public class RadioButtonDemo {
    JFrame f;
    JLabel l;
    JRadioButton btnMale,btnFemale,btnOther;
    ButtonGroup bg;
    RadioButtonDemo(){
        f = new JFrame("RadioButton Demo");
        f.setSize(500,500);
        f.setLayout(null);
        f.setLocation(1000,100);
        f.getContentPane().setBackground(Color.white);

        l = new JLabel("Genders:");
        l.setBounds(10,10,100,20);

        btnMale = new JRadioButton("Male");
        btnMale.setBounds(10,30,80,20);
        
        btnFemale = new JRadioButton("Female");
        btnFemale.setBounds(110,30,80,20);
        
        btnOther = new JRadioButton("Other");
        btnOther.setBounds(210,30,80,20);

        bg = new ButtonGroup();//Group the buttons 
        bg.add(btnMale);//Only one value is  get Selected
        bg.add(btnFemale);
        bg.add(btnOther);
        
        f.add(l);
        f.add(btnMale);
        f.add(btnFemale);
        f.add(btnOther);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new RadioButtonDemo();
    }
}
