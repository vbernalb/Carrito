/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel  implements ActionListener {

    private final int INITIAL_X = -40;
    private final int INITIAL_Y = -40;
    private final int DELAY = 25;

    private Timer timer;
    private int x, y;

    public Board() {
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
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.fillOval(x, y, 30, 30);
    }

   
    @Override
    public void actionPerformed(ActionEvent e) {
        x += 1;
        y += 1;
       repaint();
    }
}