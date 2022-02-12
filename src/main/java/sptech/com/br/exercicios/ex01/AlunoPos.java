package sptech.com.br.exercicios.ex01;

public class AlunoPos extends Aluno {
    // attributes
    private Double nota1;
    private Double nota2;
    private Double notaMonografia;

    // constructor
    public AlunoPos(Integer ra, String nome, Double nota1, Double nota2, Double notaMonografia) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografia = notaMonografia;
    }

    // methods
    @Override
    public Double calculaMedia() {
        return (nota1 + nota2 + notaMonografia) / 3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" * nota 1: %.2f\n");
        sb.append(" * nota 2: %.2f\n");
        sb.append(" * nota monografia: %.2f\n");

        String str = String.valueOf(sb).replace("Aluno", "AlunoPos");
        return String.format(str, nota1, nota2, notaMonografia);
    }

    // getters and setters
    public Double getNota1() {
        return nota1;
    }
    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }
    public Double getNota2() {
        return nota2;
    }
    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }
    public Double getNotaMonografia() {
        return notaMonografia;
    }
    public void setNotaMonografia(Double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }
}
