package sptech.com.br.aulas.aula05listaestatica;

public class App {
    
    public static void main(String[] args) {

        ListaEstatica le = new ListaEstatica(6);

        le.append(0);
        le.append(1);
        le.append(1);
        le.append(2);
        le.append(3);
        le.append(5);

        System.out.println(le.getByValue(2));

        le.displayValues();

        le.removeByIndex(1);
        le.removeByValue(2);

        le.displayValues();
    }
}
