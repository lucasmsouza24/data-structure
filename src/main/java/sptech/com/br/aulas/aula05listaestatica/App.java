package sptech.com.br.aulas.aula05listaestatica;

public class App {
    
    public static void main(String[] args) {

        // ListaEstatica le = new ListaEstatica(6);
        ListaEstatica leo = new ListaEstaticaOrdenada(4);

        leo.append(4);
        leo.append(2);
        leo.append(3);
        leo.append(1);

        leo.displayValues();

        // le.append(0);
        // le.append(1);
        // le.append(2);
        // le.append(3);

        // le.addOnStart(-1);

        // le.displayValues();
    }
}
