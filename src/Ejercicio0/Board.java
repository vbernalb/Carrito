/*
PLANTILLA BASE PARA CREACION DE ESCENARIOS.
 */
package Ejercicio0;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener{
    private int xref; 
    private Timer timer;
    private int yref;

    public Board() {
        this.xref = 45;
        this.yref = 10;
        this.timer = new Timer (25,this);
        this.timer.start();
    }
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
    /*    g.drawLine(0, 0, 100, 100);
        g.drawOval(50, 20, 20, 20);
        g.drawString("Puntaje", 20,10);
        g.drawRect(10, 20, 20, 20);
        int x[] = {35,25,45};
        int y[] = {50,70,70};
        g.drawPolygon(x, y, 3);*/
        
        
        
        g.drawRect(xref, 80, 60, 10);
        g.fillRect(xref, 80, 60, 10);
        g.setColor(Color.BLACK);
        g.drawOval(xref+10, 90, 10, 10);
        g.fillOval(xref+10, 90, 10, 10);
        g.drawOval(xref+40, 90, 10, 10);
        g.fillOval(xref+40, 90, 10, 10);
        int[] x = {xref+10,xref+20,xref+40,xref+50};
        int[] y = {80,70,70,80};
        g.setColor(Color.MAGENTA);
        g.drawPolygon(x, y, 4);
        g.fillPolygon(x, y, 4);
        g.drawLine(-10000, 100,+10000 , 100);
        g.drawRect(xref, 70, 60, 30); //carro
        g.drawOval(xref, yref , 10, 10);
        g.drawRect(xref, yref, 10, 10); // ovalo
        
        Rectangle car = new Rectangle(xref, 70, 60, 30);
        Rectangle oval = new Rectangle(xref, yref, 10, 10);
        
                if(car.intersects(oval)){
                    this.timer.stop();
                }
    }   
    
    @Override
    public void actionPerformed(ActionEvent e) {
     this.xref++;
     this.yref++;
     repaint();
    }
    
    
    
    
    
    
    
    
    
    
/*
    private void dibujarEscenario(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        //the first two parameters are the position (x,y) and after comes the width and the height
        g2d.fillOval(0, 0, 30, 30);
        g2d.drawOval(0, 50, 30, 30);
               
        g2d.fillRect(50, 0, 30, 30); 
        g2d.drawRect(50, 50, 30, 30);
        
        g2d.drawString("Puntaje del Juego", 100, 100);
        
}
    }
    */

    
}