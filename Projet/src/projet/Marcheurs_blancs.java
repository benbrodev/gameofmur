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
public class Marcheurs_blancs {
    private int X;
    private int Y;
    private Point2D coord;
    private BufferedImage skin;
    private int TILE_WIDTH = 32;
    private int TILE_HEIGHT = 32;
    private int TILES_PER_ROW = 16;
    private int TILES_PER_COL = 16;
    private long anniversaire;
    private int life=3;
    private boolean on_the_wall= false;
    Joueur last_hit;
    
    public Marcheurs_blancs() {
        BufferedImage tileperso;
        this.X= 1070;
        this.Y= (int) (Math.random()*1000);
        this.anniversaire =System.currentTimeMillis();
        
        try {
            tileperso = ImageIO.read(new File("tuiles_projet.png"));
            int tileNumber = 18;
            int tileX = (tileNumber % TILES_PER_ROW) * TILE_WIDTH;
            int tileY = (tileNumber / TILES_PER_ROW) * TILE_HEIGHT;
            this.skin = tileperso.getSubimage(tileX, tileY, TILE_WIDTH, TILE_HEIGHT);
        } catch (IOException ex) {
            Logger.getLogger(Joueur.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public boolean isOn_the_wall() {
        return on_the_wall;
    }

    public void setOn_the_wall(boolean on_the_wall) {
        this.on_the_wall = on_the_wall;
    }

    public long getAnniversaire() {
        return anniversaire;
    }

    public void setAnniversaire(long anniversaire) {
        this.anniversaire = anniversaire;
    }
    
    public Point2D getCoord() {
        return coord;
    }

    public BufferedImage getSkin() {
        return skin;
    }

    public void setX(int X) {
        this.X = X;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
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

    public void setCoord(Point2D coord) {
        this.coord = coord;
    }

    public void setSkin(BufferedImage skin) {
        this.skin = skin;
    }

    public void setTILE_WIDTH(int TILE_WIDTH) {
        this.TILE_WIDTH = TILE_WIDTH;
    }

    public void setTILE_HEIGHT(int TILE_HEIGHT) {
        this.TILE_HEIGHT = TILE_HEIGHT;
    }

    public void setTILES_PER_ROW(int TILES_PER_ROW) {
        this.TILES_PER_ROW = TILES_PER_ROW;
    }

    public void setTILES_PER_COL(int TILES_PER_COL) {
        this.TILES_PER_COL = TILES_PER_COL;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
    
    
    
    
    
    
}
