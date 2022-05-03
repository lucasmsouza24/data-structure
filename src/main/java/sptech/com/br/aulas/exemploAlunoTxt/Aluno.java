package sptech.com.br.aulas.exemploAlunoTxt;

public class Aluno {

    // attributes
    private int ra;
    private String nome;
    private String curso;
    private String disciplina;
    private double media;
    private int qtdFaltas;
    
    // constructor
    public Aluno(int ra, String nome, String curso, String disciplina, double media, int qtdFaltas) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.disciplina = disciplina;
        this.media = media;
        this.qtdFaltas = qtdFaltas;
    }

    
    @Override
    public String toString() {
        return "Aluno [curso=" + curso + ", disciplina=" + disciplina + ", media=" + media + ", nome=" + nome
                + ", qtdFaltas=" + qtdFaltas + ", ra=" + ra + "]";
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getQtdFaltas() {
        return qtdFaltas;
    }

    public void setQtdFaltas(int qtdFaltas) {
        this.qtdFaltas = qtdFaltas;
    }    
}
