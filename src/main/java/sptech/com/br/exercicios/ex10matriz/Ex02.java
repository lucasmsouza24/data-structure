package sptech.com.br.exercicios.ex10matriz;

public class Ex02 {

    public static void main(String[] args) {
        
        int[][] m1 = {{0, 1, 0}, {0, 1, 0}};
        int[][] m2 = {{0, 2, 3}, {4, 0, 0}};
        int[][] m3 = somaMatrizes(m1, m2);

        int[][][] matrizes = {m1, m2, m3};
        
        for (int i = 0; i < matrizes.length; i++) {
            System.out.println("\nMatriz " + (i + 1));
            System.out.println("=========");
            exibeMatriz(matrizes[i]);
        }
    }

    public static int[][] somaMatrizes(int[][] m1, int[][] m2) {

        int[][] aux = new int[m1.length][m1[0].length];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                aux[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return aux;
    }
    
    public static void exibeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(String.format("%d ", matriz[i][j]));
            }
        
            System.out.print("\n");
        }
    }
}