/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio0;

import javax.swing.JFrame;

public class Application extends JFrame {
    public Application() {
       initUI();
    }

    private void initUI() {

        add(new Board());
        setSize(250, 200);
        setTitle("Ejercicio 0");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    
    public static void main(String[] args) {
        Application ex = new Application();
        ex.setVisible(true);
       
    }
}
