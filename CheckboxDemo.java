import java.awt.*;
import javax.swing.*;;


public class CheckboxDemo {
    public static void main(String[] args){
        JFrame f = new JFrame("Checkbox Demo");
        f.setSize(500, 500);
        f.setLayout(null);
        f.setLocation(900,250);
        

        JCheckBox cb1 = new JCheckBox("java",true);
        JCheckBox cb2 = new JCheckBox("python");
        JCheckBox cb3 = new JCheckBox("Cpp");

        cb1.setBounds(50, 10, 100,20);
        cb2.setBounds(50, 40, 100,20);        
        cb3.setBounds(50, 70, 100, 20);

        CheckboxGroup cg = new CheckboxGroup();
        Checkbox ch1 = new Checkbox("Male",cg,true);
        ch1.setBounds(50, 120, 200, 10);

        Checkbox ch2 = new Checkbox("Female",cg,false);
        ch2.setBounds(50, 140, 200, 10);
        
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(ch1);
        f.add(ch2);
        f.setVisible(true);
    }
}
