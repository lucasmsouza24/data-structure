package sptech.com.br.exercicios.ex04;

public class Coordenador extends Professor {
    
    // attributes
    private Integer horasCoordenacao;
    private Double valorHoraCoordenacao;

    // constructor
    public Coordenador(String nome, Integer aulasSemana, Double valorHoraAula, Integer horasCoordenacao,
            Double valorHoraCoordenacao) {
        super(nome, aulasSemana, valorHoraAula);
        this.horasCoordenacao = horasCoordenacao;
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }

    // methods
    @Override
    public Double getValorBonus() {
        return (this.getValorHoraAula() * this.getAulasSemana()) * 4.5 * 0.15 * this.getHorasCoordenacao() * this.getValorHoraCoordenacao() * 4.5 * 0.2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append(String.format("\n\thoras coord. p/ semana: %d", this.getHorasCoordenacao()));
        sb.append(String.format("\n\tvalor hrs: R$ %.2f", this.getValorHoraCoordenacao()));

        return String.valueOf(sb).replace("Professor", "Prof/Coord");
    }

    // getters and setters
    public Integer getHorasCoordenacao() {
        return horasCoordenacao;
    }
    public void setHorasCoordenacao(Integer horasCoordenacao) {
        this.horasCoordenacao = horasCoordenacao;
    }
    public Double getValorHoraCoordenacao() {
        return valorHoraCoordenacao;
    }
    public void setValorHoraCoordenacao(Double valorHoraCoordenacao) {
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }
    
}
