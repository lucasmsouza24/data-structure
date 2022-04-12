package sptech.com.br.aulas.aula07.csv;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;

public class App {
    public static void main(String[] args) {
        ListaObj<Cachorro> cachorros = new ListaObj<Cachorro>(7);

        Cachorro c1 = new Cachorro("nome1", "porte1", 1);
        Cachorro c2 = new Cachorro("nome2", "porte2", 2);
        Cachorro c3 = new Cachorro("nome3", "porte3", 3);
        Cachorro c4 = new Cachorro("nome4", "porte4", 4);
        Cachorro c5 = new Cachorro("nome5", "porte5", 5);

        cachorros.append(c1);
        cachorros.append(c2);
        cachorros.append(c3);
        cachorros.append(c4);
        cachorros.append(c5);

        gravaArquivoCsv(cachorros, "cachorros");
    }

    public static void gravaArquivoCsv(ListaObj<Cachorro> lista, String nomeArquivo) {
        FileWriter arq = null;
        Formatter saida = null;
        Boolean deuRuim = false;
        nomeArquivo += ".csv";

        try {
            arq = new FileWriter(nomeArquivo, true);
            saida = new Formatter(arq);
        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo");
            System.exit(1);
        }

        try {
            for (int i = 0; i< lista.length(); i++) {
                Cachorro dog = lista.getByIndex(i);
                saida.format("%d;%s;%s;%.2f\n", dog.getId(), dog.getNome(), dog.getPorte(), dog.getPeso());
            }
        } catch (FormatterClosedException e) {
            System.out.println("Erro ao gravar arquivo");
            deuRuim = true;
        } finally {
            saida.close();
        }
    }
}
 