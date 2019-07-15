package ModeloDAO;

import ModeloBeans.Pessoa;
import ModeloConnection.Banco;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Pessoa_DAO {
    Banco bd = new Banco();
    Pessoa pessoal = new Pessoa();
    
    public void inserir(Pessoa pessoal){
        bd.conecta();
        try {
            PreparedStatement pst = bd.conection.prepareStatement("insert into pessoa(cpf,nome,endereco,telefone,sexo) values(?,?,?,?,?);");
            pst.setLong(1,pessoal.getCpf());
            pst.setString(2, pessoal.getNome());
            pst.setString(3, pessoal.getEndereco());
            pst.setString(4, pessoal.getTelefone());
            pst.setString(5, String.valueOf(pessoal.getSexo()));
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Inseridos com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir");
            Logger.getLogger(Pessoa_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        bd.desconecta();
    }
     public void deletar(long cpf){
        bd.conecta();
        try {
            PreparedStatement pst = bd.conection.prepareStatement("delete pessoa where isbn=?");
            pst.setLong(1, cpf);
            pst.execute();
            //System.out.println(livro.getAutor());
            JOptionPane.showMessageDialog(null,"Excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao excluir");
            Logger.getLogger(Pessoa_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        bd.desconecta();
    }
    
    public Pessoa BuscaPessoa(Pessoa mod){
        bd.conecta();
        bd.executaSQL("select * from pessoa where nome like '%"+mod.getPesquisa()+"%';");
        
        try {
            bd.rst.first();
            mod.setNome(bd.rst.getString("nome"));
            mod.setCpf(bd.rst.getLong("cpf"));
            mod.setEndereco(bd.rst.getString("endereco"));
            mod.setTelefone(bd.rst.getString("telefone"));
            mod.setSexo(bd.rst.getString("sexo").charAt(0));
        } catch (SQLException ex) {
            Logger.getLogger(Exemplar_DAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Não encontrado");
        }
        
        
        bd.desconecta();
        return mod;
    } 
    
    public void editarPessoa(Pessoa mod){
         bd.conecta();
        try {
            PreparedStatement pst = bd.conection.prepareStatement("update pessoa SET nome=?,endereco=?,telefone=?,sexo=? where cpf = '"+mod.getCpf()+"';");
            pst.setString(1,mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setString(3, mod.getTelefone());
            pst.setString(4, String.valueOf(mod.getSexo()));
            System.out.println(mod.getNome());
            pst.execute();
            //System.out.println(livro.getAutor());
            JOptionPane.showMessageDialog(null,"Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi possivel editar");
            Logger.getLogger(Pessoa_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    
}
