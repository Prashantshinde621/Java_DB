/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ImageJPanel.java
 *
 *
 */
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import java.awt.Composite;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import javax.imageio.ImageWriter;

/**
 *
 
 */
public class ImageJPanel extends javax.swing.JPanel {

    public  String src = "";
    private String dir = System.getProperty("user.dir") + "";

    /** Creates new form ImageJPanel */
    public ImageJPanel()
    {
        initComponents();

    }

    @Override
    public void paint(Graphics g) {
     super.paint(g);
        //           Image image = ImageIO.read(new File(System.getProperty("user.dir") + "//12.jpg"));
        if (!src.equals("")) {
            BufferedImage temp = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = temp.createGraphics();

            try {
                Image image = ImageIO.read(new File(dir+"//"+src));

               g2.drawImage(image, 0, 0, getWidth(), getHeight(), null);

                g.drawImage(temp, 0, 0, getWidth(), getHeight(), null);
                g2.dispose();

            } catch (IOException ex) {
                Logger.getLogger(ImageJPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(ImageJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBorder(javax.swing.BorderFactory.createTitledBorder("Image"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    }
