import javax.swing.*;
import java.awt.event.*;
public class KeyListenerDemo {
    JFrame frame;
    JPanel panel;
    JTextField txt1;
    JLabel lbl1,lbl2;
    KeyListenerDemo(){
        frame = new JFrame("KeyListener");
        frame.setSize(500,500);
        frame.setLocation(1000,100);
        

        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        txt1 = new JTextField("Test");
        txt1.setBounds(150,200,200,50);
        panel.add(txt1);

        lbl1 = new JLabel("State :");
        lbl1.setBounds(150,250,50,50);
        panel.add(lbl1);

        lbl2 = new JLabel("Keyevent");
        lbl2.setBounds(200,250,200,50);
        panel.add(lbl2);

        txt1.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e){
                lbl2.setText("Key Pressed");
            }
            public void keyReleased(KeyEvent e){
                lbl2.setText("Key Released");
            }
            public void keyTyped(KeyEvent e){
                lbl2.setText("Typing...");
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new KeyListenerDemo();
    }
}
