package sptech.com.br.exercicios.ex06;

import java.util.Scanner;

public class Questao01 {
    
    public static void main(String[] args) {
        
        int[] integers = new int[7];
        Scanner sc = new Scanner(System.in);

        // lendo valores
        for (int i = 0; i < integers.length; i++) {
            System.out.println("Digite o " + i + "º valor: ");
            int value = sc.nextInt();
            integers[i] = value;
        }

        sc.close();

        // exibindo
        System.out.println(displayInt(integers));
        System.out.println(displayIntReverse(integers));
    }

    public static String displayInt(int[] integers) {
        String str = "int[";

        for (int i = 0; i < integers.length; i++) {
            if (i < integers.length - 1) {
                str += integers[i] + ", ";
            } else {
                str += integers[i] + "]";
            }
        }

        return str;
    }

    public static String displayIntReverse(int[] integers) {
        String str = "int[";

        for (int i = integers.length - 1; i >= 0; i--) {
            if (i > 0) {
                str += integers[i] + ", ";
            } else {
                str += integers[i] + "]";
            }
        }

        return str;
    }
}
