
package draws;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Alayon
 */
public class PixelArt1 extends JPanel{
    
    public void paint(Graphics g){
        int x=getSize().width;
        int y= getSize().height;
        
        int tc=20;
       
        g.setColor(Color.BLACK);
        g.fillRect(14*tc, 5*tc, 6*tc, tc);
        g.fillRect(12*tc, 6*tc, 2*tc, tc);
        g.fillRect(11*tc, 7*tc, tc, tc);
        g.fillRect(9*tc, 8*tc, 4*tc, tc);
        g.fillRect(8*tc, 9*tc, 1*tc, 3*tc);
        g.fillRect(9*tc, 12*tc, 1*tc, 1*tc);
        g.fillRect(10*tc, 13*tc, 3*tc, 1*tc);
        g.fillRect(12*tc, 14*tc, 1*tc, 1*tc);
        g.fillRect(13*tc, 12*tc, 1*tc, 1*tc);
        g.fillRect(14*tc, 10*tc, 1*tc, 2*tc);
        g.fillRect(13*tc, 9*tc, 1*tc, 1*tc);
        g.fillRect(13*tc, 15*tc, 2*tc, 1*tc);
        g.fillRect(15*tc, 16*tc, 4*tc, 1*tc);
        g.fillRect(19*tc, 15*tc, 5*tc, 1*tc);
        g.fillRect(19*tc, 13*tc, 5*tc, 1*tc);
        g.fillRect(23*tc, 13*tc, 1*tc, 3*tc);
        g.fillRect(19*tc, 11*tc, 5*tc, 1*tc);
        g.fillRect(24*tc, 12*tc, 1*tc, 1*tc);
        g.fillRect(18*tc, 12*tc, 1*tc, 1*tc);
        g.fillRect(18*tc, 14*tc, 1*tc, 1*tc);
        g.fillRect(17*tc, 13*tc, 1*tc, 1*tc);
        g.fillRect(17*tc, 7*tc, 1*tc, 3*tc);
        g.fillRect(18*tc, 6*tc, 1*tc, 1*tc);
        g.fillRect(18*tc, 10*tc, 1*tc, 1*tc);
        g.fillRect(20*tc, 6*tc, 1*tc, 1*tc);
        g.fillRect(20*tc, 6*tc, 1*tc, 1*tc);
        g.fillRect(20*tc, 8*tc, 1*tc, 2*tc);
        g.fillRect(22*tc, 8*tc, 1*tc, 3*tc);
        g.fillRect(21*tc, 7*tc, 1*tc, 1*tc);
        
        g.setColor(new Color(225, 216, 0));
        g.fillRect(14*tc, 6*tc, 4*tc, tc);
        g.fillRect(12*tc, 7*tc, 5*tc, tc);
        g.fillRect(13*tc, 8*tc, 4*tc, tc);
        g.fillRect(14*tc, 9*tc, 3*tc, tc);
        g.fillRect(15*tc, 10*tc, 3*tc, tc);
        g.fillRect(15*tc, 11*tc, 4*tc, tc);
        g.fillRect(14*tc, 12*tc, 4*tc, tc);
        g.fillRect(10*tc, 12*tc, 3*tc, tc);
        g.fillRect(9*tc, 11*tc, 1*tc, 1*tc);
        g.fillRect(13*tc, 11*tc, 1*tc, 1*tc);
        
        g.setColor(new Color(224, 168, 0));
         g.fillRect(13*tc, 13*tc, 4*tc, 1*tc);
         g.fillRect(13*tc, 14*tc, 5*tc, 1*tc);
         g.fillRect(15*tc, 15*tc, 4*tc, 1*tc);
        
         g.setColor(new Color(255, 106, 0));
         g.fillRect(19*tc, 14*tc, 4*tc, 1*tc);
         g.fillRect(19*tc, 12*tc, 5*tc, 1*tc);
         g.fillRect(18*tc, 13*tc, 1*tc, 1*tc);
        
              
//        Lineas
        g.setColor(Color.BLACK);
        for (int i = 0; i < x; i+=tc) {
            g.drawLine(i, 0, i, y);
        }
        for (int i = 0; i < y; i+=tc) {
            g.drawLine(0, i, x, i);
        }
    }
}