/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author rw
 */
public class SpielbrettUI extends JPanel implements Observer {

    int _anzahlfelder;
    int xbrett = 220;
    int ybrett = 250;
    Color bg = new Color(0xffff80);

    public SpielbrettUI() {
        this.setSize(1000, 600);
        this.setLayout(null);
        setBackground(bg);
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

    }

    public void createSpielfeld(int anzfelder, int spieler) {
        FeldUI feldarray[] = new FeldUI[anzfelder];
        for (int i = 0; i < anzfelder; i++) {
            feldarray[i] = new FeldUI(xbrett, ybrett, i);
            this.add(feldarray[i]);

            int reihe = anzfelder / 2;

            xbrett += 75;
            if (xbrett > this.getWidth()) {
                ybrett += 75;
                xbrett = 0;
            }
        }

        switch (spieler) {
            case 1:
                createHomerBase(1);

                break;
            case 2:
                createHomerBase(2);

                break;
            case 3:
                createHomerBase(3);
                break;

            case 4:
                createHomerBase(4);
                break;

        }

    }

    public void createHomerBase(int Anzahlbasen) {

        for (int i = 0; i < Anzahlbasen; i++) {
            Homebase[] base = new Homebase[Anzahlbasen];
            base[i] = new Homebase();
            base[i].setIndex(i);

            switch (base[i].getIndex()) {
                case 0:
                    base[i].setBounds(10, 5, base[i].getWidth(), base[i].getHeight());
                    base[i].setBackground(Color.BLUE);
                    break;
                case 1:
                    base[i].setBounds(this.getWidth() - 135, 5, base[i].getWidth(), base[i].getHeight());
                    base[i].setBackground(Color.RED);

                    break;
                case 2:
                    base[i].setBounds(10, this.getHeight() - 135, base[i].getWidth(), base[i].getHeight());
                    base[i].setBackground(Color.GREEN);

                    break;
                case 3:
                    base[i].setBounds(this.getWidth() - 135, this.getHeight() - 160, base[i].getWidth(), base[i].getHeight());
                    base[i].setBackground(Color.YELLOW);

                    break;

            }

            this.add(base[i]);

        }

    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
