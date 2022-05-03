package sptech.com.br.aulas.exemploAlunoTxt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void gravaArquivoTxt(List<Aluno> lista, String nomeArq) {
        int registroCorpo = 0;

        // monta o registro de Header
        String header = "00NOTA20221";
        header += LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        header += "01";

        // grava registro de header
        gravaRegistro(header, nomeArq);

        for (Aluno a : lista) {
            String corpo = "02\t";

            corpo += String.format("%-5d", a.getRa());
            corpo += String.format("%-20s", a.getNome());
            corpo += String.format("%-10s", a.getCurso());
            corpo += String.format("%-20s", a.getDisciplina());
            corpo += String.format("%6.2f", a.getMedia());
            corpo += String.format("%5d", a.getQtdFaltas());

            System.out.println(corpo);
            
            gravaRegistro(corpo, nomeArq);
        }

    }

    public static void gravaRegistro(String registro, String nomeArq) {
        BufferedWriter saida = null;

        try {
            saida = new BufferedWriter(new FileWriter(nomeArq, true));
            saida.append(registro + "\n");
            saida.close();
        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo");
        }

    }
    
    public static void main(String[] args) {
        
        List<Aluno> alunos = new ArrayList<Aluno>();

        alunos.add(new Aluno(1, "Enzo", "CCO", "Estrutura de Dados", 10, 0));
        alunos.add(new Aluno(2, "Peter", "CCO", "Desenvolvimento Web", 8, 1));
        alunos.add(new Aluno(3, "Jordan", "ADS", "Estrutura de Dados", 7, 2));
        alunos.add(new Aluno(4, "Renato", "CCO", "Design e Interacao", 7, 1));
        alunos.add(new Aluno(5, "Enzo2", "ADS", "Estrutura de Dados", 9, 0));

        gravaArquivoTxt(alunos, "alunos.txt");
        
    }

}
