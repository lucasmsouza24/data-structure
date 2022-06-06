package sptech.com.br.exercicios.ex09StackQueue;

import sptech.com.br.aulas.aula08stack.MyStack;
import sptech.com.br.aulas.aula09fila.MyQueue;

public class App {
    
    public static void main(String[] args) {
        
        // a
        MyStack<Operacao> pilha = new MyStack<Operacao>(10);
        MyQueue<Operacao> fila = new MyQueue<Operacao>(10);

        // b
        int operacoesRealizadas = 0;

        // c
        ContaBancaria c1 = new ContaBancaria(100, 4500d);
        ContaBancaria c2 = new ContaBancaria(200, 3000d);

        // d
        
    }
}
