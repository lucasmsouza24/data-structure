package sptech.com.br.exercicios.ex02;

import java.util.Scanner;


// this class may be used to áccelerate some Vendavel child instances building 
public class VendavelCreator {

    // single Scanner instances
    public static final Scanner scStr = new Scanner(System.in);

    public static final Scanner scNum = new Scanner(System.in);

    // Livro building
    public static Livro createLivro() {

        System.out.println(App.title("Adicionando Livro"));

        // cod
        System.out.println("\nCódigo do produto: ");
        Integer cod = scNum.nextInt();

        // title
        System.out.println("\nTítulo: ");
        String title = scStr.nextLine();

        // price
        System.out.println("\nPreço: ");
        Double price = scNum.nextDouble();

        // author
        System.out.println("\nAutor: ");
        String author = scStr.nextLine();

        // isbn
        System.out.println("\nISBN: ");
        String isbn = scStr.nextLine();

        System.out.println("");

        return new Livro(cod, title, price, author, isbn);
    }

    // DVD Building
    public static DVD createDVD() {

        System.out.println(App.title("Adicionando DVD"));

        // cod
        System.out.println("\ncódigo: ");
        Integer cod = scNum.nextInt();

        // name
        System.out.println("\nnome: ");
        String name = scStr.nextLine();

        // price
        System.out.println("\npreço: ");
        Double price = scNum.nextDouble();

        // recorder
        System.out.println("\ngravadora: ");
        String recorder = scStr.nextLine();

        return new DVD(cod, name, price, recorder);
    }

    // Servico building
    public static Servico createServico() {

        System.out.println(App.title("Adicionando Serviço"));

        // cod
        System.out.println("\ncódigo: ");
        Integer cod = scNum.nextInt();

        // description
        System.out.println("\ndescrição: ");
        String desc = scStr.nextLine();

        // hours total
        System.out.println("\ntotal horas: ");
        Integer hoursTotal = scNum.nextInt();

        // hours price
        System.out.println("\nvalor/hora: ");
        Double hoursPrice = scNum.nextDouble();

        return new Servico(cod, desc, hoursTotal, hoursPrice);
    }
}
