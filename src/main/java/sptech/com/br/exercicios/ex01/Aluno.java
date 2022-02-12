package sptech.com.br.exercicios.ex01;

public abstract class Aluno {
    // Attributes
    private Integer ra;
    private String nome;

    // Constructor
    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    // methods
    public abstract Double calculaMedia();

    // Getters and setters
    public Integer getRa() {
        return ra;
    }
    public void setRa(Integer ra) {
        this.ra = ra;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        String txt = "Aluno [ra=%s, nome=%s, nota=%s]";
        return String.format(txt, ra, nome, calculaMedia());
    }
    
}
