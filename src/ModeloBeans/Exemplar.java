
package ModeloBeans;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;

public class Exemplar {
    private String titulo;
    private String autor;
    private String editora;
    private int volume;
    private String edicao;
    //SimpleDateFormat data_publicacao  = new SimpleDateFormat("yyyy-MM-dd");
    private long ISBN;
    private int quantiade;
    private String pesquisa;

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    

    /*
    public Exemplar(String titulo, String autor, String editora, int volume, String edicao, Date data_publicacao, long ISBN, int quantiade) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.volume = volume;
        this.edicao = edicao;
        this.data_publicacao = data_publicacao;
        this.ISBN = ISBN;
        this.quantiade = quantiade;
    }
    */

    
    public String getAutor() {
        return autor;
    }
    /*
    public SimpleDateFormat getData_publicacao() {
        return data_publicacao;
    }
    */
    
    public String getEdicao() {
        return edicao;
    }

    public String getEditora() {
        return editora;
    }

    public long getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getVolume() {
        return volume;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
/*
    public void setData_publicacao(SimpleDateFormat data_publicacao) {
        this.data_publicacao = data_publicacao;
    }
*/
    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getQuantiade() {
        return quantiade;
    }

    public void setQuantiade(int quantiade) {
        this.quantiade = quantiade;
    }
     
    
}