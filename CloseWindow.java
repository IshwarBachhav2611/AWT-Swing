import java.awt.*;
import java.awt.event.*;

public class CloseWindow extends Frame {

    public CloseWindow() {
        setTitle("Close Frame Demo");
        setSize(400, 300);
        setLayout(new FlowLayout());

        add(new Label("Click the close (X) button to exit"));

        // Add WindowListener using WindowAdapter
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();   // closes the window
                // System.exit(0); // you can also use this to stop the program completely
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new CloseWindow();
    }
}
