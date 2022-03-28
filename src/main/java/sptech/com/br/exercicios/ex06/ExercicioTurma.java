package sptech.com.br.exercicios.ex06;

import java.util.Objects;
import java.util.Scanner;

public class ExercicioTurma {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int qtdAlunos = 10;

        String[] t1 = new String[qtdAlunos];
        String[] t2 = new String[qtdAlunos];

        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Nome do aluno: ");
            String nome = sc.nextLine();

            System.out.print("Turma do aluno: (1/2)");
            String turma = sc.nextLine();

            if (turma.equals("1")) {
                int nextIndex = firstNonNullIndex(t1);
                t1[nextIndex] = nome;
            } else if (turma.equals("2")) {
                int nextIndex = firstNonNullIndex(t2);
                t2[nextIndex] = nome;
            }
        }

        sc.close();

        
        showTurma(t1, "t1");
        showTurma(t2, "t2");
    }

    public static int firstNonNullIndex(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Objects.isNull(array[i])) {
                return i;
            }
        }

        return -1;
    }

    public static void showTurma(String[] turmaArray, String turma) {

        System.out.println("\n\nA turma " + turma + " possui " + nonNullLength(turmaArray) + " alunos");

        for(int i = 0; i < turmaArray.length; i++) {
            System.out.println(turmaArray[i]);
        }
    }

    public static int nonNullLength(String[] array) {
        int length = 0;

        for (int i = 0; i < array.length; i++) {
            if (Objects.nonNull(array[i])) {
                length++;
            }
        }

        return length;
    }
}
