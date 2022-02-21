package sptech.com.br.exercicios.ex04;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    
    // attribute
    List<Educador> educadores;
    
    // constructor
    public ControleBonus() {
        this.educadores = new ArrayList<Educador>();
    }

    // methods
    public void addBenificiado(Educador e) {
        this.educadores.add(e);
    }

    public void displayAll() {
        for (Educador e : this.educadores) {
            System.out.println(e.toString());
        }

        System.out.println(String.format("\nTotal: R$ %.2f", this.totalBonus()));
    }

    public Double totalBonus() {
        Double total = 0d;

        for (Educador e : this.educadores) {
            total += e.getValorBonus();
        }

        return total;
    }

}