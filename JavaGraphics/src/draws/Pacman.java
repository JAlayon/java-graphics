
package draws;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author Alayon
 */

public class Pacman extends JPanel{
    
    public void paint(Graphics g){
        //Pacman
        g.setColor(Color.yellow);
        g.fillArc(100, 100, 300, 300, 25, 300);
        
        //Ojo
        g.setColor(Color.BLACK);
        g.fillOval(220, 160, 50, 50);
        //Pupila
        g.setColor(Color.WHITE);
        g.fillOval(235, 170, 15, 15);
        
        //Fantasmas
        //Cuerpo
        g.setColor(Color.CYAN);
        g.fillArc(440, 200, 100, 150, 0, 180);
        g.fillRect(441, 275, 100, 50);
        //Ojos
        g.setColor(Color.white);
        g.fillOval(470, 220, 20, 20);
        g.fillOval(495, 220, 20, 20);
        //Pupila
        g.setColor(Color.BLACK);
        g.fillOval(475, 225, 5, 5);
        g.fillOval(500, 225, 5, 5);
        
        g.setColor(Color.RED);
        g.fillArc(550, 200, 100, 150, 0, 180);
        g.fillRect(551, 275, 100, 50);
        g.setColor(Color.white);
        g.fillOval(580, 220, 20, 20);
        g.fillOval(610, 220, 20, 20);
        g.setColor(Color.BLACK);
        g.fillOval(590, 225, 5, 5);
        g.fillOval(615, 225, 5, 5);
        
        
        g.setColor(Color.PINK);
        g.fillArc(660, 200, 100, 150, 0, 180);
        g.fillRect(661, 275, 100, 50);
        g.setColor(Color.white);
        g.fillOval(690, 220, 20, 20);
        g.fillOval(720, 220, 20, 20);
        g.setColor(Color.BLACK);
        g.fillOval(700, 225, 5, 5);
        g.fillOval(725, 225, 5, 5);
        
        g.setColor(Color.BLACK);
    }
    
}