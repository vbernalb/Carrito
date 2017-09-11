/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;
import javax.swing.JFrame;

public class Application extends JFrame {
    
    public Application() {

        initUI();
    }

    private void initUI() {
        add(new Board());
        setSize(1024, 512);
        setTitle("Ejercicio 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    
    public static void main(String[] args) {
        Application ex = new Application();
        ex.setVisible(true);
       
    }
}
