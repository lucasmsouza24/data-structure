package sptech.com.br.exercicios.ex06;

import java.util.Scanner;

public class Questao04 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] inteiros = new int[3];

        for (int i = 0; i < inteiros.length; i++) {
            System.out.println("Digite um valor inteiro: ");
            
            int value = sc.nextInt();
            inteiros[i] = value;
        }

        System.out.println("\nValores inseridos!\n");

        System.out.println("Digite um dos valores inseridos: ");

        int value = sc.nextInt();
        System.out.println("O valor " + value + " ocorre " + repeats(value, inteiros) + " vezes.");

        sc.close();
    }

    public static int repeats(int value, int[] integers) {
        int repeats = 0;

        for (int integer : integers) {
            if (integer == value) {
                repeats++;
            }
        }
        
        return repeats;
    }
}
