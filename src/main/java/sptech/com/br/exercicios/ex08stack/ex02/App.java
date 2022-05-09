package sptech.com.br.exercicios.ex08stack.ex02;

import sptech.com.br.aulas.aula08stack.MyStack;

public class App {
    
    public static void main(String[] args) {
        Integer value1 = 12;
        Integer value2 = 32;

        System.out.println(decToBin(value1));
        System.out.println(decToBin(value2));
    }

    // incompleto
    public static String decToBin(Double decimalValue) {

        MyStack<Integer> myStack = new MyStack<Integer>();

        double accumulator = decimalValue;

        while (accumulator > 1) {
            int acc = (int) accumulator % 2;
            myStack.push(Integer.valueOf(acc));
            accumulator = acc == 0 ? accumulator / 2 : (accumulator / 2) - 0.5;

            // adicionando último elemento
            if (accumulator == 1) {
                myStack.push(1);
            } else if (accumulator == 0) {
                myStack.push(0);
            }
        }

        return myStack.toReverseString();
    }
    public static String decToBin(Integer decimalValue) {
        return decToBin(Double.valueOf(decimalValue));
    }
}
