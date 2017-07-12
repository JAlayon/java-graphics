
package draws;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MainDraws {
    
    static final int WIDTH = 600;
    static final int HEIGHT = 500;
    static final String TITTLE = "Dibujos 2D";
    
    static DrawLines lines = new DrawLines();
    static DrawLines2 lines2 = new DrawLines2();
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(WIDTH, HEIGHT);
        frame.setTitle(TITTLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        
        frame.add(lines2);
        frame.setVisible(true);
    }
}
