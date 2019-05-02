/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FenetreGraphique;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author guillaume.laurent
 */
public class TestAffineTransform {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        FenetreGraphique fenetre = new FenetreGraphique("Nyan cat", 300, 250);

        fenetre.effacer(new Color(0, 0, 100));

        BufferedImage image = ImageIO.read(new File("nyancat.png"));

        fenetre.getGraphics2D().drawImage(image, 100, 50, null);

        fenetre.getGraphics2D().drawImage(image, 30, 150, 250, 75, null);

        AffineTransform transform = new AffineTransform();

        transform.translate(200, 80);
        transform.rotate(-Math.PI / 4);

        fenetre.getGraphics2D().drawImage(image, transform, null);

        fenetre.actualiser();

    }

}
