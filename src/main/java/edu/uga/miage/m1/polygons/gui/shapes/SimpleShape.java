package edu.uga.miage.m1.polygons.gui.shapes;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

/**
 * This interface defines the <tt>SimpleShape</tt> extension. This extension
 * is used to draw shapes.
 * 
 * @author <a href=
 *         "mailto:christophe.saint-marcel@univ-grenoble-alpes.fr">Christophe</a>
 *
 */

public interface SimpleShape {

    /**
     * Method to draw the shape of the extension.
     * 
     * @param g2 The graphics object used for painting.
     **/
    void draw(Graphics2D g2);

    int getX();

    int getY();

    void move(int x, int y);

    public boolean contains(int x, int y);

    void savePosition();

    List<Integer> previousXPositions = new ArrayList<>();
    List<Integer> previousYPositions = new ArrayList<>();

    void restorePosition();
}