package sptech.com.br.aulas.aula07;

import javax.swing.JOptionPane;

public class Excecao01 {
    public static void main(String[] args) {
        float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota1 (entre 0 e 10)"));
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota2 (entre 0 e 10)"));
        
        try {
            if(nota1 < 0 || nota1 > 10) {
                throw new Exception("Nota1: Valor fora dos limite permitidos!");
            }
            if(nota2 < 0 || nota2 > 10) {
                throw new Exception("Nota2: Valor fora dos limite permitidos!");
            }
            JOptionPane.showMessageDialog(null, "media = " + (nota1 + nota2) / 2);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }
}
