package appjava;
// class User
public class User{
    // attributes
    private String nome;
    private String senha;
    private String telefone;
    private String email;
    private String endereco;
    
    // getters and setters methods
    public User(String n, String s, String t, String email, String end) {
        this.nome = n;
        this.senha = s;
        this.telefone = t;
        this.email = email;
        this.endereco = end;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getEmail(){
         return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}


