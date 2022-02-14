package sptech.com.br.exercicios.ex01;

public class App {
    public static void main(String[] args) {

        // creating Aluno objects
        AlunoFundamental a1 = new AlunoFundamental(11, "Lucas", 6d, 7d, 7d, 4d);
        AlunoGraduacao a2 = new AlunoGraduacao(22, "Rodrigo", 4d, 4d);
        AlunoPos a3 = new AlunoPos(33, "Enzo", 6d, 7d, 8d);

        // creating Escola object
        Escola e = new Escola("SPTECH");

        // adding elements
        e.adicionaAluno(a1);
        e.adicionaAluno(a2);
        e.adicionaAluno(a3);

        // displaying all elements
        e.exibeTodos();

        // displaying just AlunosGraduacao elements
        e.exibeAlunosGraduacao();

        // displaying approved elements
        e.exibeAprovados();

        // searching element by ra
        e.buscaAluno(23);
    }
}