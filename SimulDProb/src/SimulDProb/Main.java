/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SimulDProb;

import DistProb.interfaces.MainMDI;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.pushingpixels.substance.api.skin.SubstanceBusinessBlueSteelLookAndFeel;

/**
 *
 * @author Steve
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    UIManager.setLookAndFeel(new SubstanceBusinessBlueSteelLookAndFeel());
                    new MainMDI().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                }
            }
        });
    }
}
