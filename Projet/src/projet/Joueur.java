/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.awt.geom.Point2D;
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
public class Joueur {
    private Point2D coord;
    private int X=92;
    private int Y=300;
    private BufferedImage skin;
    private int TILE_WIDTH = 32;
    private int TILE_HEIGHT = 32;
    private int TILES_PER_ROW = 16;
    private int TILES_PER_COL = 16;
    boolean up = false;
    boolean down = false;
    public int kill=0;

    public Joueur() {
        BufferedImage tileperso;
        try {
            tileperso = ImageIO.read(new File("tuiles_projet.png"));
            int tileNumber = 17;
            int tileX = (tileNumber % TILES_PER_ROW) * TILE_WIDTH;
            int tileY = (tileNumber / TILES_PER_ROW) * TILE_HEIGHT;
            this.skin = tileperso.getSubimage(tileX, tileY, TILE_WIDTH, TILE_HEIGHT);
        } catch (IOException ex) {
            Logger.getLogger(Joueur.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Point2D getCoord() {
        return coord;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public void setSkin(BufferedImage skin) {
        this.skin = skin;
    }

    public BufferedImage getSkin() {
        return skin;
    }

    public int getTILE_WIDTH() {
        return TILE_WIDTH;
    }

    public int getTILE_HEIGHT() {
        return TILE_HEIGHT;
    }

    public int getTILES_PER_ROW() {
        return TILES_PER_ROW;
    }

    public int getTILES_PER_COL() {
        return TILES_PER_COL;
    }
    
   
}
