/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gabrielle.ddutra
 */
public class Ingressos extends javax.swing.JFrame {

    /**
     * Creates new form Ingressos
     */
    public Ingressos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDiretor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTitulo1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtVagas = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Submissão de ingressos");
        getContentPane().setLayout(null);

        jLabel2.setText("Título do Filme:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 30, 100, 30);
        getContentPane().add(txtTitulo);
        txtTitulo.setBounds(150, 30, 270, 30);

        jLabel4.setText("Diretor:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 70, 110, 30);

        txtDiretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiretorActionPerformed(evt);
            }
        });
        getContentPane().add(txtDiretor);
        txtDiretor.setBounds(120, 70, 300, 30);

        jLabel6.setText("Título do Filme:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 30, 100, 30);
        getContentPane().add(txtTitulo1);
        txtTitulo1.setBounds(150, 30, 270, 30);

        jLabel3.setText("Data:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 110, 100, 30);

        jLabel5.setText("Hora:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 150, 110, 30);

        txtHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraActionPerformed(evt);
            }
        });
        getContentPane().add(txtHora);
        txtHora.setBounds(120, 150, 170, 30);
        getContentPane().add(txtData);
        txtData.setBounds(120, 110, 170, 30);

        jLabel7.setText("Local:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 190, 110, 30);

        txtLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalActionPerformed(evt);
            }
        });
        getContentPane().add(txtLocal);
        txtLocal.setBounds(120, 190, 300, 30);

        jLabel8.setText("Vagas disponiveis:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 230, 110, 30);

        txtVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVagasActionPerformed(evt);
            }
        });
        getContentPane().add(txtVagas);
        txtVagas.setBounds(170, 230, 250, 30);

        btnEnviar.setText("Enviar ");
        getContentPane().add(btnEnviar);
        btnEnviar.setBounds(210, 290, 110, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiretorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiretorActionPerformed

    private void txtHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraActionPerformed

    private void txtLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalActionPerformed

    private void txtVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVagasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVagasActionPerformed

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
            java.util.logging.Logger.getLogger(Ingressos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingressos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingressos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingressos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingressos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDiretor;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtTitulo1;
    private javax.swing.JTextField txtVagas;
    // End of variables declaration//GEN-END:variables
}
