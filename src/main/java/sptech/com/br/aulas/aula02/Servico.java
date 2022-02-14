package sptech.com.br.aulas.aula02;

public class Servico implements Tributavel {

    // attributes
    private String descricao; 
    private Double preco;

    // constructor
    public Servico(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }
    
    // methods
    public Double getValorTributo() {
        return this.getPreco() * 0.12;
    }

    @Override
    public String toString() {
        return "Servico [descricao=" + descricao + ", preco=" + preco + ", tributo=" + this.getValorTributo() + "]";
    }

    // getters and setters
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
}
