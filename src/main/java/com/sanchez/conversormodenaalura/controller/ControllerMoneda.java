package com.sanchez.conversormodenaalura.controller;

import java.text.DecimalFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Hugo Sánchez Velázquez
 */
public class ControllerMoneda {

    // Llena los combobox con los valores del ENUM
    public void llenarCombo(JComboBox box) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (Monedas moneda : Monedas.values()) {
            model.addElement(moneda.getNombre());
        }
        box.setModel(model);
    }

    // Se encarga del calculo de la conversion
    public void convertirMoneda(JTextField spinnerL, JTextField spinnerR,
            String moneda1, String moneda2) {
        // Objeto para dar formato a los numeros
        DecimalFormat format = new DecimalFormat("#.###");

        Double cantidad = Double.valueOf(spinnerL.getText());

        Double cambioMoneda1 = Monedas.valueOf(moneda1)
                .getTipoDeCambioEquivalente() * cantidad;

        
        if (moneda2.equals("MXN")) {
            spinnerR.setText(cambioMoneda1.toString());
            return;
        }

        Double cambioMoneda2 = Monedas.valueOf(moneda2)
                .getTipoDeCambioEquivalente();
        
        if (moneda1.equals("MXN")) {
            spinnerR.setText(format.format(cantidad / cambioMoneda2));
            return;
        }

        Double resultado = cambioMoneda1 / cambioMoneda2;

        spinnerR.setText(format.format(resultado));
    }
}
