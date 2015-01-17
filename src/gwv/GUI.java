/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gwv;

import GUI.SpielbrettUI;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author rw
 */
public class GUI extends JFrame {

    SpielbrettUI sbrett = new SpielbrettUI();

    public GUI() {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screen = toolkit.getScreenSize();
 int y= (int) screen.getHeight();
        
        this.setSize(1000, y-10);
        this.setVisible(true);
        setLocationRelativeTo(null);

    }

    public void createGUI(int anz) {

        sbrett.createSpielfeld(anz, 2);
        this.add(sbrett);
        repaint();
    }

}
