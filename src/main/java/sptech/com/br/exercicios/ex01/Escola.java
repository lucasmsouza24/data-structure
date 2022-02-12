package sptech.com.br.exercicios.ex01;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    // attributes
    private String nome;
    private List<Aluno> alunos;

    // constructor
    public Escola(String nome) {
        this.nome = nome;
        alunos = new ArrayList<Aluno>();
    }

    // methods
    public void adicionaAluno(Aluno a) {
        alunos.add(a);
    }

    public void exibeTodos() {
        for (Aluno a : alunos) {
            System.out.println(a);
        }
    }

    public void exibeAlunosGraduacao() {
        for (Aluno a : alunos) {
            if (a instanceof AlunoGraduacao) {
                System.out.println(a);
            }
        }
    }

    public void exibeAprovados() {
        for (Aluno a : alunos) {
            if (a.calculaMedia() >= 6) {
                System.out.println(a);
            }
        }
    }

    public void buscaAluno(Integer ra) {
        Boolean exists = false; 

        // itering through Aluno list
        for (Aluno a : alunos) {
            if (a.getRa().equals(ra)) {
                exists = true;
                System.out.println(a);
                break;
            }
        }

        // student not found
        if (!exists) {
            System.out.println("=".repeat(40));
            System.out.println("Aluno não encontrado!");
            System.out.println("=".repeat(40));
        }
    }

    // getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
