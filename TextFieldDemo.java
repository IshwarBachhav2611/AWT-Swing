import java.awt.*;
public class TextFieldDemo {
    public static void main(String[] args){
        Frame f = new Frame();
        f.setTitle("TextFieldDemo");
        f.setSize(500,500);
        f.setLayout(null);
        TextField tx = new TextField("Enter Name");
        tx.setBounds(200, 225, 100, 20);
        tx.setFont(new Font("Arial",Font.PLAIN,15));

        TextField tx2 = new TextField();
        tx2.setBounds(200, 250, 100,20);
        tx2.setEchoChar('*');
        
        f.add(tx);
        f.add(tx2);
        f.setVisible(true);

    }
}
