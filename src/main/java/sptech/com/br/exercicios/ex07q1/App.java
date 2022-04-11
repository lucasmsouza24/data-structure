package sptech.com.br.exercicios.ex07q1;

import sptech.com.br.exercicios.ex07q2.ListaObj;

public class App {
    public static void main(String[] args) {

        ListaObj<Produto> produtos = new ListaObj<Produto>(4);

        Produto prod1 = new Produto(123, "Notebook", 10.50, "***", 52500);
        Produto prod2 = new Produto(124, "Mouse", 2.50, "*", 12500);
        Produto prod3 = new Produto(124, "Teclado", 10.40, "***", 52000);
        Produto prod4 = new Produto(124, "TV", 150.56, "*****", 752800);

        produtos.append(prod1);
        produtos.append(prod2);
        produtos.append(prod3);
        produtos.append(prod4);

        System.out.println(String.format("%6s %-14s %7s %7s %14s", "CODIGO", "NOME", "PREÇO", "NOTA", "FATURAMENTO"));

        produtos.showEach();
    }
}
