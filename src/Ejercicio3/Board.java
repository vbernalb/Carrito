/*
PLANTILLA BASE PARA CREACION DE ESCENARIOS.
 */
package Ejercicio3;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class Board extends JPanel implements MouseListener{

    private Color color;
    private URL url = null;
     
    public Board() {
        this.color=Color.RED;
        this.addMouseListener(this);
    }

    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        dibujarEscenario(g);
    }

    private void dibujarEscenario(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(this.color);
        //the first two paramehis.ters are the position (x,y) and after comes the width and the height
        g2d.fillOval(0, 0, 30, 30);
        g2d.drawOval(0, 50, 30, 30);
               
        g2d.fillRect(50, 0, 30, 30); 
        g2d.drawRect(50, 50, 30, 30);
        
        g2d.drawString("Puntaje del Juego", 100, 100);
        
    }
    
      public Rectangle getBounds() {
        return new Rectangle(0, 0, 30, 30);
      }
    
    //Se llama cuando se oprime y se suelta un botón en el mouse
    @Override
    public void mouseClicked(MouseEvent e) {
         Point mp = e.getPoint();
         if(getBounds().contains(mp)){
             try {
                 url = new URL("file:ball.wav");
                 AudioClip ac = Applet.newAudioClip(url);
                 ac.play();
             } catch (MalformedURLException ex) {
                 Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             
             if(this.color==Color.RED)
              this.color=Color.black;
             else
                 this.color=Color.RED;
             repaint();
         }  
    }

    //Es llamado cuando se oprime un botón en el Mouse.
    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    // Ocurre cuando se suelta un botón en el Mouse.
    @Override
    public void mouseReleased(MouseEvent e) {

    }
    //Ocurre cuando el cursor entra dentro de los límites del componente.
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    //Ocurre cuando el cursor sale dentro de los límites del componente.
    @Override
    public void mouseExited(MouseEvent e) {

    }

    
}