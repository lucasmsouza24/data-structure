package sptech.com.br.exercicios.ex06;

import java.util.Scanner;

public class Questao05 {
    
    public static void main(String[] args) {

        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);

        String[] modelos = new String[5];
        int[] rendimentos = new int[5];

        for (int i = 0; i < modelos.length; i++) {
            // modelo
            System.out.println("Digite o " + (i + 1) + "º modelo: ");
            modelos[i] = scStr.nextLine();

            // rendimento
            System.out.println("Digite o " + (i + 1) + "º rendimento: ");
            rendimentos[i] = scInt.nextInt();
        }

        scStr.close();
        scInt.close();

        int maisEconomico = indexMaisEconomico(rendimentos);

        System.out.println("=".repeat(30));
        System.out.println("Mais economico:");
        System.out.println("=".repeat(30));

        System.out.println(modelos[maisEconomico]);
        System.out.println(rendimentos[maisEconomico]);
    }

    public static int indexMaisEconomico(int[] rendimentos) {
        Integer maisEconomico = null;
        Integer maisEconomicoIndex = null;

        for(int i = 0; i < rendimentos.length; i++) {
            System.out.println("======" + i);
            if (i == 0) {
                maisEconomico = rendimentos[i];
                maisEconomicoIndex = i;
            } else if (rendimentos[i] > maisEconomico) {
                maisEconomico = rendimentos[i];
                maisEconomicoIndex = i;
            }
        }

        return maisEconomicoIndex;
    }
}
