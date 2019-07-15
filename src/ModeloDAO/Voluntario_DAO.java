package ModeloDAO;

import ModeloBeans.Voluntario;
import ModeloConnection.Banco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Voluntario_DAO {
   Banco bd = new Banco();
   Voluntario volunt = new Voluntario();
   
    public void inserir(Voluntario volunt){
        bd.conecta();
        try {
            PreparedStatement pst = bd.conection.prepareStatement("insert into voluntario(cpf_voluntario,nome,endereco,telefone,sexo,nome_usuario,senha,adm) values(?,?,?,?,?,?,?,?);");
            pst.setLong(1,volunt.getCpf());
            pst.setString(2, volunt.getNome());
            pst.setString(3, volunt.getEndereco());
            pst.setString(4, volunt.getTelefone());
            pst.setString(5, String.valueOf(volunt.getSexo()));
            pst.setString(6, volunt.getNome_usuario());
            pst.setString(7, volunt.getSenha());
            pst.setBoolean(8, volunt.isAdministrador());

            
            pst.execute();
            JOptionPane.showMessageDialog(null,"Dados Inseridos com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Deu ruim");
            Logger.getLogger(Pessoa_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        bd.desconecta();
    }
    
    
    public void deletar(long cpf){
        bd.conecta();
        try {
            PreparedStatement pst = bd.conection.prepareStatement("SET FOREIGN_KEY_CHECKS=0;");
            pst.execute();
            pst = bd.conection.prepareStatement("delete from voluntario where cpf_voluntario=?");
            pst.setLong(1, cpf);
            pst.execute();
            //System.out.println(livro.getAutor());
            JOptionPane.showMessageDialog(null,"Excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi possivel excluir");
            Logger.getLogger(Pessoa_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        bd.desconecta();
    }
    
    public Voluntario buscaVoluntario(Voluntario mod){
        bd.conecta();
        bd.executaSQL("select * from voluntario where nome like '%"+mod.getPesquisa()+"%';");
        
        try {
            bd.rst.first();
            mod.setCpf(bd.rst.getLong("cpf_voluntario"));
            mod.setAdministrador(bd.rst.getBoolean("adm"));
            mod.setEndereco(bd.rst.getString("endereco"));
            mod.setNome(bd.rst.getString("nome"));
            mod.setTelefone(bd.rst.getString("telefone"));
            mod.setNome_usuario(bd.rst.getString("nome_usuario"));
            mod.setSenha(bd.rst.getString("senha"));
            mod.setSexo(bd.rst.getString("sexo").charAt(0));
        } catch (SQLException ex) {
            Logger.getLogger(Exemplar_DAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Deu ruim");
        }
        
        
        
        bd.desconecta();
        return mod;
    }
    
    public void editar(Voluntario mod){
         bd.conecta();
        try {
            PreparedStatement pst = bd.conection.prepareStatement("SET FOREIGN_KEY_CHECKS=0;");
            pst.execute();
            pst = bd.conection.prepareStatement("update voluntario SET nome=?, endereco=?, telefone=?, sexo=? where cpf_voluntario = '"+mod.getCpf()+"';");
            pst.setString(1,mod.getNome());
            pst.setString(2, mod.getEndereco());
            pst.setString(3, mod.getTelefone());
            pst.setString(4, Character.toString(mod.getSexo()));
            pst.execute();
            //System.out.println(livro.getAutor());
            JOptionPane.showMessageDialog(null,"Editados com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi possivel editar");
            Logger.getLogger(Pessoa_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}