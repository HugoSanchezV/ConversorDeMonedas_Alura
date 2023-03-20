package com.sanchez.conversormodenaalura;

import com.sanchez.conversormodenaalura.view.Window;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author Hugo Sánchez Velázquez
 */
public class ConversorModenaAlura {

    private void init() {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
        }
        Window w = new Window();
        w.pack();
        w.setVisible(true);
    }

    public static void main(String[] args) {
        ConversorModenaAlura conversor = new ConversorModenaAlura();
        conversor.init();
    }
}
