package sptech.com.br.exercicios.ex02;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    
    // attributes
    private List<Vendavel> carrinho; 

    // constructor
    public Carrinho() {
        this.carrinho = new ArrayList<Vendavel>();
    }

    public void adicionarVenda(Vendavel v) {
        this.carrinho.add(v);
    }

    public Double calculaTotalVenda() {
        Double total = 0d; 

        for(Vendavel v : carrinho) {
            total += v.getValorVenda();
        }

        return total;
    }

    public void exibeItensCarrinho() {
        for (Vendavel v : carrinho) {
            System.out.println(v);
        }
    }
}
