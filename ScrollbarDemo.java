import java.awt.*;
class ScrollbarDemo{
    public static void main(String[] args){
        Frame f = new Frame("ScrollBar Demo");
        f.setSize(500,500);
        f.setLocation(1000,100);
        f.setLayout(null);
        
        Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL,30,0,50,100);
        sb.setBounds(100,250,300,10);
        f.add(sb);
        f.setVisible(true);
    }
}