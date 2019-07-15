
package ModeloBeans;

public class Voluntario{
    private String senha;
    private String nome_usuario;
    private boolean administrador;
    private String nome;
    private long cpf;
    private String endereco;
    private String telefone;
    private char sexo;
    private String pesquisa;

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    public long getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    /*
    public Voluntario(String senha, String nome_usuario, boolean administrador, String nome, long cpf, String endereco, long telefone, char sexo) {
        this.senha = senha;
        this.nome_usuario = nome_usuario;
        this.administrador = administrador;
    }
    */
    public String getSenha() {
        return senha;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
    
    
    
}
