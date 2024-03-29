/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualização;

import ModeloBeans.Emprestimo;
import ModeloBeans.Exemplar;
import ModeloConnection.Banco;
import ModeloDAO.EmprestimoDAO;
import ModeloDAO.Exemplar_DAO;


public class cad_emprestimo extends javax.swing.JFrame {

    
    Exemplar livro = new Exemplar();
    Exemplar_DAO livroDAO = new Exemplar_DAO();
    Banco bd = new Banco();
    Emprestimo emp = new Emprestimo();
    EmprestimoDAO empDAO = new EmprestimoDAO();
    Long volun;
    
    
    public cad_emprestimo() {
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

        jLabel5 = new javax.swing.JLabel();
        jTextFieldCPF_Locatario = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jTextFieldTitulo1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1Fundo2Cad_livro = new javax.swing.JLabel();
        jLabel1FundoCadLivr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel5.setText("CPF Locatario");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 120, 90, 30);

        jTextFieldCPF_Locatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPF_LocatarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCPF_Locatario);
        jTextFieldCPF_Locatario.setBounds(160, 120, 150, 30);

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(300, 190, 120, 25);

        jTextFieldTitulo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTitulo1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTitulo1);
        jTextFieldTitulo1.setBounds(170, 40, 140, 30);

        jLabel3.setText("Livro");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 40, 100, 30);

        jLabel1Fundo2Cad_livro.setBackground(new java.awt.Color(192, 200, 222));
        jLabel1Fundo2Cad_livro.setOpaque(true);
        getContentPane().add(jLabel1Fundo2Cad_livro);
        jLabel1Fundo2Cad_livro.setBounds(20, 20, 430, 220);

        jLabel1FundoCadLivr.setBackground(new java.awt.Color(89, 125, 192));
        jLabel1FundoCadLivr.setOpaque(true);
        getContentPane().add(jLabel1FundoCadLivr);
        jLabel1FundoCadLivr.setBounds(-40, -23, 690, 400);

        setSize(new java.awt.Dimension(482, 303));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCPF_LocatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPF_LocatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCPF_LocatarioActionPerformed

    private void jTextFieldTitulo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTitulo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTitulo1ActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        livro.setPesquisa(jTextFieldTitulo1.getText());
        livro = livroDAO.buscaExemplar(livro);
        emp.setLivro(livro.getISBN());
        emp.setLocatario(Long.parseLong(jTextFieldCPF_Locatario.getText()));
        emp.setVoluntario_resp(volun);
        empDAO.inserir(emp);
        
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(cad_emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cad_emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cad_emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cad_emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cad_emprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JLabel jLabel1Fundo2Cad_livro;
    private javax.swing.JLabel jLabel1FundoCadLivr;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldCPF_Locatario;
    private javax.swing.JTextField jTextFieldTitulo1;
    // End of variables declaration//GEN-END:variables
}
