package sptech.com.br.exercicios.ex08stack.ex01;

import sptech.com.br.aulas.aula08stack.MyStack;

public class App {
    public static void main(String[] args) {
        // vectors
        int[] conj1 = new int[] {1, 3, 3, 1};
        int[] conj2 = new int[] {10, 20, 30, 40};
        int[] conj3 = new int[] {10, 20, 30, 30, 20, 10};
        int[] conj4 = new int[] {1, 2, 3, 2, 1};

        // display values
        System.out.println(isPalindrome(conj1));
        System.out.println(isPalindrome(conj2));
        System.out.println(isPalindrome(conj3));
        System.out.println(isPalindrome(conj4));
    }
    
    // return true if vector @param vector is an palimdrome
    public static boolean isPalindrome(int[] vector) {
        MyStack<Integer> myStack = toStack(vector);
        
        for (int i = 0; i < Math.floor(vector.length / 2); i++) {
            if (vector[i] != myStack.pop()) {
                return false;
            }
        }
        
        return true;
    }

    // return true if Vector @param vector is an palimdrome
    public static boolean isPalindrome(String[] vector) {
        MyStack<String> myStack = toStack(vector);

        for (int i = 0; i < Math.floor(vector.length / 2); i++) {
            if (vector[i] != myStack.pop()) {
                return false;
            }
        }

        return true;
    }
    
    // returns convert int vector to Integer Stack
    public static MyStack<Integer> toStack(int[] vector) {
        MyStack<Integer> myStack = new MyStack<Integer>();

        for (int value : vector) {
            myStack.push(value);
        }

        return myStack;
    }

    // returns convert String vector to String Stack
    public static MyStack<String> toStack(String[] vector) {
        MyStack<String> myStack = new MyStack<String>();

        for (String value : vector) {
            myStack.push(value);
        }

        return myStack;
    }
}
