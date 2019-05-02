/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Martin
 */
public class Ressources {

    static BufferedImage fleche, coeur,fond_4,fond_3,fond_2,fond_1,fond_GO;
    private static int TILE_WIDTH = 32;
    private static int TILE_HEIGHT = 32;
    private static int TILES_PER_ROW = 16;
    private static int TILES_PER_COL = 16;
    static BufferedImage tileperso;
       
public static void init(){
        try {
            tileperso = ImageIO.read(new File("tuiles_projet.png"));
            fond_4 = ImageIO.read(new File("fond_4.png"));
            fond_3 = ImageIO.read(new File("fond_3.png"));
            fond_2 = ImageIO.read(new File("fond_2.png"));
            fond_1 = ImageIO.read(new File("fond_1.png"));
            fond_GO = ImageIO.read(new File("fond_GO.png"));
                      
            
        } catch (IOException ex) {
            Logger.getLogger(Ressources.class.getName()).log(Level.SEVERE, null, ex);
        }
        int tileNumber = 0;
        int tileX = (tileNumber % TILES_PER_ROW) * TILE_WIDTH;
        int tileY = (tileNumber / TILES_PER_ROW) * TILE_HEIGHT;
        fleche = tileperso.getSubimage(tileX, tileY, TILE_WIDTH, TILE_HEIGHT);
        
        tileNumber = 1;
        tileX = (tileNumber % TILES_PER_ROW) * TILE_WIDTH;
        tileY = (tileNumber / TILES_PER_ROW) * TILE_HEIGHT;
        coeur = tileperso.getSubimage(tileX, tileY, TILE_WIDTH, TILE_HEIGHT);

}
        

}
