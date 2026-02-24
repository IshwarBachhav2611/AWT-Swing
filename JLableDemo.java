import java.awt.Color;

import javax.swing.*;
class JLabelDemo {
    JFrame f;
    JLabel lb;
    JLabelDemo(){
        f = new JFrame("JLabel Demo");
        f.setSize(500,500);
        f.setLocation(1000,100);
        f.setLayout(null);

        lb = new JLabel("This is Label in Swing");
        lb.setBounds(187, 200, 125, 30);
        lb.setForeground(Color.white);
        lb.setBackground(Color.black);
        lb.setOpaque(true);//enables Background color proerty 
        
        f.add(lb);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Close the Window Compleately
        f.setVisible(true);
    }
    public static void main(String[] args){
        new JLabelDemo();
    }
} 
