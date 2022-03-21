package sptech.com.br.exercicios.ex06;

import java.util.Arrays;
import java.util.Scanner;

public class Questao02 {
    
    public static void main(String[] args) {
        
        int[] integers = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(30) + "\nDigite 10 valores inteiros\n" + "=".repeat(30));

        for (int i = 0; i < integers.length; i++) {
            System.out.println((i + 1) + "º valor:");
            int value = sc.nextInt();
            integers[i] = value;
        }

        sc.close();

        System.out.println(displayIntegers(integers));
        System.out.println("soma: " + sum(integers));
        System.out.println("media: " + avg(integers));
        System.out.println("Acima da média: " + displayIntegers(aboveAvg(integers)));
    }

    public static String displayIntegers(int[] integers) {

        String str = "int[";

        for (int i = 0; i < integers.length; i++) {
            if (i < integers.length - 1) {
                str += integers[i] + ", ";
            } else {
                str += integers[i] + "]";
            }
        }

        return str;
    }

    public static double avg(int[] integers) {
        return sum(integers) / (double) integers.length;
    }

    public static int sum(int[] integers) {
        int total = 0;

        for (int i : integers) {
            total += i;
        }

        return total;
    }

    public static int[] aboveAvg(int[] integers) {
        int[] aboveAvg = new int[0];
        double avg = avg(integers);

        for (int i : integers) {
            if (i > avg) {
                aboveAvg = Arrays.copyOf(aboveAvg, aboveAvg.length + 1);
                aboveAvg[aboveAvg.length - 1] = i;
            }
        }

        return aboveAvg;
    }
}
