package sptech.com.br.exercicios.ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // creating menus
        List<String> m1 = new ArrayList<>(Arrays.asList("Adicionar livro", "Adicionar DVD", "Adicionar Servico", "Exibir itens do carrinho", "Exibir total de venda", "Fim"));
        Menu menu = new Menu(m1);

        // creating bag
        Carrinho bag = new Carrinho();

        // menu decision
        Scanner sc = new Scanner(System.in);
        String answer;

        do {
            menu.showItems();
            answer = sc.nextLine();

            switch (answer) {
                case "1":
                    // creating and adding book to bag
                    bag.adicionarVenda(VendavelCreator.createLivro());
                    System.out.println(title("Venda realizada"));
                    break;
                case "2":
                    // creating and adding DVD to bag
                    bag.adicionarVenda(VendavelCreator.createDVD());
                    System.out.println(title("Venda realizada"));
                    break;
                case "3":
                    // creating and adding service to bag
                    bag.adicionarVenda(VendavelCreator.createServico());
                    System.out.println(title("Venda realizada"));
                    break;
                case "4":
                    System.out.println(title("Exibindo itens do carrinho"));

                    System.out.println(String.format("\nQuantidade de itens: %d\n", bag.amountItens()));

                    bag.exibeItensCarrinho();
                    break;
                case "5":
                    System.out.println(title("Exibindo total de venda"));
                    String str = String.format("\nTotal venda: R$ %.2f", bag.calculaTotalVenda());
                    System.out.println(str);
                    break;
                case "6":
                    System.out.println(title("Saindo..."));
                    break;
                default:
                    System.out.println(title("Opção inválida, tente novamente!"));
                    break;
            }

        } while(!answer.equals("6"));

        sc.close();
    }

    public static String title(String text) {
        return String.format("\n%s\n %s \n%s", "=".repeat(35), text, "=".repeat(35));
    }
}
