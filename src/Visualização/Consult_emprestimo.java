
package Visualização;

import ModeloBeans.Emprestimo;
import ModeloBeans.Exemplar;
import ModeloBeans.ModeloTabela;
import ModeloConnection.Banco;
import ModeloDAO.EmprestimoDAO;
import ModeloDAO.Exemplar_DAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consult_emprestimo extends javax.swing.JFrame {

    /**
     * Creates new form Cad_livro
     */
    
    Exemplar livro = new Exemplar();
    Exemplar_DAO livroDAO = new Exemplar_DAO();
    Emprestimo emp = new Emprestimo();
    EmprestimoDAO empDAO = new EmprestimoDAO();
    Banco bd = new Banco();
    
    public Consult_emprestimo() {
        initComponents();
        preencherTabela("select codigo, e.titulo, v.nome_usuario, p.nome, emp.data_emprestimo, emp.data_devolucao from exemplar as e join pessoa as p join voluntario as v  join emprestimo as emp where e.isbn=emp.livro and p.cpf=emp.locatario and v.cpf_voluntario=emp.voluntario_resp;");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1Pesquisar = new javax.swing.JButton();
        jTextFieldCPF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jFormattedTextField2Dev = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField1Emp = new javax.swing.JFormattedTextField();
        jTextFieldISBN1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1Devolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabelaEmprestimos = new javax.swing.JTable();
        jLabel1Fundo2Cad_livro = new javax.swing.JLabel();
        jLabel1FundoCadLivr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1Pesquisar.setText("Pesquisar");
        jButton1Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1PesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Pesquisar);
        jButton1Pesquisar.setBounds(230, 30, 110, 30);

        jTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPFActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCPF);
        jTextFieldCPF.setBounds(30, 240, 170, 30);

        jLabel4.setText("Data Devolucao");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(230, 140, 90, 20);

        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPesquisa);
        jTextFieldPesquisa.setBounds(30, 30, 190, 29);
        getContentPane().add(jFormattedTextField2Dev);
        jFormattedTextField2Dev.setBounds(230, 170, 150, 30);

        jLabel6.setText("CPF");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 210, 90, 20);

        jLabel7.setText("Data emp");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 280, 90, 20);
        getContentPane().add(jFormattedTextField1Emp);
        jFormattedTextField1Emp.setBounds(30, 310, 150, 30);

        jTextFieldISBN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldISBN1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldISBN1);
        jTextFieldISBN1.setBounds(30, 170, 170, 30);

        jLabel5.setText("ISBN");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 140, 90, 20);

        jButton1Devolver.setText("Devolver");
        jButton1Devolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1DevolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Devolver);
        jButton1Devolver.setBounds(290, 350, 120, 30);

        jTableTabelaEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableTabelaEmprestimos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(430, 20, 600, 380);

        jLabel1Fundo2Cad_livro.setBackground(new java.awt.Color(192, 200, 222));
        jLabel1Fundo2Cad_livro.setOpaque(true);
        getContentPane().add(jLabel1Fundo2Cad_livro);
        jLabel1Fundo2Cad_livro.setBounds(20, 20, 400, 370);

        jLabel1FundoCadLivr.setBackground(new java.awt.Color(89, 125, 192));
        jLabel1FundoCadLivr.setOpaque(true);
        getContentPane().add(jLabel1FundoCadLivr);
        jLabel1FundoCadLivr.setBounds(-90, -10, 1130, 450);

        setSize(new java.awt.Dimension(1053, 444));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jButton1PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1PesquisarActionPerformed
        try{
            emp.setPesquisa(Integer.parseInt(jTextFieldPesquisa.getText()));
            empDAO.BuscaEmprestimo(emp);
            jTextFieldISBN1.setText(String.valueOf(emp.getLivro()));
            jTextFieldCPF.setText(String.valueOf(emp.getLocatario()));
            jFormattedTextField1Emp.setText(emp.getTimestampEmp());
            jFormattedTextField2Dev.setText(emp.getTimestamDev());

            if(jFormattedTextField2Dev.getText()==""){
                jButton1Devolver.setEnabled(false);
            }else{
                jButton1Devolver.setEnabled(true);
            }

        }catch(NumberFormatException e ){
            JOptionPane.showMessageDialog(null, "Digite um codigo valido");
        }
        
        
    }//GEN-LAST:event_jButton1PesquisarActionPerformed
    
    public void limpaCampos(){
        
        jTextFieldCPF.setText("");
        jTextFieldISBN1.setText("");
        jFormattedTextField1Emp.setText("");
        jFormattedTextField2Dev.setText("");
        
    }
    
    private void jButton1DevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1DevolverActionPerformed
        empDAO.Devolver();
        preencherTabela("select codigo, e.titulo, v.nome_usuario, p.nome, emp.data_emprestimo, emp.data_devolucao from exemplar as e join pessoa as p join voluntario as v  join emprestimo as emp where e.isbn=emp.livro and p.cpf=emp.locatario and v.cpf_voluntario=emp.voluntario_resp;");
        limpaCampos();
        
    }//GEN-LAST:event_jButton1DevolverActionPerformed

    private void jTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCPFActionPerformed

    private void jTextFieldISBN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldISBN1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldISBN1ActionPerformed
    
    public void preencherTabela(String Sql){
        ArrayList dados = new ArrayList();
        String [] colunas = new String []{"Codigo","Titulo","Nome_usuario","Locatario","Data Emprestimo","Data Devolucao"};
        
        bd.conecta();
        
        bd.executaSQL(Sql);
        
        try{
            bd.rst.first();
            do{
 
                dados.add(new Object[]{bd.rst.getInt("codigo"),bd.rst.getString("e.titulo"), bd.rst.getString("v.nome_usuario"), bd.rst.getString("p.nome"),bd.rst.getString("data_emprestimo"),bd.rst.getString("data_devolucao")});
                
            }while(bd.rst.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane,"Erro ao Preencher ArrayList"+ex);
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableTabelaEmprestimos.setModel(modelo);
        
        /*
        jTableTabelaLivros.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTableTabelaLivros.getColumnModel().getColumn(1).setPreferredWidth(25);
        jTableTabelaLivros.getColumnModel().getColumn(2).setPreferredWidth(25 );
        jTableTabelaLivros.getColumnModel().getColumn(3).setPreferredWidth(25);
        */
        
        bd.desconecta();
        
    }
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
            java.util.logging.Logger.getLogger(Consult_emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consult_emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consult_emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consult_emprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consult_emprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Devolver;
    private javax.swing.JButton jButton1Pesquisar;
    private javax.swing.JFormattedTextField jFormattedTextField1Emp;
    private javax.swing.JFormattedTextField jFormattedTextField2Dev;
    private javax.swing.JLabel jLabel1Fundo2Cad_livro;
    private javax.swing.JLabel jLabel1FundoCadLivr;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabelaEmprestimos;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldISBN1;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}
