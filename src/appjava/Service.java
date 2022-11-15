package appjava;
public class Service {
    User proprietario;
    private String nomeDoNegocio;
    private String categoria;
    private String descricao;
    private double valor;
    private double avaliacao;
    private boolean aberto; 
    private boolean entrega;
    private boolean paraViagem;

    public Service(User prop, String n, String categ, String desc, 
    double vlr, boolean ent, boolean pv){
        this.proprietario = prop;
        this.nomeDoNegocio = n;
        this.categoria = categ;
        this.descricao = desc;
        this.valor = vlr;
        this.entrega = ent;
        this.paraViagem = pv;
    }

    public String getNomeDoNegocio() {
        return nomeDoNegocio;
    }
    public void setNomeDoNegocio(String nomeDoNegocio) {
        this.nomeDoNegocio = nomeDoNegocio;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean isEntrega() {
        return entrega;
    }
    public void setEntrega(boolean entrega) {
        this.entrega = entrega;
    }

    public boolean isParaViagem() {
        return paraViagem;
    }
    public void setParaViagem(boolean paraViagem) {
        this.paraViagem = paraViagem;
    }
    
}
