package sptech.com.br.aulas.aula02;

import java.util.ArrayList;
import java.util.List;

public class Tributo {
    
    // attributes
    private List<Tributavel> tributos;

    // constructor
    public Tributo() {
        this.tributos = new ArrayList<Tributavel>();
    }

    // methods
    public void adicionaTributavel(Tributavel t) {
        tributos.add(t);
    }

    public Double calculaTotalTributo() {
        Double total = 0d; 

        for (Tributavel t : tributos) {
            total += t.getValorTributo();
        }

        return total;
    }

    public void exibirTodos() {
        for (Tributavel t : tributos) {
            System.out.println(t);
        }
    }
}