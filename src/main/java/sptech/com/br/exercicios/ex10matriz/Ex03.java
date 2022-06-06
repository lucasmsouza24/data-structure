package sptech.com.br.exercicios.ex10matriz;

public class Ex03 {
    
    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[] somas = somas(matriz);

        for (int i = 0; i < somas.length; i++) {
            System.out.println(somas[i]);
        }
        
    }

    public static int[] somas(int[][] matriz) {
        int[] soma = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            int total = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                total += matriz[j][i];
            }

            soma[i] = total;
        }

        return soma;
    }
    
}
