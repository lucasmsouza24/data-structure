package sptech.com.br.exercicios.ex05;

public class App {
    
    public static void main(String[] args) {

        Carro c1 = new Carro("Ford", 2000d);
        Moto m1 = new Moto("Kawasaki", 1100d);
        Bicicleta b1 = new Bicicleta("Monark");

        ControlaMeioDeTransporte cmt = new ControlaMeioDeTransporte();

        cmt.addVeiculo(c1);
        cmt.addVeiculo(m1);
        cmt.addVeiculo(b1);

        
        // carro
        c1.ativarAirbag();
        m1.empinar();
        b1.empinar();
        
        
        // cmt.acelerarVeiculos();
        // cmt.exibirVeiculos();
    }
}
