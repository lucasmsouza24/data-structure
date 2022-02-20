package sptech.com.br.exercicios.ex03;

public class App {
    
    public static void main(String[] args) {
        ControleBonus cb = new ControleBonus();
        Professor p1 = new Professor("nome 1", 40, 41d);
        Coordenador c1 = new Coordenador("nome 2", 38, 42d);

        cb.addBonificado(p1);
        cb.addBonificado(c1);

        cb.displayBonificados();
    }
}
