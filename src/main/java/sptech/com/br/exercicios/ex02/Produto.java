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
        StringBuilder sb = new StringBuilder(Produto.class.getSimpleName());

        sb.append("\n\tcodigo: " + codigo);
        sb.append("\n\tnome: " + nome);
        sb.append("\n\tprecoCusto: " + precoCusto);
        sb.append("\n\tvalor venda: " + getValorVenda());

        return String.valueOf(sb);
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
