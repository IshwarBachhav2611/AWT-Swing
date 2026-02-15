import java.awt.*;

public class TextAreaDemo {
    public static void main(String[] args){
        Frame f = new Frame("Text Area Demo");
        f.setSize(500,500);
        f.setLayout(null);
        f.setLocation(500,500);
        
        TextArea ta = new TextArea("Add Text");
        ta.setBounds(100, 200, 300, 100);
        ta.setColumns(5);
        ta.setFont(new Font("Ariel",Font.PLAIN,15));
        ta.setBackground(Color.BLUE);
        ta.setForeground(Color.CYAN);

        f.add(ta);
        f.setVisible(true);
    }
}
