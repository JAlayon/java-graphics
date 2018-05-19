
package test;

import draws.*;
import javax.swing.JTabbedPane;

/**
 *
 * @author Alayon
 */
//PANEL CON PESTAÑAS PARA AÑADIR LOS DIBUJOS
public class PanelDrawing extends JTabbedPane {
    
    public PanelDrawing(){
        this.addTab("Dibujo 1", new Lines1());
        this.addTab("Dibujo 2", new Lines2());
        this.addTab("Dibujo 3", new Lines3());
        this.addTab("Dibujo 4", new Face());
        this.addTab("Dibujo 5", new Pacman());
        this.addTab("Dibujo 6", new Star());
        this.addTab("Dibujo 7", new PixelArt1());
        this.addTab("Dibujo 8", new PixelArt2());
        
    }
    
}
