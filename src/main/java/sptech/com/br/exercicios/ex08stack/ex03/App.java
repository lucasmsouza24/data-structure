package sptech.com.br.exercicios.ex08stack.ex03;

import sptech.com.br.aulas.aula08stack.MyStack;

public class App {
    
    public static void main(String[] args) {
        MyStack<String> stringStack = new MyStack<String>(10);
        
        stringStack.push("Valor 1");
        stringStack.push("Valor 2");
        stringStack.push("Valor 3");

        while (stringStack.isNotEmpty()) {
            System.out.println(stringStack.pop());
        }

        System.out.println("Fim!");
    }

}
