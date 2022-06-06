package sptech.com.br.exercicios.ex09StackQueue;

public class Operacao {
    
    // attributes
    private ContaBancaria objConta;
    private String tipoOperacao;
    private Double valor;

    // constructor
    public Operacao(ContaBancaria objConta, String tipoOperacao, Double valor) {
        this.objConta = objConta;
        this.tipoOperacao = tipoOperacao;
        this.valor = valor;
    }

    // methods
    @Override
    public String toString() {
        return "Operacao [objConta=" + objConta + ", tipoOperacao=" + tipoOperacao + ", valor=" + valor + "]";
    }

    // getters and setters
    public ContaBancaria getObjConta() {
        return objConta;
    }
    public void setObjConta(ContaBancaria objConta) {
        this.objConta = objConta;
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
