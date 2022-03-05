package sptech.com.br.exercicios.test;

import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static void main(String[] args) {

        Colab c = new Colab("email@emlail", "sena", "cargo foda");
        Usuario u = new Usuario("email2@email", "senha2");

        List<Autenticavel> l1 = new ArrayList<Autenticavel>();
        l1.add(c);
        l1.add(u);

        for (Autenticavel a : l1) {  
            if (a instanceof Colab) {
                Colab c1 = (Colab) a;
                System.out.println(c1.getCargo());
            }
        }

    }
}
