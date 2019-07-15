package cm_community;
import ModeloBeans.Exemplar;
import ModeloBeans.Pessoa;
import ModeloConnection.Banco;
import ModeloDAO.Exemplar_DAO;
import ModeloDAO.Pessoa_DAO;
import Visualização.TelaLogin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Cm_Community {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco bd = new Banco();
        Pessoa_DAO pesd = new Pessoa_DAO();
        Pessoa pes = new Pessoa();
        Scanner ler = new Scanner(System.in);
        Exemplar_DAO ex = new Exemplar_DAO();
        
        
        
        /*
        System.out.println("Digite o CPF");
        pes.setCpf(ler.nextLong());
        System.out.println("Digite o nome");
        pes.setNome(ler.nextLine());
        System.out.println("Digite o endereco");
        pes.setEndereco(ler.nextLine());
        System.out.println("digite o telefone");
        pes.setTelefone(ler.nextLine());
        pes.setSexo('m');
        
        
        pesd.inserir(pes);
        */
        
        //System.out.println("Teste da conexão:");
        //System.out.println(bd.setConecta());

        //System.out.println("Inserir:");
        //System.out.println(bd.insertExemplo());

        //System.out.println("Deletar:");
        //System.out.println(bd.deleteExemplo());

        //System.out.println("Atualizar:");
        //System.out.println(bd.updateExemplo());
        /*
        System.out.println("Consulta:");
        ResultSet result = volundao.selectExemplo();
        try {      
            while (result.next()) {
                long cpf = result.getLong("cpf");
                String nome = result.getString("nome"); 
                System.out.println(""+nome);
                System.out.println(""+cpf);
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
        */
        //System.out.println("Desconectar:");
        //System.out.println(bd.setDesconecta());  
        
        TelaLogin inicio = new TelaLogin();
        inicio.setVisible(true);
        
    }
    
}
