package sptech.com.br.aulas.aula07;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Excecao02 {
    public static void main(String[] args) {
        // float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota1 (entre 0 e 10)"));
        // float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota2 (entre 0 e 10)"));
        // try {
        //     if(nota1 < 0 || nota1 > 10) {
        //         throw new LimiteUltrapassadoException("Nota1: Valor fora dos limite permitidos!");
        //     }
        //     if(nota2 < 0 || nota2 > 10) {
        //         throw new LimiteUltrapassadoException("Nota2: Valor fora dos limite permitidos!");
        //     }
        //     JOptionPane.showMessageDialog(null, "media = " + (nota1 + nota2) / 2);
        // } catch(LimiteUltrapassadoException e) {
        //     JOptionPane.showMessageDialog(null, "Erro: " + e.data);
        // }

        Scanner sc = new Scanner(System.in);

        int numerador, denominador, resultado;

        boolean continua = true;
        
        do {    
            System.out.println("Digite o valor do numerador: ");
            numerador = sc.nextInt();
            
            System.out.println("Digite o valor do denominador: ");
            denominador = sc.nextInt();

            try {   
                resultado = divide(numerador, denominador);
                continua = false;
            }
            catch(ArithmeticException e) {
                System.out.println(e);
            } 
            
        } while(continua);
        // System.out.println(resultado);
        
    }

    public static int divide(double numerador, double denominador) throws ArithmeticException {
        return Integer.valueOf(String.valueOf(numerador / denominador));
    }
}
