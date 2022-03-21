package sptech.com.br.exercicios.ex06.ex06q01;

import java.util.Scanner;

public class Ex006Q01 {
    
    public static void main(String[] args) {
        String[] diasSemana = {"domingo", "segunda", "terça", "quarta", "quinta", "sexta", "sábado"};
        
        Scanner sc = new Scanner(System.in);
        
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
}
