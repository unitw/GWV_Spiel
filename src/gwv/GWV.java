/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gwv;

import GUI.SpielbrettUI;
import javax.swing.JFrame;

/**
 *
 * @author rw
 */
public class GWV  {

    static GUI gui ;

    

    public static void main(String[] args) {
       gui= new GUI();
       gui.createGUI(20);
    }

}
