
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gabrielle.ddutra
 */
public class Cadastrar extends javax.swing.JFrame {

    /**
     * Creates new form Cadastrar
     */
    public Cadastrar() {
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

        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();

        setTitle("Cadastro de funcionário");
        getContentPane().setLayout(null);

        jLabel4.setText("Email:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 40, 110, 50);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(120, 50, 250, 30);

        jLabel5.setText("Senha:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 80, 110, 50);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(120, 90, 250, 30);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(170, 140, 150, 40);

        setSize(new java.awt.Dimension(572, 239));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String u, s;
        u = txtEmail.getText();
        s = txtSenha.getText();
        try {
            new appData().cadastrarUsuario(u, s);
            //avisar o user se os dados foram salvos
            JOptionPane.showMessageDialog(null,"Usuário cadastrado com sucesso");
            //limpar os campos
            txtEmail.setText("");
            txtSenha.setText("");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao tentar localizar o Driver JDBC");
        } catch (SQLException ex) {
            if(ex.getMessage().contains("Duplicate entry")){
                JOptionPane.showMessageDialog(null,"Usuário ja cadastrado.");
            } else {
            JOptionPane.showMessageDialog(null,"Erro na conexão com o Banco de dados:" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}