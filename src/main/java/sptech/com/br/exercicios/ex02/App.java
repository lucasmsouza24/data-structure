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

        // input prepear
        Scanner sc = new Scanner(System.in);
        String answer;

        do {
            menu.showItems();
            answer = sc.nextLine();

            switch (answer) {
                case "1":
                    Livro livro = VendavelCreator.createLivro();
                    bag.adicionarVenda(livro);
                    break;
                case "2":
                    System.out.println("DVD");
                    break;
                case "3":
                    System.out.println("Servico");
                    break;
                case "4":
                    System.out.println("Exibindo itens do carrinho");
                    break;
                case "5":
                    System.out.println("Exibindo total de venda");
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
        bag.exibeItensCarrinho();
    }

    public static String title(String text) {
        return String.format("%s\n %s \n%s", "=".repeat(40), text, "=".repeat(40));
    }
}
