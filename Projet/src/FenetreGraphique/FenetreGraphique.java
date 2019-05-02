package FenetreGraphique;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Classe de dessin 2D
 *
 * @author guillaume.laurent
 */
public class FenetreGraphique extends JFrame {

    private BufferedImage image;
    private Graphics2D graphics;
    private int largeur, hauteur;
    private long tempsDerniereActualisation;

    public FenetreGraphique(String titre, int largeur, int hauteur) {
        this(titre, largeur, hauteur, 0, 0);
    }

    public FenetreGraphique(String titre, int largeur, int hauteur, int positionX, int positionY) {
        super(titre);

        if (largeur <= 0 || hauteur <= 0) {
            throw new IllegalArgumentException("La largeur et la hauteur de la fenetre doivent être positives");
        }

        this.largeur = largeur;
        this.hauteur = hauteur;
        setSize(largeur, hauteur);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        image = new BufferedImage(largeur, hauteur, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.addRenderingHints(rh);
        effacer(Color.WHITE);
        graphics.setColor(Color.BLACK);

        ImageIcon icon = new ImageIcon(image);
        JLabel draw = new JLabel(icon);
        setContentPane(draw);
        pack();
        setLocation(positionX, positionY);
        setVisible(true);
    }

    public Graphics2D getGraphics2D() {
        return graphics;
    }

    public void actualiser() {
        this.paint(this.getGraphics());
    }

    public void actualiser(long millisecondes) {
        while (System.currentTimeMillis() - tempsDerniereActualisation < millisecondes) {
            attendre(1);
        }
        tempsDerniereActualisation = System.currentTimeMillis();
        repaint();
    }

    public void attendre(long millisecondes) {
        try {
            Thread.sleep(millisecondes);
        } catch (InterruptedException ex) {
            Logger.getLogger(FenetreGraphique.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void fermer() {
        dispose();
    }

    public void effacer() {
        effacer(Color.WHITE);
    }

    public void effacer(Color couleur) {
        Color couleurCourante = graphics.getColor();
        graphics.setColor(couleur);
        graphics.fillRect(0, 0, largeur, hauteur);
        graphics.setColor(couleurCourante);
    }

    public void enregistrerImage(String nomDuFichierPNG) {
        if (nomDuFichierPNG == null || nomDuFichierPNG.equals("")) {
            throw new IllegalArgumentException("Le nom du fichier ne peut être vide.");
        }
        String suffix = nomDuFichierPNG.substring(nomDuFichierPNG.lastIndexOf('.') + 1);

        if (suffix.toLowerCase().equals("png")) {
            try {
                File file = new File(nomDuFichierPNG);
                ImageIO.write(image, suffix, file);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            throw new IllegalArgumentException("Le format du fichier doit être png.");
        }
    }

}
