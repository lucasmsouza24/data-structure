package sptech.com.br.exercicios.ex03;

public abstract class Funcionario {
    
    // attributes
    private String nome;
    private Integer horasTrabalhadas;
    private Double valorHora;

    // constructor
    public Funcionario(String nome, Integer horasTrabalhadas, Double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Funcionario");

        sb.append(String.format("\n\tnome: %s", this.nome));
        sb.append(String.format("\n\thoras trabalhadas: %d", this.horasTrabalhadas));
        sb.append(String.format("\n\tvalor hora: R$ %.2f", this.valorHora));

        return String.valueOf(sb);
    }

    // getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public Double getValorHora() {
        return valorHora;
    }
    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
}
