/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Timer;

/**
 *
 * @author mgisbert
 */
public class Mur {
    private double life=500.0;
    private BufferedImage background_wall;
    private int MB_compteur=0;
    public Mur(){
        try {
            this.background_wall = ImageIO.read(new File("fond_5.png"));
        } catch (IOException ex) {
            Logger.getLogger(test_2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void life_mur(){
        this.life-=this.MB_compteur*0.1;
    }
    
    public double getLife() {
        return this.life;
    }

    public void setLife(double life) {
        this.life = life;
    }

    public BufferedImage getBackground_wall() {
        return background_wall;
    }

    public void setBackground_wall(BufferedImage background_wall) {
        this.background_wall = background_wall;
    }

    public void setMB_compteur(int MB_compteur) {
        this.MB_compteur = MB_compteur;
    }

    public int getMB_compteur() {
        return MB_compteur;
    }
    
    
}
