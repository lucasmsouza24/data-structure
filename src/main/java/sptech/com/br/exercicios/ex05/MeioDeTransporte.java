package sptech.com.br.exercicios.ex05;

public abstract class MeioDeTransporte {
    
    // attributes
    private String modelo;
    private int qtdRodas;
    private double velocidade;
    private double ipva;

    // constructor
    public MeioDeTransporte(String modelo, int qtdRodas, double velocidade, double ipva) {
        this.modelo = modelo;
        this.qtdRodas = qtdRodas;
        this.velocidade = velocidade;
        this.ipva = ipva;
    }

    // methods
    public abstract void acelerar();

    

    @Override
    public String toString() {
        return String.format("\nMeioDeTransporte \nipva: R$ %.2f\nmodelo: %s\nqtdRodas: %d\nvelocidade: %.2f km/h", 
        ipva,
        modelo,
        qtdRodas,
        velocidade
        );
    }

    // getters and setters
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getQtdRodas() {
        return qtdRodas;
    }
    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }
    public double getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    public double getIpva() {
        return ipva;
    }
    public void setIpva(double ipva) {
        this.ipva = ipva;
    }
}
