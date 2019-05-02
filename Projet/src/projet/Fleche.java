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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Martin
 */
public class Fleche {
    private int X;
    private int Y;
    private BufferedImage skin;
    private int TILE_WIDTH = 22;
    private int TILE_HEIGHT = 4;
    private int TILES_PER_ROW = 16;
    private int TILES_PER_COL = 16;
    private long anniversaire;
    private int degats=1;
    private boolean destroy=false;
    private Joueur player;
    
    public Fleche(Joueur player) {
        BufferedImage tileperso;
        this.X=player.getX()+10;
        this.Y=player.getY();
        this.anniversaire =System.currentTimeMillis();
        this.player = player;
        
        
       /* try {
            tileperso = ImageIO.read(new File("tuiles_projet.png"));
            int tileNumber = 0;
            int tileX = (tileNumber % TILES_PER_ROW) * TILE_WIDTH;
            int tileY = (tileNumber / TILES_PER_ROW) * TILE_HEIGHT;
            this.skin = tileperso.getSubimage(tileX, tileY, TILE_WIDTH, TILE_HEIGHT);
        } catch (IOException ex) {
            Logger.getLogger(Joueur.class.getName()).log(Level.SEVERE, null, ex);
        }*/
       this.skin=Ressources.fleche;
        
    }

    public long getAnniversaire() {
        return anniversaire;
    }

    public void setAnniversaire(long anniversaire) {
        this.anniversaire = anniversaire;
    }

    public void setX(int X) {
        this.X = X;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public void setSkin(BufferedImage skin) {
        this.skin = skin;
    }

    public int getX() {
        return X;
    }

    public boolean isDestroy() {
        return destroy;
    }
    
    public int getY() {
        return Y;
    }

    public BufferedImage getSkin() {
        return skin;
    }
    public void collision(ArrayList<Marcheurs_blancs> liste){
        for(Marcheurs_blancs marcheur:liste){
            //System.out.println(Math.abs(this.X-marcheur.getX()));
            if(Math.abs(this.X-marcheur.getX())<=10&&Math.abs(this.Y-marcheur.getY())<=28){
                this.destroy=true;
                marcheur.setLife(marcheur.getLife()-this.degats);
                marcheur.last_hit=this.player;
                //System.out.println("touche");
            }
        }
    
    }
}
