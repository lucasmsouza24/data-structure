package sptech.com.br.aulas.aula10matrix;

import java.util.Scanner;

public class Matrix {
    
    public static void main(String[] args) {
        // criando uma matriz
        
        int[][] matriz = new int[3][5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite um valor: ");
                int value = sc.nextInt();
                matriz[i][j] = value;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(String.format("%d ", matriz[i][j]));
            }
            System.out.print("\n");
        }
    }

}
