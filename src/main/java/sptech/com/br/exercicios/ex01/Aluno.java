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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("-".repeat(20) + "\n");
        sb.append("Aluno\n");
        sb.append("-".repeat(20) + "\n");
        sb.append("ra: %s\n");
        sb.append("nome: %s\n");
        sb.append("nota: %s\n");
        String str = String.valueOf(sb);
        return String.format(str, ra, nome, calculaMedia());
    }

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
    
}
