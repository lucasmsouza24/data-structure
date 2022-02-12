package sptech.com.br.exercicios.ex01;

public class App {
    public static void main(String[] args) {
        AlunoFundamental a1 = new AlunoFundamental(1111111, "Lucas", 6d, 7d, 8d, 9d);
        AlunoGraduacao a2 = new AlunoGraduacao(2222222, "Rodrigo", 9d, 9d);

        System.out.println(a1);
        System.out.println(a2);
    }
}