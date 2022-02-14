package sptech.com.br.aulas.aula01;

public class App {

    public static void main(String[] args) {

        // Só para relembrar que a classe abstrata não é instanciável
        // Não consigo fazer new da classe abstrata
        // A instrução abaixo dá erro
        // Funcionario f = new Funcionario("12345", "Fulano");

        Engenheiro e = new Engenheiro("12345", "Fulano",
                                       15000.0);
        Vendedor v = new Vendedor("67890", "Mickey",
                                  30000.0, 0.10);
        Horista h = new Horista("45678", "Pateta",
                                 40, 100.0);

        System.out.println(e);
        System.out.println(v);
        System.out.println(h);

        Empresa sptech = new Empresa();
        sptech.adicionaFunc(e);
        sptech.adicionaFunc(v);
        sptech.adicionaFunc(h);

        sptech.exibeTodos();
        sptech.exibeTotalSalario();
        sptech.exibeHoristas();



    }
}
