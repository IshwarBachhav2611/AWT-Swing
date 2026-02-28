import javax.swing.*;
import java.awt.event.*;;
public class MouseListenerDemo {
    JFrame frame;
    JPanel panel;
    JButton btnTest;
    JLabel lbl1, lbl2; 
    MouseListenerDemo(){
        frame = new JFrame("MouseEvents");
        frame.setSize(500,500);
        frame.setLocation(1000,100);

        panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        btnTest = new JButton("Test");
        btnTest.setBounds(150,200,200,50);
        panel.add(btnTest);

        lbl1 = new JLabel("State :");
        lbl1.setBounds(150,250,50,50);
        panel.add(lbl1);

        lbl2 = new JLabel("mouse event");
        lbl2.setBounds(200,250,200,50);
        panel.add(lbl2);
        

        btnTest.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e){
                lbl2.setText("MouseClicked");
            }
            public void mousePressed(MouseEvent e){
                lbl2.setText("MousePressed");
            }
            public void mouseReleased(MouseEvent e){
                lbl2.setText("MouseReleased");
            }
            public void mouseEntered(MouseEvent e){
                lbl2.setText("MouseEntered");
            }
            public void mouseExited(MouseEvent e){
                lbl2.setText("MouseExited");
            }
        });


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new MouseListenerDemo();
    }
}
