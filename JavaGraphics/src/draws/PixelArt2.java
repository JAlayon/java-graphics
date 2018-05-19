package draws;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

/**
 *
 * @author Alayon
 */
public class PixelArt2 extends JPanel {

    private int tc = 20;
    
    public void paint(Graphics g) {

        int matriz[][] = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 5, 5, 5, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 4, 4, 4, 5, 5, 2, 5, 0, 1, 1, 1, 0, 0, 0},
        {0, 0, 0, 0, 0, 4, 5, 4, 5, 5, 5, 2, 5, 5, 5, 1, 1, 0, 0, 0},
        {0, 0, 0, 0, 0, 4, 5, 4, 4, 5, 5, 5, 2, 5, 5, 5, 1, 0, 0, 0},
        {0, 0, 0, 0, 0, 4, 4, 5, 5, 5, 5, 2, 2, 2, 2, 1, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 5, 5, 5, 5, 1, 1, 0, 0, 0, 0},
        {0, 5, 5, 5, 1, 1, 1, 1, 3, 1, 1, 1, 3, 1, 1, 0, 0, 4, 0, 0},
        {0, 5, 5, 5, 1, 1, 1, 1, 1, 3, 1, 1, 1, 3, 0, 0, 4, 4, 0, 0},
        {0, 0, 5, 0, 0, 0, 1, 1, 1, 3, 3, 3, 3, 6, 3, 3, 4, 4, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 6, 3, 3, 3, 3, 3, 4, 4, 0, 0},
        {0, 0, 0, 0, 0, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 0, 0},
        {0, 0, 0, 0, 4, 4, 4, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},};

        int tc = 20;

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                Color c;
                switch (matriz[j][i]) {
                    case 1:
                        c = Color.GREEN;
                        pintar(c, g, i, j);
                        break;
                    case 2:
                        c = Color.black;
                        pintar(c, g, i, j);
                        break;
                    case 3:
                        c = Color.blue;
                        pintar(c, g, i, j);
                        break;
                    case 4:
                        c = new Color(113, 4, 17);
                        pintar(c, g, i, j);
                        break;
                    case 5:
                        c = new Color(255, 204, 1);
                        pintar(c, g, i, j);
                        break;
                    case 6:
                        c = Color.yellow;
                        pintar(c, g, i, j);
                        break;
                }
            }
        }
        //Cuadricula
        int x = getSize().width;
        int y = getSize().height;
        for (int i = 0; i < x; i += tc) {
            for (int j = 0; j < y; j += tc) {
                g.drawRect(i, j, tc, tc);
            }
        }

    }

 
    private void pintar(Color c, Graphics g, int i ,int j) {
        g.setColor(c);
        g.fillRect(i * tc, j * tc, tc, tc);
    }
}
