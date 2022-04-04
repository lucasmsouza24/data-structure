package sptech.com.br.aulas.aula06listaobjgenerico;

public class Main {
    public static void main(String[] args) {
        ListaObj<String> nomes = new ListaObj<String>(5);
        
        nomes.append("lucas");
        nomes.append("mesquita");
        nomes.append("souza");
        nomes.append("cleude");
        nomes.append("maria");

        nomes.displayValues();
    }
}
