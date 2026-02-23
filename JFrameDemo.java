import java.awt.Color;
import javax.swing.*;
class JFrameDemo{
    JFrame f;
    JLabel lb;
    JFrameDemo(){
        f = new JFrame();
        f.setTitle("Swing Frame");
        f.setSize(500,500);
        f.setLocation(1000, 100);
        f.setBackground(Color.red);
        f.setLayout(null);
        lb = new JLabel("This is Swing FRAME");
        lb.setForeground(Color.white);
        lb.setBounds(180,200,150,30); 
        f.add(lb);
        f.getContentPane().setBackground(Color.DARK_GRAY);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new JFrameDemo();
    }
}