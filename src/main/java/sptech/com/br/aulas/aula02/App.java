package sptech.com.br.aulas.aula02;

public class App {
    public static void main(String[] args) {
        Tributo t = new Tributo(); 
        
        Alimento a1 = new Alimento(1, "alimento 1", 10d, 3);
        Perfume p1 = new Perfume(2, "perfume 1", 10d, "askdjoa"); 
        Servico s1 = new Servico("servicao 1", 10d);

        t.adicionaTributavel(a1);
        t.adicionaTributavel(p1);
        t.adicionaTributavel(s1);

        t.exibirTodos();

        System.out.println(t.calculaTotalTributo());
    }
}
