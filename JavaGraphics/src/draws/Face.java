
package draws;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Alayon
 */
public class Face extends JPanel{
    
    public void paint(Graphics g){
        //Cara
        g.setColor(Color.YELLOW);
        g.fillOval(100, 100, 400, 400);
        g.setColor(Color.BLACK);
        g.drawOval(100, 100, 400, 400);
        
        //Color de ojo
        g.setColor(Color.white);
        g.fillOval(200, 200, 50, 50);
        g.fillOval(330, 200, 50, 50);
        g.setColor(Color.black);
        
        //Color de pupila
        g.fillOval(215, 215, 20, 20);
        g.fillOval(345, 215, 20, 20);
        
        // cristal de ojo
        g.setColor(Color.CYAN);
        g.fillOval(222, 222, 8, 8);
        g.fillOval(352, 222, 8, 8);
        
        //Boca
        g.setColor(Color.BLACK);
        g.fillOval(200, 310, 200, 100);
        
        //Dientes
        g.setColor(Color.WHITE);
        g.fillRect(265, 312, 25, 25);
        g.fillRect(310, 312, 25, 25);
        
        //Lengua
        g.setColor(Color.RED);
        g.fillOval(250, 390, 100, 20);
        
        //Lentes
        g.setColor(Color.BLACK);
        g.drawOval(190, 190, 70, 70);
        g.drawOval(325, 190, 70, 70);
        g.drawLine(260, 225, 325, 225);
        
        g.drawLine(147, 175, 195, 210);
        g.drawLine(457, 180, 395, 215);
        
        
       //METODO PARA PINTAR LAS COORDENAS DEL CONTEXTO GRAFICO (APROXIMADO)
      /* for (int x = 0; x < 500; x+=50) {
            for (int y = 0; y < 500; y+=15) {
                g.drawString("["+x+","+y+"]", x, y);
            }
        }*/
        
    }
}
