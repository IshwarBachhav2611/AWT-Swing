import java.awt.*;
public class ChoiceDemo {
    public static void main(String[] args){
        Frame f = new Frame("Choice Demo");
        f.setSize(500,500);
        f.setLocation(1000,100);
        f.setLayout(null);

        Choice ch = new Choice();
        ch.setBounds(200, 200,100, 100);
        ch.add("Java");
        ch.add("python");
        ch.add("CPP");
        ch.add("C");

        f.add(ch);
        f.setVisible(true);
    }
}
