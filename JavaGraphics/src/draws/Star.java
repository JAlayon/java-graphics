
package draws;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Alayon
 */
public class Star extends JPanel{
    
    public void paint(Graphics g){
        int x[]={230,230,330,240,290,200,100,160,70,170};
        int y[]={60,170,150,210,300,260,300,210,150,170};
        
        g.drawPolygon(x, y, 10);
        
        /*Star w = new Star();
        w.addPoint(100, 100);
        w.addPoint(100, 100);
        g.drawPolygon(w);*/
    }
}
