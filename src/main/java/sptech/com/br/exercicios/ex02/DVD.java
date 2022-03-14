package sptech.com.br.exercicios.ex02;

public class DVD extends Produto {
    
    // attributes
    private String gravadora;

    // constructor
    public DVD(Integer codigo, String nome, Double precoCusto, String gravadora) {
        super(codigo, nome, precoCusto);
        this.gravadora = gravadora;
    }

    public Double getValorVenda() {
        return getPrecoCusto() * 1.2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append("\n\tgravadora: " + gravadora);

        return String.valueOf(sb).replace("Produto", DVD.class.getSimpleName());
    }

    // getters and setters
    public String getGravadora() {
        return gravadora;
    }
    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    } 
}
