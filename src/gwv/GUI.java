/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gwv;

import GUI.SpielbrettUI;
import GUI.WuerfelUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author rw
 */
public class GUI extends JFrame {

    SpielbrettUI sbrett = new SpielbrettUI();

    public GUI() {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screen = toolkit.getScreenSize();
        int y = (int) screen.getHeight();

        this.setSize(1000, y - 10);
        this.setVisible(true);
        setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

    }

    public void createGUI(int anz) {

        sbrett.createSpielfeld(anz, 2);
       // this.add(sbrett, BorderLayout.NORTH);
        this.add(createWürfelPanel());
        repaint();
    }

    public JPanel createWürfelPanel() {
        JPanel pan = new JPanel();
        pan.setBorder(BorderFactory.createTitledBorder("Würfel"));
        WuerfelUI wui= new WuerfelUI();
        wui.setBounds(45, 45, 0, 0);
        pan.add(wui);
        pan.setSize(100, 100);
        Icon icon = wui.getIcon();
        return pan;
    }

}
