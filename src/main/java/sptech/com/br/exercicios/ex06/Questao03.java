package sptech.com.br.exercicios.ex06;

import java.util.Scanner;

public class Questao03 {
    
    public static void main(String[] args) {
        
        Scanner sc1 = new Scanner(System.in);
        String[] names = new String[3];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º nome: ");
            String value = sc1.nextLine();
            names[i] = value;
        }

        System.out.println("Digite um nome para procurar dentro do vetor: ");
        String search = sc1.nextLine();
        int index = indexOf(search, names);
    
        if (index == -1) {
            System.out.println("Nome não encontrado");
        } else {
            System.out.println(names[index] + " encontrado no indice " + index);
        }

        sc1.close();
    }

    public static String displayNames(String[] names) {
        String str = "String[";

        for (int i = 0; i < names.length; i++) {
            if (i < names.length - 1) {
                str += names[i] + ", ";
            } else {
                str += names[i] + "]";
            }
        }

        return str;
    }

    public static int indexOf(String name, String[] names) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return i;
            }
        }

        return -1;
    }
}
