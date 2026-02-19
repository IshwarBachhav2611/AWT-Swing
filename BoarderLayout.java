import java.awt.*;
public class BoarderLayout {
    Frame f;
    Panel p;
    Button btnNorth,btnSouth,btnEast,btnWest,btnCenter;
    BoarderLayout(){
        f = new Frame("Boarder Layout");
       

        btnNorth = new Button("North");
        btnSouth = new Button("South");
        btnEast = new Button("East");
        btnWest = new Button("West");
        btnCenter = new Button("Center");
        p = new Panel();
        p.setLayout(new BorderLayout());
        p.add(btnNorth,BorderLayout.NORTH);
        p.add(btnSouth,BorderLayout.SOUTH);
        p.add(btnEast,BorderLayout.EAST);
        p.add(btnWest,BorderLayout.WEST);
        p.add(btnCenter,BorderLayout.CENTER);

        f.setSize(500,500);
        f.setLocation(1000,100);
        f.add(p);
        f.setVisible(true);
    }

    public static void main(String[] args){
        new BoarderLayout();
    }
}
