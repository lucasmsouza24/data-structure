package sptech.com.br.exercicios.ex04;

public abstract class Educador extends Funcionario {
    
    // attributes
    private Integer aulasSemana;
    private Double valorHoraAula;

    // constructor
    public Educador(String nome, Integer aulasSemana, Double valorHoraAula) {
        super(nome);
        this.aulasSemana = aulasSemana;
        this.valorHoraAula = valorHoraAula;
    }

    // methods
    public abstract Double getValorBonus();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append(String.format("\n\taulas por semana: %d", this.getAulasSemana()));
        sb.append(String.format("\n\tvalor hora aula: R$ %.2f", this.getValorHoraAula()));

        return String.valueOf(sb).replace("Funcionario", "Educador");
    }

    // getters and setters
    public Integer getAulasSemana() {
        return aulasSemana;
    }
    public void setAulasSemana(Integer aulasSemana) {
        this.aulasSemana = aulasSemana;
    }
    public Double getValorHoraAula() {
        return valorHoraAula;
    }
    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }
}
