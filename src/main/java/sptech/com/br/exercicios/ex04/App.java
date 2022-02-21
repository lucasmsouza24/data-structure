package sptech.com.br.exercicios.ex04;

public class App {
    
    public static void main(String[] args) {
        Professor p1 = new Professor("Celia", 5, 50d);
        Coordenador c1 = new Coordenador("Marise", 3, 50d, 6, 50d);

        ControleBonus controller = new ControleBonus();

        controller.addBenificiado(p1);
        controller.addBenificiado(c1);

        controller.displayAll();
    }
}
