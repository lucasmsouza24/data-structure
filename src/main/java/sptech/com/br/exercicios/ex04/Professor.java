package sptech.com.br.exercicios.ex04;

public class Professor extends Educador {

    // constructor
    public Professor(String nome, Integer aulasSemana, Double valorHoraAula) {
        super(nome, aulasSemana, valorHoraAula);
    }

    // methods
    @Override
    public Double getValorBonus() {
        return this.getAulasSemana() * this.getValorHoraAula() * 4.5 * 0.15;
    }

    @Override
    public String toString() {
        return super.toString().replace("Educador", "Professor");
    }
}
