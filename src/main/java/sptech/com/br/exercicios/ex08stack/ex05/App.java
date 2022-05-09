package sptech.com.br.exercicios.ex08stack.ex05;

import sptech.com.br.aulas.aula08stack.MyStack;

public class App {
    
    public static void main(String[] args) {
        System.out.println(isPalindrome("a torre da derrota"));
        System.out.println(isPalindrome("radar"));
        System.out.println(isPalindrome("ovo"));
        System.out.println(isPalindrome("Ana"));
        System.out.println(isPalindrome("subi no ônibus"));
        System.out.println(isPalindrome("subi no onibus"));
        
    }

    public static boolean isPalindrome(String str) {

        str = removeSomeChars(str);

        MyStack<Character> charStack = new MyStack<Character>(str.length());
        
        for (Character c : str.toCharArray()) {
            charStack.push(c);
        }

        // é palindromo
        if (charStack.toString().equals(charStack.toReverseString())) {
            return true;
        }

        // não é palindromo
        return false;
    }

    public static String removeSomeChars(String str) {
        return str.replace("-", "").replace(" ", "").toLowerCase();
    }
}
