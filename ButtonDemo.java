import java.awt.*;
public class ButtonDemo {
    public static void main(String[] args){
        Frame f = new Frame("Button Demo");
        f.setSize(500,500);
        f.setLayout(null);
        f.setBackground(Color.pink);



        Button b = new Button("Click Me!");
        b.setBounds(200, 200, 100, 100);
        b.setForeground(Color.white);
        b.setBackground(Color.black);
        b.setFont(new Font("Verdana",Font.BOLD, 10));

        Button b2 = new Button("Click Me!");
        b2.setBounds(225, 330, 50, 50);
        b2.setEnabled(false);

        f.add(b);
        f.add(b2);
        f.setVisible(true);



    }
}
 