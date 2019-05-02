/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ecouteurs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author christophe.varnier
 */
public class EcouteurClavier implements KeyListener {

    @Override
    public void keyPressed(KeyEvent event) {
        System.out.print("une touche a été appuyée - ");
        System.out.println("le code de la touche est " + event.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent event) {
        System.out.print("un caractère a été frappé - ");
        System.out.println("'" + event.getKeyChar() + "'");
    }

    @Override
    public void keyReleased(KeyEvent event) {
        System.out.println("touche relachée : " + event.getKeyCode());
    }
}
