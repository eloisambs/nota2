import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[100];
        double[] medias = new double[100];

        int quantidade = 0;
        int opcao;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opcao: ");

            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("\n--- CADASTRO DE ALUNO ---");

                    System.out.print("Digite o nome do aluno: ");
                    String nome = entrada.nextLine();

                    System.out.print("Digite a nota 1: ");
                    double nota1 = entrada.nextDouble();

                    System.out.print("Digite a nota 2: ");
                    double nota2 = entrada.nextDouble();

                    System.out.print("Digite a nota 3: ");
                    double nota3 = entrada.nextDouble();

                    System.out.print("Digite a nota 4: ");
                    double nota4 = entrada.nextDouble();

                    entrada.nextLine();

                    if (nota1 >= 0 && nota1 <= 10 &&
                        nota2 >= 0 && nota2 <= 10 &&
                        nota3 >= 0 && nota3 <= 10 &&
                        nota4 >= 0 && nota4 <= 10 &&
                        quantidade < 100 && !nome.equals("")) {

                        double media = (nota1 + nota2 + nota3 + nota4) / 4;

                        nomes[quantidade] = nome;
                        medias[quantidade] = media;
                        quantidade++;

                        System.out.println("\n--- RESULTADO ---");
                        System.out.println("Nome do aluno: " + nome);
                        System.out.printf("Media: %.2f%n", media);

                        if (media >= 7) {
                            System.out.println("Situacao: Aprovado");
                        } else {
                            System.out.println("Situacao: Reprovado");
                        }

                    } else {
                        System.out.println("Dados invalidos! Confira o nome e as notas.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE ALUNOS ---");

                    if (quantidade == 0) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (int i = 0; i < quantidade; i++) {
                            System.out.println("\nNome: " + nomes[i]);
                            System.out.printf("Media: %.2f%n", medias[i]);

                            if (medias[i] >= 7) {
                                System.out.println("Situacao: Aprovado");
                            } else {
                                System.out.println("Situacao: Reprovado");
                            }
                        }
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado!");
                    break;

                default:
                    System.out.println("Opcao invalida! Digite 1, 2 ou 0.");
                    break;
            }

        } while (opcao != 0);

        entrada.close();
    }
}