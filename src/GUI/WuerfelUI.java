/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author rw
 */
public class WuerfelUI extends JLabel {

    ImageIcon wuerfel1 = new ImageIcon(getClass().getResource("/resources/Bilder/wuerfel1.png"));
    ImageIcon wuerfel2 = new ImageIcon(getClass().getResource("/resources/Bilder/wuerfel2.png"));
    ImageIcon wuerfel3 = new ImageIcon(getClass().getResource("/resources/Bilder/wuerfel3.png"));
    ImageIcon wuerfel4 = new ImageIcon(getClass().getResource("/resources/Bilder/wuerfel4.png"));
    ImageIcon wuerfel5 = new ImageIcon(getClass().getResource("/resources/Bilder/wuerfel5.png"));
    ImageIcon wuerfel6 = new ImageIcon(getClass().getResource("/resources/Bilder/wuerfel6.png"));

    public WuerfelUI(){
         this.setIcon(wuerfel1);
                
    }

    public void setWuerfel(int i) {
        switch (i) {
            case 1:
                this.setIcon(wuerfel1);
                break;
            case 2:
                this.setIcon(wuerfel2);
                break;
            case 3:
                this.setIcon(wuerfel3);
                break;
            case 4:
                this.setIcon(wuerfel4);
                break;
            case 5:
                this.setIcon(wuerfel5);
                break;
            case 6:
                this.setIcon(wuerfel6);
                break;
            default:

        }

    }

}
