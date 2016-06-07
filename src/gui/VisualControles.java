/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author ramon12
 */
public class VisualControles extends javax.swing.JFrame {

    /**
     * Creates new form VisualControles
     */
    public VisualControles() {
        initComponents();
        EstadoCivilBox.setSelectedIndex(-1);
        CheckBachillerato.setSelected(false);
        CheckLicenciatura.setSelected(false);
        CheckPosgrado.setSelected(true);
    }
double cuota;
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        EstadoCivilBox = new javax.swing.JComboBox();
        CheckBachillerato = new javax.swing.JRadioButton();
        CheckLicenciatura = new javax.swing.JRadioButton();
        CheckPosgrado = new javax.swing.JRadioButton();
        jCheckBoxBecado = new javax.swing.JCheckBox();
        jCheckBoxHomologado = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EstadoCivilBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Soltero", "Casado", "Viudo", "Divorsiado" }));
        EstadoCivilBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoCivilBoxActionPerformed(evt);
            }
        });

        buttonGroup1.add(CheckBachillerato);
        CheckBachillerato.setText("Bachillerato");
        CheckBachillerato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBachilleratoActionPerformed(evt);
            }
        });

        buttonGroup1.add(CheckLicenciatura);
        CheckLicenciatura.setText("licenciatura");
        CheckLicenciatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckLicenciaturaActionPerformed(evt);
            }
        });

        buttonGroup1.add(CheckPosgrado);
        CheckPosgrado.setText("Posgrado");
        CheckPosgrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckPosgradoActionPerformed(evt);
            }
        });

        jCheckBoxBecado.setText("Becado");
        jCheckBoxBecado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBecadoActionPerformed(evt);
            }
        });

        jCheckBoxHomologado.setText("Homologado");
        jCheckBoxHomologado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxHomologadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckPosgrado)
                    .addComponent(EstadoCivilBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckBachillerato)
                            .addComponent(CheckLicenciatura))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxHomologado)
                            .addComponent(jCheckBoxBecado))))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EstadoCivilBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBachillerato)
                    .addComponent(jCheckBoxBecado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckLicenciatura)
                    .addComponent(jCheckBoxHomologado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckPosgrado)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckBachilleratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBachilleratoActionPerformed
        if (CheckBachillerato.isSelected() == true) {
            System.out.println("Nivel Escolar Bachillerato");
        }
    }//GEN-LAST:event_CheckBachilleratoActionPerformed

    private void CheckLicenciaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckLicenciaturaActionPerformed
        if (CheckLicenciatura.isSelected() == true) {
            System.out.println("Nivel Escolar Licenciatura");
        }
    }//GEN-LAST:event_CheckLicenciaturaActionPerformed

    private void CheckPosgradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckPosgradoActionPerformed
        if (CheckPosgrado.isSelected() == true) {
            System.out.println("NIvel Escolar Posgrado");
        }
    }//GEN-LAST:event_CheckPosgradoActionPerformed

    private void EstadoCivilBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoCivilBoxActionPerformed
        String EstadoCivil = (String) EstadoCivilBox.getSelectedItem();
        System.out.println(EstadoCivil);
    }//GEN-LAST:event_EstadoCivilBoxActionPerformed

    private void jCheckBoxBecadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBecadoActionPerformed
         if (jCheckBoxBecado.isSelected()) {
            cuota  = 0.0;
        } else {
            cuota = 100.0;
        }
        System.out.println("La cuota de Becado es: " + cuota);
    }//GEN-LAST:event_jCheckBoxBecadoActionPerformed

    private void jCheckBoxHomologadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxHomologadoActionPerformed
        if (jCheckBoxHomologado.isSelected()) {
            cuota  = 80.0;
        } else {
            cuota = 100.0;
        }
        System.out.println("La cuota de Homologado es: " + cuota);
    }//GEN-LAST:event_jCheckBoxHomologadoActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VisualControles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualControles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualControles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualControles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualControles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CheckBachillerato;
    private javax.swing.JRadioButton CheckLicenciatura;
    private javax.swing.JRadioButton CheckPosgrado;
    private javax.swing.JComboBox EstadoCivilBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBoxBecado;
    private javax.swing.JCheckBox jCheckBoxHomologado;
    // End of variables declaration//GEN-END:variables
}
