/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBeans;

import java.text.SimpleDateFormat;

public class Emprestimo {
    private int codigo;
    private Long livro;
    private Long locatario;
    private Long voluntario_resp; 
    private String timestampEmp;
    private String timestamDev;
    private int pesquisa;

    public int getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(int pesquisa) {
        this.pesquisa = pesquisa;
    }
    
    
    
    
    public int getCodigo() {
        return codigo;
    }

    public Long getLivro() {
        return livro;
    }

    public Long getLocatario() {
        return locatario;
    }

    public Long getVoluntario_resp() {
        return voluntario_resp;
    }

    public String getTimestamDev() {
        return timestamDev;
    }

    public String getTimestampEmp() {
        return timestampEmp;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setLivro(Long livro) {
        this.livro = livro;
    }

    public void setLocatario(Long locatario) {
        this.locatario = locatario;
    }

    public void setTimestamDev(String timestamDev) {
        this.timestamDev = timestamDev;
    }

    public void setTimestampEmp(String timestampEmp) {
        this.timestampEmp = timestampEmp;
    }

    public void setVoluntario_resp(Long voluntario_resp) {
        this.voluntario_resp = voluntario_resp;
    }
    
    
    
            
}
