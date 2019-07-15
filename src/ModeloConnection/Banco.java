package ModeloConnection;

//import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Banco {
    // login do Banco
    private String login="root";
    // senha do Banco private
    private String senha="";
    // IP do servidor do Banco
    private String host="localhost";
    // Nome do Banco de dados
    private String dbname="CM_Community";
    // URL de conexão do Banco
    private String url= "jdbc:mysql://" + host + "/" + dbname;
    // Objeto do tipo Connection para estabeler a conexão
    public Connection conection;
    // Objeto Statement usado para enviar consultas para o Banco de dados
    public Statement stmt;
    // Objeto ResultSet utilizado nas consultas ao Banco de dados
    public ResultSet rst;
    // String utilizada para realizar as consultas ao Banco
    private String query;
    
    
    public void conecta(){
        try {
            conection=DriverManager.getConnection(url, login, senha);
        } catch (SQLException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao conectar-se ao banco de dados");
        }
    }
    
    
    public void desconecta(){
        
        try {
            conection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao desconectar");
        }
         
    }
    
    public void executaSQL(String sql){
        try {
            stmt = conection.createStatement(rst.TYPE_SCROLL_INSENSITIVE,rst.CONCUR_READ_ONLY);
            rst = stmt.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro SQL");
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}