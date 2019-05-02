/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.awt.Color;
import java.awt.geom.Point2D;

/**
 *
 * @author mgisbert
 */
public class point {
    private Point2D joueur1;
    private Color couleur;
    
    public point (Point2D joueur1 , Color couleur){
        this.joueur1 = joueur1;
        this.couleur = couleur;
    }

    public Point2D getJoueur1() {
        return joueur1;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setJoueur1(Point2D joueur1) {
        this.joueur1 = joueur1;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "point{" + "joueur1=" + joueur1 + ", couleur=" + couleur + '}';
    }
    
    
}
