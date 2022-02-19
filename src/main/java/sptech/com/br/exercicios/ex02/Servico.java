package sptech.com.br.exercicios.ex02;

public class Servico implements Vendavel {
    
    // attributes
    private String descricao; 
    private Integer codigo;
    private Integer qtdHoras;
    private Integer valorHoras;

    // constructor
    public Servico(Integer codigo, String descricao, Integer qtdHoras, Integer valorHoras) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.qtdHoras = qtdHoras;
        this.valorHoras = valorHoras;
    }

    // methods
    @Override
    public Double getValorVenda() {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(Servico.class.getSimpleName());

        sb.append("\n\tdescricao: " + descricao);
        sb.append("\n\tcodigo: " + codigo);
        sb.append("\n\tqtd horas: " + qtdHoras);
        sb.append("\n\tvalor horas: " + valorHoras);
        sb.append("\n\tvalor venda: " + this.getValorVenda());
        
        return String.valueOf(sb);
    }

    // getters and setters
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Integer getCodigo() {
        return codigo;
    }
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public Integer getQtdHoras() {
        return qtdHoras;
    }
    public void setQtdHoras(Integer qtdHoras) {
        this.qtdHoras = qtdHoras;
    }
    public Integer getValorHoras() {
        return valorHoras;
    }
    public void setValorHoras(Integer valorHoras) {
        this.valorHoras = valorHoras;
    }
}
