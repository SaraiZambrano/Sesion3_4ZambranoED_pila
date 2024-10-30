
package sesion3_6Zambrano_cola1;

import javax.swing.JOptionPane;


public class TesOperacionesColas extends javax.swing.JFrame {

    OperacionesColas cola = new OperacionesColas(10);
    
    public TesOperacionesColas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnElemantosAgregarEDCola = new javax.swing.JButton();
        btnImprimirEDCola = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setText("Operaciones ED colas Zambrano");

        btnElemantosAgregarEDCola.setText("Añadir elementos en ED Cola");
        btnElemantosAgregarEDCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElemantosAgregarEDColaActionPerformed(evt);
            }
        });

        btnImprimirEDCola.setText("Imprimir elementos en ED Cola");
        btnImprimirEDCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirEDColaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnElemantosAgregarEDCola, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnImprimirEDCola)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTitulo)
                            .addGap(12, 12, 12))))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblTitulo)
                .addGap(36, 36, 36)
                .addComponent(btnElemantosAgregarEDCola)
                .addGap(26, 26, 26)
                .addComponent(btnImprimirEDCola)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirEDColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirEDColaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirEDColaActionPerformed

    private void btnElemantosAgregarEDColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElemantosAgregarEDColaActionPerformed
        for (int i = 0; i < 10; i++) {
            try {
               cola.insertar(i);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error al insertar los datos\n"+ e);
            }
            
        }
    }//GEN-LAST:event_btnElemantosAgregarEDColaActionPerformed

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
            java.util.logging.Logger.getLogger(TesOperacionesColas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TesOperacionesColas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TesOperacionesColas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TesOperacionesColas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TesOperacionesColas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElemantosAgregarEDCola;
    private javax.swing.JButton btnImprimirEDCola;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
