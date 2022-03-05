package sptech.com.br.exercicios.ex05;

public class Carro extends MeioDeTransporte {

    // attributes
    private boolean airbag;

    // constructor
    public Carro(String modelo, double ipva) {
        super(modelo, 4, 0, ipva);
        this.airbag = false;
    }

    // methods
    public void acelerar() {
        this.setVelocidade(this.getVelocidade() + 10);
    }

    public void ativarAirbag() {
        if (this.getVelocidade() > 40) {
            System.out.println("Ativando airbag do carro!");
            this.airbag = true;
        }
        System.out.println("Velocidade insuficiente para ativar o airbag");
    }

    @Override
    public String toString() {
        String superReplaced = super.toString().replace("MeioDeTransporte", "Carro") + "\nairbag: %b";
        return String.format(superReplaced, this.airbag);
    }

}
