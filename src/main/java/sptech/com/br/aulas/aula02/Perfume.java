package sptech.com.br.aulas.aula02;

public class Perfume extends Produto{

    // attributes
    private String fragancia;

    // constructor
    public Perfume(Integer codigo, String descricao, Double preco, String fragancia) {
        super(codigo, descricao, preco);
        this.fragancia = fragancia;
    }

    // methods
    public Double getValorTributo() {
        return null;
    }

    // getters and setters
    public String getFragancia() {
        return fragancia;
    }
    public void setFragancia(String fragancia) {
        this.fragancia = fragancia;
    }
    
}
