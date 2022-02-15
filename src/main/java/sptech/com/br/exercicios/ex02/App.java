package sptech.com.br.exercicios.ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        List<String> m1 = new ArrayList<>(Arrays.asList("Adicionar livro", "Adicionar DVD", "Adicionar Servico", "Exibir itens do carrinho", "Exibir total de venda", "Fim"));
        Menu menu = new Menu(m1);

        Scanner sc = new Scanner(System.in);

        // answer 
        String answer = "0";

        do {
            menu.showItems();
            answer = sc.nextLine();

            switch (answer) {
                case "1":
                    System.out.println("Codigo: ");
                    String codStr = sc.nextLine();
                    Integer cod = Integer.valueOf(codStr);
                    break;
                case "2":
                    System.out.println("Caso 2");
                    break;
                case "3":
                    System.out.println("Caso 3");
                    break;
                case "4":
                    System.out.println("Caso 4");
                    break;
                case "5":
                    System.out.println("Caso 5");
                    break;
                default:
                    break;
            }

        } while(!answer.equals("6"));

        sc.close();
    }

}
