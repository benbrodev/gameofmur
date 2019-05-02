/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecouteurs;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author christophe.varnier
 */
public class TestEcouteurs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame fenetre = new JFrame("Ma fenêtre");
        fenetre.setVisible(true);
        fenetre.setSize(400, 200);
        fenetre.getContentPane().add(new JButton("test"));
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.addKeyListener(new EcouteurClavier());
        fenetre.addMouseListener(new EcouteurSouris());
    }

}
