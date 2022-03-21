package sptech.com.br.exercicios.ex06;

import java.util.Scanner;

public class Questao06 {
    
    public static int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um dia: ");
        int dia = sc.nextInt();

        System.out.println("Digite um mês: ");
        int mes = sc.nextInt();

        sc.close();

        int[] data = {dia, mes};
        System.out.println("\ndias: " + contaDias(data));
        
    }

    public static int contaDiasMeses(int[] data) {
        int mesesAContar = data[1] - 1;
        int diasMeses = 0;

        if (mesesAContar == 0) {
            return 0;
        } 

        for (int i = 0; i < mesesAContar; i++) {
            diasMeses += meses[i];
        }

        return diasMeses;
    }

    public static int contaDias(int[] data) {
        return data[0] + contaDiasMeses(data);
    }
}
