package sptech.com.br.exercicios.ex07q2;

public class Aluno {
    
    // attributes
    private int ra;
    private String nome;
    private double nota;

    // constructor
    public Aluno(int ra, String nome, double nota) {
        this.ra = ra;
        this.nome = nome;
        this.nota = nota;
    }

    // methods
    @Override
    public String toString() {
        return String.format("%010d %-30s %05.2f", this.ra, this.nome, this.nota);
    }

    // getters and setters
    public int getRa() {
        return ra;
    }
    public void setRa(int ra) {
        this.ra = ra;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
}
