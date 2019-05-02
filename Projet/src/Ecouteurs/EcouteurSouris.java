/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecouteurs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author christophe.varnier
 */
public class EcouteurSouris implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.print("une sourie a été appuyée - ");
        System.out.println("la sourie a cliqué en X= " + e.getX() +" Y= "+ e.getY());
        System.out.println("la sourie a cliqué : "+e.getClickCount() + " fois");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.print("une touche a été appuyée - ");
        System.out.println("le code de la touche est " + e.getButton());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("touche relachée : " + e.getLocationOnScreen());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("la sourie est dans la fenetre ");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("la sourie n'est plus dans la fenetre ");
    }
    

}
