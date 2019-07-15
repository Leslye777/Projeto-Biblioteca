
package ModeloDAO;

import ModeloBeans.Exemplar;
import ModeloConnection.Banco;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Exemplar_DAO {
    Banco bd = new Banco();
    Exemplar livro = new Exemplar();
    
    public void inserir(Exemplar livro){
        bd.conecta();
        try {
            PreparedStatement pst = bd.conection.prepareStatement("insert into exemplar(titulo,autor,editora,volume,edicao,data_entrada,quantidade,isbn) values(?,?,?,?,?,current_date(),?,?);");
            pst.setString(1,livro.getTitulo());
            pst.setString(2, livro.getAutor());
            pst.setString(3, livro.getEditora());
            pst.setInt(4, livro.getVolume());
            pst.setString(5, livro.getEdicao());
            pst.setInt(6, livro.getQuantiade());
            pst.setLong(7, livro.getISBN());
            System.out.println(livro.getTitulo());
            pst.execute();
            //System.out.println(livro.getAutor());JOptionPane.showMessageDialog(null,"Deu ruim");
            JOptionPane.showMessageDialog(null,"Dados Inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao inserir");
            Logger.getLogger(Pessoa_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        bd.desconecta();
    }
    public void deletar(long isbn){
        bd.conecta();
        try {
            PreparedStatement pst = bd.conection.prepareStatement("delete from exemplar where isbn=?");
            pst.setLong(1, isbn);
            pst.execute();
            //System.out.println(livro.getAutor());
            JOptionPane.showMessageDialog(null,"Deletado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar");
            Logger.getLogger(Pessoa_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        bd.desconecta();
    }
    
    public Exemplar buscaExemplar(Exemplar mod){
        bd.conecta();
        bd.executaSQL("select * from exemplar where titulo like '%"+mod.getPesquisa()+"%';");
        
        try {
            bd.rst.first();
            mod.setAutor(bd.rst.getString("autor"));
            mod.setISBN(bd.rst.getLong("isbn"));
            mod.setEdicao(bd.rst.getString("edicao"));
            mod.setEditora(bd.rst.getString("editora"));
            mod.setQuantiade(bd.rst.getInt("quantidade"));
            mod.setTitulo(bd.rst.getString("titulo"));
            mod.setVolume(bd.rst.getInt("volume"));
        } catch (SQLException ex) {
            Logger.getLogger(Exemplar_DAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Não encontrado");
        }
        
        
        
        bd.desconecta();
        return mod;
    }
    
    public void editar(Exemplar livro){
         bd.conecta();
        try {
            PreparedStatement pst = bd.conection.prepareStatement("update exemplar SET titulo=?, autor=?,editora=?,volume=?,edicao=?,quantidade=? where isbn = '"+livro.getISBN()+"';");
            pst.setString(1,livro.getTitulo());
            pst.setString(2, livro.getAutor());
            pst.setString(3, livro.getEditora());
            pst.setInt(4, livro.getVolume());
            pst.setString(5, livro.getEdicao());
            pst.setInt(6, livro.getQuantiade());
            System.out.println(livro.getTitulo());
            pst.execute();
            //System.out.println(livro.getAutor());
            JOptionPane.showMessageDialog(null,"Dados editados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao editar");
            Logger.getLogger(Pessoa_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
