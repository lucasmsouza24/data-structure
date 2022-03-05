package sptech.com.br.exercicios.ex05;

public class Bicicleta extends MeioDeTransporte implements Empinavel{

    // constructor
    public Bicicleta(String modelo) {
        super(modelo, 2, 0, 0);
    }

    // methods
    @Override
    public void acelerar() {
        System.out.println("Acelerando a bike!");
        this.setVelocidade(this.getVelocidade() + 5);
    }

    @Override
    public void empinar() {
        System.out.println("Empinandooo! Bololo!");
    }

    @Override
    public String toString() {
        return super.toString().replace("MeioDeTransporte", "Bicicleta");
    }
}
