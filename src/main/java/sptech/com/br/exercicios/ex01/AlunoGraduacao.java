package sptech.com.br.exercicios.ex01;

public class AlunoGraduacao extends Aluno {
    
    // Attributes
    private Double nota1;
    private Double nota2;

    // Constructor 
    public AlunoGraduacao(Integer ra, String nome, Double nota1, Double nota2) {
        super(ra, nome); 
        this.nota1 = nota1; 
        this.nota2 = nota2;
    }

    // methods
    @Override
    public Double calculaMedia() {
        return (nota1 * 0.4) + (nota2 * 0.6);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" * nota 1: %.2f\n");
        sb.append(" * nota 2: %.2f\n");

        String str = String.valueOf(sb).replace("Aluno", "AlunoGraduacao");
        return String.format(str, nota1, nota2);
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
    
}