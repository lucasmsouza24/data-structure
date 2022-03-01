package sptech.com.br.exercicios.ex03;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    
    // attributes
    private List<IBonus> listaBonus;

    // constructor
    public ControleBonus() {
        listaBonus = new ArrayList<IBonus>();
    }

    // methods
    public void addBonificado(IBonus b) {
        this.listaBonus.add(b);
    }

    public void displayBonificados() {
        for (IBonus b : this.listaBonus) {
            System.out.println(b);
        }
    }
}
