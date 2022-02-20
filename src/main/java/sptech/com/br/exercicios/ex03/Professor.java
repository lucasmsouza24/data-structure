package sptech.com.br.exercicios.ex03;

public class Professor extends Funcionario implements IBonus{

    // constructor
    public Professor(String nome, Integer horasTrabalhadas, Double valorHora) {
        super(nome, horasTrabalhadas, valorHora);
    }
    
    // methods
    @Override
    public Double getValorBonus() {
        return this.getValorHora() * this.getHorasTrabalhadas() * 4.5 * 0.15;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append(String.format("\n\tvalor bonus: R$ %.2f", this.getValorBonus()));

        return String.valueOf(sb).replace("Funcionario", "Professor");
    }
}
