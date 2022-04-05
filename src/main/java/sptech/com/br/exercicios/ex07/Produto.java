package sptech.com.br.exercicios.ex07;

public class Produto {
    // attributes
    private int codProduto;
    private String nome;
    private Double preco;
    private String avaliacao;
    private int quantidadeVendida;
    
    // constructor
    public Produto(int codProduto, String nome, Double preco, String avaliacao, int quantidadeVendida) {
        this.codProduto = codProduto;
        this.nome = nome;
        this.preco = preco;
        this.avaliacao = avaliacao;
        this.quantidadeVendida = quantidadeVendida;
    }

    // methods
    public void comprar(int quantidadeComprada) {
        this.quantidadeVendida += quantidadeComprada;
    }

    public double calcularFaturamento() {
        return this.preco * this.quantidadeVendida;
    }

    @Override
    public String toString() {
        return String.format("%06d %-14s %7.2f %7s %14d", codProduto, nome, preco, avaliacao, quantidadeVendida);
    }

    // getters and setters
    public int getCodProduto() {
        return codProduto;
    }
    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public String getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }
    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }
}
