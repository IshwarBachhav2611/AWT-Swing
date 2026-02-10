import java.awt.*;
class CanvasShapes extends Component{
    public static void main(String[] args){
        Frame f = new Frame();
        f.setBackground(Color.cyan);
        f.setSize(400,400);
        f.setTitle("Canvas Shapes");
        //f.setLayout(null);
        f.setLocation(0,500);
        f.add(new CanvasShapes());
        f.setVisible(true);
    }

    public void paint(Graphics g){
        g.drawRect(10, 10, 100, 100);
        g.drawOval(120,10, 100, 100);
        g.drawLine(230, 55, 330, 55);
        

        g.setColor(Color.black);
        g.fillRect(10, 120, 100, 100);
        g.setColor(Color.BLACK);
        g.fillOval(120,120, 100, 100);
        g.setColor(Color.red);
        g.drawLine(275, 120, 275, 210);
    }
}