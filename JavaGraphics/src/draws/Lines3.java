/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draws;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author User
 */
public class Lines3 extends Canvas {

    @Override
    public void paint(Graphics g) {

        int height = getSize().height;
        int width = getSize().width;
        int yi = 0;         // y inicial
        int xf = 10;        // x final
       
        for (int i = 0; i < 100; i++) {
            g.setColor(Color.MAGENTA);
            g.drawLine(0, yi, xf, height);
            
            g.setColor(Color.GREEN);
            g.drawLine(width, yi + 10, width -xf , height);
            
            g.setColor(Color.DARK_GRAY);
            g.drawLine(0, 10 + height - yi, xf, 0);
            
            g.setColor(Color.RED);
            g.drawLine(width, height - yi, width - xf, 0);
            xf+=10;
            yi+=10;
        }
        
        
    }
}
