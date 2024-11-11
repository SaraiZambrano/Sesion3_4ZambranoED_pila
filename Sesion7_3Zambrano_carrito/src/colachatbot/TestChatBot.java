
package colachatbot;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;


public class TestChatBot extends javax.swing.JFrame {
    Queue<String>preguntas=new LinkedList<>();
    ChatBot chatbot= new ChatBot(); //en minuscula los objetos
    
   
    public TestChatBot() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnChat = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnChat.setText("Interactuar con CHATBOT IA Zambrano");
        btnChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChatActionPerformed(evt);
            }
        });

        lblTitulo.setText("Ejemplo de ED COLA CHATBOT Zambrano");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo)
                    .addComponent(btnChat))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblTitulo)
                .addGap(43, 43, 43)
                .addComponent(btnChat)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChatActionPerformed
        //aqui
        JOptionPane.showInputDialog("¡Bienvenido al Chatbot! ZAMBRANO\n Puedes hacer preguntas.\n O Escribe 'salir' para terminar.\n");

        while (true) {//inicia while
         String pregunta = JOptionPane.showInputDialog("Tu Usuario: ");
           

            if (pregunta.equalsIgnoreCase("salir")) {
                JOptionPane.showMessageDialog(null,"¡Hasta luego fue un honor!");
                break;
            }

            // Agregar la pregunta a la cola
            preguntas.add(pregunta);

            // Procesar la pregunta más antigua en la cola
            if (!preguntas.isEmpty()) {
                String preguntaEnCola = preguntas.poll(); // Extrae y elimina la pregunta de la cola
                String respuesta = chatbot.generaRespuesta(preguntaEnCola);
                JOptionPane.showMessageDialog(null,"Chatbot IA maquina: " + respuesta);
            }
        }//Termona while
    }//GEN-LAST:event_btnChatActionPerformed

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
            java.util.logging.Logger.getLogger(TestChatBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestChatBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestChatBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestChatBot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestChatBot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChat;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
