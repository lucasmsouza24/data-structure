package sptech.com.br.exercicios.ex09StackQueue;

public class Operacao {
    
    // attributes
    private ContaBancaria objtConta;
    private String tipoOperacao;
    private Double valor;

    // constructor
    public Operacao(ContaBancaria objtConta, String tipoOperacao, Double valor) {
        this.objtConta = objtConta;
        this.tipoOperacao = tipoOperacao;
        this.valor = valor;
    }

    // methods
    @Override
    public String toString() {
        return "Operacao [objtConta=" + objtConta + ", tipoOperacao=" + tipoOperacao + ", valor=" + valor + "]";
    }

    // getters and setters
    public ContaBancaria getObjtConta() {
        return objtConta;
    }
    public void setObjtConta(ContaBancaria objtConta) {
        this.objtConta = objtConta;
    }
    public String getTipoOperacao() {
        return tipoOperacao;
    }
    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    

}
