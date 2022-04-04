package sptech.com.br.aulas.aula05listaestatica;

public class App {
    
    public static void main(String[] args) {

        // ListaEstatica le = new ListaEstatica(6);
        ListaEstatica leo = new ListaEstaticaOrdenada(5);

        leo.append(20);
        leo.append(5);
        leo.append(10);
        leo.append(25);
        leo.append(2);

        leo.displayValues();

        // le.append(0);
        // le.append(1);
        // le.append(2);
        // le.append(3);

        // le.addOnStart(-1);

        // le.displayValues();
    }
}
