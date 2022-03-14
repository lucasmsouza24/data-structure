package sptech.com.br.aulas.aula03vetor;

import java.util.Scanner;

public class ExemploVetor {

    public static void exibeVetor(int[] v) {
        // exibindo o vetor
        for (int i = 0; i < v.length; i++) {
            System.out.print("v[" + i + "] = " + v[i] + "\t");
        }
        System.out.println();
    }

    // exercício 01
    public static int soma(int[] v) {
        int total = 0;

        for (int element : v) {
            total += element;
        }

        return total;
    }

    // exercício 02
    public static int pares(int[] v) {
        int total = 0;

        for (int element : v) {
            if (element % 2 == 0) {
                total += 1;
            }
        }

        return total;
    }

    // main method
    public static void ex03() {
        // desafio 3
        Scanner sc = new Scanner(System.in);
        String[] diasSemana = {"domingo", "segunda", "terça", "quarta", "quinta", "sexta", "sábado"};
        
        int choose = 0;
        
        while(true) {
            System.out.println("Digite um int de 1 a 7");
            choose = sc.nextInt();

            if (1 <= choose && choose <= 7) {
                System.out.println(diasSemana[choose - 1]);
                break;
            }

            System.out.println("Valor inválido");
        }
        
        sc.close();
    }
    
    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);

        // criação de um vetor de 5 inteiros
        // int[] vetor = new int[5];

        // atribuição de valores para vetor
        // for(int i = 0; i < vetor.length; i++) {
        //     vetor[i] = i * 10;
        // }
        // for (int i = 0; i < vetor.length; i++) {
        //     System.out.println("Insira o valor da posição: " + i);
        //     int value = sc.nextInt();
        //     vetor[i] = value;
        // }
        
        // int[] vet2 = {100, 200, 300, 400, 500};
        
        // exibindo vetor
        // exibeVetor(vetor);
        
        // exibeVetor(vet2);
        

        // ex 01
        int[] vetor1 = {1, 3, 2, 4, 6, 5, 7, 3, 4, 2};

        System.out.println("Soma: " + soma(vetor1));
        System.out.println("Par: " + pares(vetor1));

        ex03();

    }
}
