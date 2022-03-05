package sptech.com.br.exercicios.ex05;

public class Moto extends MeioDeTransporte implements Empinavel{

    public Moto(String modelo, double ipva) {
        super(modelo, 2, 0, ipva);
    }

    // methods
    @Override
    public void acelerar() {
        this.setVelocidade(this.getVelocidade() + 20);
    }

    @Override
    public void empinar() {
        System.out.println("Empinando moto!!!!!!");   
    }

    @Override
    public String toString() {
        return super.toString().replace("MeioDeTransporte", "Moto");
    }
}
