package com.sanchez.conversormodenaalura.view;

import com.sanchez.conversormodenaalura.controller.ControllerMoneda;
import javax.swing.JOptionPane;

/**
 *
 * @author Hugo Sánchez Velázquez
 */
public class Window extends javax.swing.JFrame {

    /**
     * Creates new form Window
     */
    public Window() {
        initComponents();
        ControllerMoneda controller = new ControllerMoneda();
        controller.llenarCombo(boxR);
        controller.llenarCombo(boxL);

        boxL.setSelectedIndex(3);

    }

    private void boxLeftToRight() {
        ControllerMoneda controllerMoneda = new ControllerMoneda();
        controllerMoneda.convertirMoneda(spinnerL, spinnerR,
                boxL.getSelectedItem().toString(),
                boxR.getSelectedItem().toString());
    }
    
    private void boxRightToLeft() {
        ControllerMoneda controllerMoneda = new ControllerMoneda();
        controllerMoneda.convertirMoneda(spinnerR, spinnerL,
                boxR.getSelectedItem().toString(),
                boxL.getSelectedItem().toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        background = new javax.swing.JPanel();
        boxR = new javax.swing.JComboBox<>();
        boxL = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        spinnerL = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        spinnerR = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(248, 244, 244));
        background.setLayout(new java.awt.GridBagLayout());

        boxR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxR.setForeground(new java.awt.Color(57, 57, 57));
        boxR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxRActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        background.add(boxR, gridBagConstraints);

        boxL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxL.setForeground(new java.awt.Color(57, 57, 57));
        boxL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxLActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        background.add(boxL, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText(" = ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        background.add(jLabel1, gridBagConstraints);

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Alura");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        background.add(jLabel2, gridBagConstraints);

        spinnerL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        spinnerL.setForeground(new java.awt.Color(51, 51, 51));
        spinnerL.setText("0");
        spinnerL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spinnerLKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spinnerLKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spinnerL, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spinnerL, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        background.add(jPanel1, gridBagConstraints);

        spinnerR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        spinnerR.setForeground(new java.awt.Color(51, 51, 51));
        spinnerR.setText("0");
        spinnerR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                spinnerRKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spinnerRKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spinnerR, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spinnerR, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        background.add(jPanel2, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxLActionPerformed
        ControllerMoneda controllerMoneda = new ControllerMoneda();
        controllerMoneda.convertirMoneda(spinnerL, spinnerR,
                boxL.getSelectedItem().toString(),
                boxR.getSelectedItem().toString());
    }//GEN-LAST:event_boxLActionPerformed

    private void boxRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxRActionPerformed
        ControllerMoneda controllerMoneda = new ControllerMoneda();
        controllerMoneda.convertirMoneda(spinnerL, spinnerR,
                boxL.getSelectedItem().toString(),
                boxR.getSelectedItem().toString());
    }//GEN-LAST:event_boxRActionPerformed

    private void spinnerLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spinnerLKeyTyped
        // TODO add your handling code here:
        if ((Character.isLetter(evt.getKeyChar())
                || Character.isSpaceChar(evt.getKeyChar()))
                && !(evt.getKeyChar() == '.')) {
            evt.consume();
        }

        if ((evt.getKeyChar() == '.') && spinnerL.getText().contains(".")) {
            evt.consume();
        }
        if (spinnerL.getText().length() == 0) {
            spinnerL.setText("0");
        }
    }//GEN-LAST:event_spinnerLKeyTyped

    private void spinnerRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spinnerRKeyTyped
        // TODO add your handling code here:
        if ((Character.isLetter(evt.getKeyChar())
                || Character.isSpaceChar(evt.getKeyChar()))
                && !(evt.getKeyChar() == '.')) {
            evt.consume();
        }

        if ((evt.getKeyChar() == '.') && spinnerR.getText().contains(".")) {
            evt.consume();
        }
        if (spinnerR.getText().length() == 0) {
            spinnerR.setText("0");
        }
    }//GEN-LAST:event_spinnerRKeyTyped

    private void spinnerLKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spinnerLKeyReleased
        // TODO add your handling code here:

        if (this.spinnerL.getText().charAt(0) == '0'
                && spinnerL.getText().length() > 1) {
            spinnerL.setText(spinnerL.getText().substring(1));
        }

        try {
            this.boxLeftToRight();
        } catch (Exception e) {
            spinnerL.setText("0");
            this.boxLeftToRight();
            JOptionPane.showMessageDialog(null,
                    "No puedes escribir caracteres especiales",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_spinnerLKeyReleased

    private void spinnerRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spinnerRKeyReleased
        // TODO add your handling code here:
        if (this.spinnerR.getText().charAt(0) == '0'
                && spinnerR.getText().length() > 1) {
            spinnerR.setText(spinnerR.getText().substring(1));
        }

        try {
            this.boxRightToLeft();
        } catch (Exception e) {
            spinnerR.setText("0");
            this.boxRightToLeft();
            JOptionPane.showMessageDialog(null,
                    "Ocurrio un error",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_spinnerRKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Window().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JComboBox<String> boxL;
    private javax.swing.JComboBox<String> boxR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField spinnerL;
    private javax.swing.JTextField spinnerR;
    // End of variables declaration//GEN-END:variables
}
