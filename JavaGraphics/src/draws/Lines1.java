
package draws;

import java.awt.Canvas;
import java.awt.Graphics;

public class Lines1 extends Canvas {

    @Override
    public void paint(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        
        //vertical
        g.drawLine(width/2, 0, width/2, height);
        //horizontal
        g.drawLine(0, height/2, width, height/2);
        //cruzados
        g.drawLine(0, 0, width, height);
        g.drawLine(0, height, width, 0);
    }
    
}
