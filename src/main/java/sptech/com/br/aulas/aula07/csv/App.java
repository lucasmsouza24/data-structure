package sptech.com.br.aulas.aula07.csv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ListaObj<Cachorro> cachorros = new ListaObj<Cachorro>(7);

        Cachorro c1 = new Cachorro(1, "nome1", "porte1", 12);
        Cachorro c2 = new Cachorro(2, "nome2", "porte2", 23);
        Cachorro c3 = new Cachorro(3, "nome3", "porte3", 31);
        Cachorro c4 = new Cachorro(4, "nome4", "porte4", 42);
        Cachorro c5 = new Cachorro(5, "nome5", "porte5", 53);

        cachorros.append(c1);
        cachorros.append(c2);
        cachorros.append(c3);
        cachorros.append(c4);
        cachorros.append(c5);

        // gravaArquivoCsv(cachorros, "cachorros");
        leArquivoCsv("cachorros");
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

    public static void leArquivoCsv(String nomeArq) {
        FileReader arq = null;
        Scanner entrada = null;
        boolean deuRuim = false;
        nomeArq += ".csv";

        // abrindo arquivo
        try{
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
            System.exit(1);
        }

        try {
            System.out.printf("%4s %-15s %-9s %5s\n", "ID", "NOME", "PORTE", "PESO");
            while(entrada.hasNext()) {
                int id = entrada.nextInt();
                String nome = entrada.next();
                String porte = entrada.next();
                Double peso = entrada.nextDouble();

                Cachorro c = new Cachorro(id, nome, porte, peso);
                System.out.println(c);
            }
        } catch (NoSuchElementException e) {
            System.out.println(e);
        } finally {
            entrada.close();
        }
    }
}
 