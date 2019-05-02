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
public class TestGetPixel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        FenetreGraphique fenetre = new FenetreGraphique("Nyan cat", 300, 250);

        fenetre.effacer(new Color(0, 0, 100));

        BufferedImage image = ImageIO.read(new File("nyancat.png"));

        fenetre.getGraphics2D().drawImage(image, 100, 50, null);

        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                System.out.print(image.getRGB(x, y) + ", ");

            }
            System.out.println("");
        }

        fenetre.actualiser();

    }

}
