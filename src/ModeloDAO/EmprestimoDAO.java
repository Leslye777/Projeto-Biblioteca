
package ModeloDAO;


import ModeloBeans.Emprestimo;
import ModeloConnection.Banco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EmprestimoDAO {
    
    Banco bd = new Banco();
    
    public void inserir(Emprestimo emp){
        bd.conecta();
        try {
            PreparedStatement pst = bd.conection.prepareStatement("SET FOREIGN_KEY_CHECKS=0;"); 
            pst = bd.conection.prepareStatement("insert into emprestimo (livro,locatario,voluntario_resp,data_emprestimo,data_devolucao) values(?,?,?,current_time(),null);");
            pst.setLong(1,emp.getLivro());
            pst.setLong(2,emp.getLocatario());
            pst.setLong(3,emp.getVoluntario_resp());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Inseridos com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir");
            Logger.getLogger(Pessoa_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        bd.desconecta();
    }
    
    public void Devolver(){
         bd.conecta();
        try {
            
            PreparedStatement pst = bd.conection.prepareStatement("SET FOREIGN_KEY_CHECKS=0;");
            pst.execute();
            pst = bd.conection.prepareStatement("update emprestimo SET data_devolucao=current_timestamp();");            
            pst.execute();
            //System.out.println(livro.getAutor());
            JOptionPane.showMessageDialog(null,"Devolvido com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao devolver");
            Logger.getLogger(Pessoa_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        bd.desconecta();
    }
    
    public Emprestimo BuscaEmprestimo(Emprestimo emp){
        bd.conecta();
        bd.executaSQL("select * from emprestimo where codigo="+emp.getPesquisa()+";");
        
        try {
            bd.rst.first();
            emp.setCodigo((bd.rst.getInt("codigo")));
            emp.setLivro((bd.rst.getLong("livro")));
            emp.setLocatario((bd.rst.getLong("voluntario_resp")));
            emp.setTimestamDev((bd.rst.getString("data_devolucao")));
            emp.setTimestampEmp((bd.rst.getString("data_emprestimo")));
            
        }catch (SQLException ex) {
            Logger.getLogger(Exemplar_DAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Não Encontrado");
        }
        
        
        bd.desconecta();
        return emp;
    } 
     
    
}
