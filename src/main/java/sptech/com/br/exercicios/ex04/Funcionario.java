package sptech.com.br.exercicios.ex04;

public abstract class Funcionario {
    
    // attributes
    private String nome;

    // constructor
    public Funcionario(String nome) {
        this.nome = nome;
    }

    // methods
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Funcionario");

        sb.append(String.format("\n\tnome: %s", this.nome));

        return String.valueOf(sb);
    }

    // getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
