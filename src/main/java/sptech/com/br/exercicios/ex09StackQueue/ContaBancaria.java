package sptech.com.br.exercicios.ex09StackQueue;

public class ContaBancaria {

    // attributes
    private Integer numero;
    private Double saldo;

    // constructor
    public ContaBancaria(Integer numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    // methods
    
    public Boolean debitar(Double valor) {
        if (saldo < valor) {
            saldo -= valor;
            System.out.println(String.format("Novo saldo: R$ $.2f", saldo));
            return true;
        }

        System.out.println("Saldo insuficiente");
        return false;
    }

    public void depositar(Double valor) {

    }

    @Override
    public String toString() {
        return "ContaBancaria [numero=" + numero + ", saldo=" + saldo + "]";
    }

    // getters and setters
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
}
