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

        // creating and adding book to bag
        return new Livro(cod, title, price, author, isbn);
    }

    public static DVD createDVD() {
        return null;
    }

    public static Servico createServico() {
        return null;
    }
}
