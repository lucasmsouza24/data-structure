package sptech.com.br.exercicios.ex07q2;

import java.util.Objects;
import java.util.Scanner;

public class TesteListaAluno {
    public static void main(String[] args) {
        Scanner scNum = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        ListaObj<Aluno> alunos = new ListaObj<Aluno>(10);

        String escolha;
        boolean fim = false;

        String[] menu = {"Adicionar um aluno", "Exibir a lista", "Exibir um aluno da lista", "Limpar a lista", "Buscar um aluno pelo RA", "Fim"};

        while (!fim) {
            // menu
            exibirMenu(menu);
            escolha = scStr.nextLine();

            switch (escolha) {
                case "1":
                    titleString("Adicionando Aluno");

                    System.out.println("RA do aluno: ");
                    int ra = scNum.nextInt();

                    System.out.println("nome do aluno: ");
                    String nome = scStr.nextLine();

                    System.out.println("Nota do aluno: ");
                    Double nota = scNum.nextDouble();

                    Aluno a = new Aluno(ra, nome, nota);
                    alunos.append(a);
                    break;
                
                case "2":
                    titleString("Exibindo elementos da lista: ");
                    alunos.displayValues();
                    break;
                 
                case "3":

                    while (true) {

                        // lista vazia
                        if (alunos.length() == 0) {
                            System.out.println("Nenhum aluno cadastrado!");
                            break;
                        }

                        // solicitando indice
                        titleString("Exibindo aluno específico");
                        
                        System.out.println("Digite o indice do aluno: ");
                        ra = scNum.nextInt();
                        a = alunos.getByIndex(ra);

                        // indice válido
                        if (Objects.nonNull(a)) {
                            System.out.println(a);
                            break;
                        } 

                        // indice inválido
                        System.out.println("índice inválido");
                    }
                    break;
                
                case "4":
                    titleString("Limpando lista...");
                    alunos.clear();
                    break;
                
                case "5":
                    titleString("Buscando aluno pelo RA");

                    System.out.println("Digite o RA");
                    ra = scNum.nextInt();

                    for (int i = 0; i < alunos.length(); i++) {
                        a = alunos.getByIndex(i);
                        if(a.getRa() == ra) {
                            System.out.println(a);
                            break;
                        }
                    }

                    System.out.println("Aluno não encontrado!");

                    break;
                 
                case "6":
                    titleString("Bye!");
                    fim = true;
                    break;
            
                default:
                    titleString("Opção inválida!");
                    break;
            }
        }

        scNum.close();
        scStr.close();
    }

    // display menu
    public static void exibirMenu(String[] template) {
        System.out.println();
        titleString("Escolha uma das opções:");
        
        for (int i = 0; i < template.length; i++) {
            System.out.println(String.format("%d. %s", i + 1, template[i]));
        }
        System.out.println("=".repeat(35));
        
    }

    public static void titleString(String str) {
        System.out.println("=".repeat(35));
        System.out.println(str);
        System.out.println("=".repeat(35));
    }
}
