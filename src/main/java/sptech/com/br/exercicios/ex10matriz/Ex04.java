package sptech.com.br.exercicios.ex10matriz;

import java.util.Scanner;

public class Ex04 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner scText = new Scanner(System.in);

        // definindo quantidade de alunos
        Integer maxAluno;
        
        while(true) {
            try {
                System.out.println("Digite o valor maxAluno:");
                String maxAlunoString = sc.nextLine();

                maxAluno = Integer.valueOf(maxAlunoString);

                if (maxAluno > 15 || maxAluno < 0) {
                    throw new Exception("");
                }

                break;
            } catch (Exception e) {
                System.out.println("Valor inválido. Tente valores inteiros entre 0 e 15.");
            }
        }

        String[] alunos = new String[maxAluno];
        double[][] notas = new double[maxAluno][2];
        double[] medias = new double[2];

        // cadastrando nota dos alunos
        for (int aluno = 0; aluno < maxAluno; aluno++) {
            // nome aluno
            System.out.println("Digite o nome do aluno: ");
            alunos[aluno] = scText.nextLine();
            System.out.println("Digite as notas do aluno " + alunos[aluno]);

            for (int nota = 0;  nota < notas[aluno].length; nota++) {
                try {
                    System.out.println("Nota AC" + (nota + 1));
                    notas[aluno][nota] = sc.nextDouble();
                } catch (Exception e) {
                    System.out.println("Valor inválido. Tente novamente");
                }
            }
        }

        // calculando notas médias
        for (int j = 0; j < notas[0].length; j++) {
            double total = 0;
            for (int i = 0; i < notas.length; i++) {
                total += notas[i][j];
            }
            medias[j] = total / notas.length;
        }

        // exibição
        System.out.println(String.format("NOME DO ALUNO\tAC1\tAC2"));
        for (int aluno = 0; aluno < alunos.length; aluno++) {
            System.out.print(String.format("\n%-13s\t", alunos[aluno]));

            for (int nota = 0; nota < notas[0].length; nota++) {
                System.out.print(String.format("%.1f\t", notas[aluno][nota]));
            }
        }

        System.out.println(String.format("\n\n%-13s\t%.1f\t%.1f", "MÉDIA:", medias[0], medias[1]));

        // closing scanners
        sc.close();
        scText.close();
    }
}
