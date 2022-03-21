package sptech.com.br.exercicios.ex06;

import java.util.Scanner;

public class Questao06 {
    
    public static int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma data (1/12): ");
        String dataStr = sc.nextLine();
        sc.close();

        String[] dataStrArray = dataStr.split("/");
        int[] data = {Integer.valueOf(dataStrArray[0]), Integer.valueOf(dataStrArray[1])};
        System.out.println("\ndias: " + contaDias(data));
    }

    public static int contaDiasMeses(int[] data) {
        int diasMeses = 0;

        for (int i = 0; i < data[1] - 1; i++) {
            diasMeses += meses[i];
        }

        return diasMeses;
    }

    public static int contaDias(int[] data) {
        return data[0] + contaDiasMeses(data);
    }
}
