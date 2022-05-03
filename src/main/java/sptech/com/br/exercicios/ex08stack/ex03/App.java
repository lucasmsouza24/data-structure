package sptech.com.br.exercicios.ex08stack.ex03;

import sptech.com.br.exercicios.ex08stack.ex01.MyStack;

public class App {
    
    public static void main(String[] args) {
        Integer value = 9;

        System.out.println(decToBin(value));
    }

    // incompleto
    public static Integer decToBin(Integer decimalValue) {

        MyStack<Integer> myStack = new MyStack<Integer>();

        return stackBinToIntegerBin(myStack);
    }

    public static Integer stackBinToIntegerBin(MyStack<Integer> stackBin) {
        String strBin = "";

        while (stackBin.isNotEmpty()) {
            strBin += stackBin.pop().toString();
        }

        return Integer.valueOf(strBin);
    }
}
