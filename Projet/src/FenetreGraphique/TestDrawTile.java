/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FenetreGraphique;

import FenetreGraphique.FenetreGraphique;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author guillaume.laurent
 */
public class TestDrawTile {

    private static int TILE_WIDTH = 32;
    private static int TILE_HEIGHT = 32;

    private static int TILES_PER_ROW = 16;
    private static int TILES_PER_COL = 16;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedImage tileSet = ImageIO.read(new File("tileSetMinecraft32x32.png"));
        
        
        int tileNumber = 254;
        int tileX = (tileNumber % TILES_PER_ROW) * TILE_WIDTH;
        int tileY = (tileNumber / TILES_PER_ROW) * TILE_HEIGHT;
        BufferedImage tile = tileSet.getSubimage(tileX, tileY, TILE_WIDTH, TILE_HEIGHT);

        FenetreGraphique fenetre = new FenetreGraphique("Hello World!", 20 * TILE_WIDTH, 10 * TILE_HEIGHT);

        fenetre.effacer(new Color(175, 226, 255));

        Graphics2D contexte = fenetre.getGraphics2D();

        contexte.drawImage(tile, 100, 100, null);
        fenetre.actualiser();
        Thread.sleep(1000);
        fenetre.effacer(new Color(175, 226, 255));
        fenetre.actualiser();

        contexte.drawImage(tile, 132, 100, null);
        fenetre.actualiser();
        Thread.sleep(1000);
        fenetre.effacer(new Color(175, 226, 255));
        fenetre.actualiser();
        
        contexte.drawImage(tile, 164, 100, null);
        fenetre.actualiser();
        Thread.sleep(1000);
        fenetre.effacer(new Color(175, 226, 255));
        fenetre.actualiser();
    }

}
