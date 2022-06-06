package sptech.com.br.exercicios.ex10matriz;

import java.util.Scanner;

public class Ex01 {
    
    public static void main(String[] args) {
        
        int[][] matriz = new int[2][3];

        Scanner sc = new Scanner(System.in);

        // input de dados na matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz[i].length; j++) {
                System.out.println(String.format("Posição [%d][%d]: ", i, j));
                int value = sc.nextInt();
                matriz[i][j] = value;
            }
        }

        // lendo valores
        showMatriz(matriz);

        sc.close();
    }

    public static void showMatriz(int[][] matriz) {
        System.out.println("=".repeat(25));
        for (int i = 0; i < matriz.length; i++) {
            showLine(matriz[i]);
        }
        System.out.println("=".repeat(25));
    }

    public static void showLine(int[] line) {
        for (int i = 0; i < line.length; i++) {
            System.out.print(String.format("%d\t", line[i]));
        }

        System.out.print("\n");
    }
}
