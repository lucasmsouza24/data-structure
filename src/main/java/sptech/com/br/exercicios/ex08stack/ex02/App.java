package sptech.com.br.exercicios.ex08stack.ex02;

import sptech.com.br.exercicios.ex08stack.ex01.MyStack;

public class App {
    public static void main(String[] args) {
        // vectors
        int[] conj1 = new int[] {1, 3, 3, 1};
        int[] conj2 = new int[] {10, 20, 30, 40};
        int[] conj3 = new int[] {10, 20, 30, 30, 20, 10};
        int[] conj4 = new int[] {1, 2, 3, 2, 1};

        System.out.println(isPalindrome(conj1));
        System.out.println(isPalindrome(conj2));
        System.out.println(isPalindrome(conj3));
        System.out.println(isPalindrome(conj4));
    }
    
    // return true if vector @param vector is an palimdrome
    public static boolean isPalindrome(int[] vector) {
        MyStack<Integer> myStack = toStack(vector);
        
        for (int i = 0; i < Math.floor(vector.length / 2) ; i++) {
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
}
