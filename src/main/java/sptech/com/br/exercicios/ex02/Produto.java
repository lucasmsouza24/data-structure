package sptech.com.br.exercicios.ex02;

public abstract class Produto implements Vendavel {
    // attributes
    private Integer codigo;
    private String nome;
    private Double precoCusto;

    // constructor
    public Produto(Integer codigo, String nome, Double precoCusto) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoCusto = precoCusto;
    }

    // methods
    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", nome=" + nome + ", precoCusto=" + precoCusto + "]";
    }

    // getters and setters
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPrecoCusto() {
        return precoCusto;
    }
    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }
}
