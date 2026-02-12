import java.awt.*;

public class LableDemo {
    public static void main(String[] args){
        Frame f = new Frame("Lable Demo");
        f.setSize(400,500);
        f.setLayout(null);

        Label l1 = new Label("This Is Label");//Create label and Message
        l1.setBounds(50,50, 150, 30);//set position X,Y and height width
        l1.setBackground(Color.YELLOW);
        l1.setForeground(Color.BLUE);
        l1.setFont(new Font("Arial",Font.BOLD,15));
        l1.setAlignment(Label.CENTER);//text alingment
        
        Label l2 = new Label("This is Second label",Label.CENTER);
        l2.setBounds(50, 100, 150, 30);
        l2.setBackground(Color.lightGray);//text alingment
        
        f.add(l1);
        f.add(l2);
        f.setVisible(true);
    }
}
