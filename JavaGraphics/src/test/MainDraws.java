
package test;

import java.awt.BorderLayout;
import javax.swing.JFrame;

//CLASE MAIN PARA EL RENDERIZADO DE LOS DIBUJOS
public class MainDraws {
    
    static final int WIDTH = 600;
    static final int HEIGHT = 500;
    static final String TITTLE = "Dibujos 2D";
    
    public static void main(String[] args) {
        JFrame f = new JFrame(TITTLE);
        PanelDrawing pd = new PanelDrawing();//<- Vista
        
        f.setLayout(new BorderLayout());
        f.setSize(WIDTH, HEIGHT);
        f.add(pd, BorderLayout.CENTER);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
