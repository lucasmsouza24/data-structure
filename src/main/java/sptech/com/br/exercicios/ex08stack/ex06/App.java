package sptech.com.br.exercicios.ex08stack.ex06;

public class App {
    
    public static void main(String[] args) {
        
        MyStack<Livro> bookStack = new MyStack<Livro>(20);

        for (int i = 1; i <= 10; i++) {
            bookStack.push(new Livro("livro " + i, "autor " + i));
        }

        // atribuindo os últimos 5 livros à uma pilha auxiliar
        MyStack<Livro> aux = bookStack.multipop(5);

        // removendo apenas o livro 6
        Livro livro6 = aux.pop();

        // devolvendo os demais livros à pilha original
        bookStack.multipush(aux);

        // exibindo resultados
        System.out.println("livro 6: " + livro6);

        System.out.println("==============");
        System.out.println("bookStack");
        System.out.println("==============");
        bookStack.showAllValues();
    }
}
