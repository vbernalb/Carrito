/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel  implements ActionListener {

    private final int INITIAL_X = -40;
    private final int INITIAL_Y = 340;
    private final int DELAY = 50;

    private Timer timer;
    private int x, y;
    private int secuencia;

    public Board() {
        this.secuencia = 0;
        initBoard();
    }

    private void initBoard() {
        setBackground(Color.WHITE);
       
        x = INITIAL_X;
        y = INITIAL_Y;
        //Fires one or more ActionEvents at specified intervals.
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image fondo = loadImage("fondo.png");
        g.drawImage(fondo, 0, 0, null);
        
        Image moto = loadImage("scooter.gif");
        g.drawImage(moto, 500, INITIAL_Y, null);
        g.drawRect(500, INITIAL_Y, 102,66);
        
        Image gato = loadImage("cats.gif");
        /*
        
        img - the specified image to be drawn. 
        This method does nothing if img is null. 
        dx1 - the x coordinate of the first corner of the destination rectangle. 
        dy1 - the y coordinate of the first corner of the destination rectangle. 
        dx2 - the x coordinate of the second corner of the destination rectangle. 
        dy2 - the y coordinate of the second corner of the destination rectangle. 
        
        sx1 - the x coordinate of the first corner of the source rectangle. 
        sy1 - the y coordinate of the first corner of the source rectangle. 
        sx2 - the x coordinate of the second corner of the source rectangle. 
        sy2 - the y coordinate of the second corner of the source rectangle. 
        observer - object to be notified as more of the image is scaled and converted.
        
        */
        g.drawImage(gato, x, y,x + 132,y+80,(this.secuencia*132),0,(this.secuencia*132)+132,80,this);
        g.drawRect(x, y, 132,80);
    }

   
    @Override
    public void actionPerformed(ActionEvent e) {
        x += 5;
        if(this.secuencia == 5){
          this.secuencia = 0;
        }else 
            this.secuencia++;
        
       //TAMANO MAXIMO. ESTO DEBE SER AJUSTADO A PARTIR DE VARIABLES. 
       if(x>=900)
           x=INITIAL_X;
       repaint();
    }
    
    public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
}