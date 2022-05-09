package sptech.com.br.exercicios.ex08stack.ex04;

import sptech.com.br.aulas.aula08stack.MyStack;

public class App {
    
    public static void main(String[] args) {
        
        String frase = "a Pilha do Gato";

        MyStack<Character> charStack = new MyStack<Character>(frase.length());

        // adicionando cada caractere à stack de Character
        for (Character c : frase.toCharArray()) {
            charStack.push(c);
        }

        String fraseAoContrario = charStack.toReverseString();

        // exibindo frase ao contrario
        System.out.println(fraseAoContrario);
    }
}
