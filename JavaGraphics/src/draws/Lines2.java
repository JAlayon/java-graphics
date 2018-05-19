
package draws;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Alayon
 */
public class Lines2 extends JPanel{
    
    public void paint(Graphics g){
        int alto= getSize().height;
        int ancho= getSize().width;
        int yi=40;
        int xf=10;
        
        g.setColor(Color.red);
        g.drawLine(0, 30, ancho, 30);
        g.setColor(Color.red);
        g.drawLine(10, 0, 10, alto);
        g.setColor(Color.red);
        g.drawLine(20, 0, 20, alto);
        
        for (;;) {
            g.setColor(Color.BLUE);
            g.drawLine(0, yi, ancho, yi);
            yi+=10;
            if(yi >=340)
                break;
        }
    }
    
    
}