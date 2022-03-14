package sptech.com.br.aulas.aula02;

public class Alimento extends Produto {

    // attributes
    private Integer qtdVitamina;

    // constructor
    public Alimento(Integer codigo, String descricao, Double preco, Integer qtdVitamina) {
        super(codigo, descricao, preco);
        this.qtdVitamina = qtdVitamina;
    }

    // methods
    public Double getValorTributo() {
        return this.getPreco() * 0.15;
    }

    // getters and setters
    public Integer getQtdVitamina() {
        return qtdVitamina;
    }
    public void setQtdVitamina(Integer qtdVitamina) {
        this.qtdVitamina = qtdVitamina;
    }
    
}
