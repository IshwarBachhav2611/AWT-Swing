import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ActionListenerDemo {
    JFrame frame;
    JPanel panel;
    JButton btnClose;
    ActionListenerDemo(){
        frame = new JFrame("ActionListener");
        frame.setSize(500,500);
        frame.setLocation(1000,100);
        

        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        btnClose = new JButton("Close Frame");
        btnClose.setBounds(150, 200, 200, 50);
        panel.add(btnClose);

        btnClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                btnClose.setText("Button Clicked");
                frame.dispose();
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new ActionListenerDemo();
    }
    
}
