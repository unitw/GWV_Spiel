/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author rw
 */
public class FeldUI extends JLabel {

    ImageIcon feldpic = new ImageIcon(getClass().getResource("/resources/Bilder/feldbr.png"));

    int xpos;
    int ypos;
    int breite = 60;
    int hoehe = 60;
    int idx;

    public FeldUI(int x, int y, int index) {
        this.xpos = x;
        this.ypos = y;
        this.idx = index;
        this.setBounds(x, y, breite, hoehe);
        this.setIcon(feldpic);

        this.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Image image = toolkit.getImage(getClass().getResource("/resources/Bilder/blaueshütchen.png"));
                Cursor c = toolkit.createCustomCursor(image, new Point(getParent().getX(),
                        getParent().getY()), "img");
                setCursor(c);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(Cursor.getDefaultCursor());
            }
        });

    }

    public void setidx(int i) {
        this.idx = i;
    }

    public int getidx() {
        return idx;
    }
}
