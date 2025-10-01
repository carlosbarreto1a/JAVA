package biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int escolha;

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Cadastrar Revista");
            System.out.println("3 - Listar Materiais");
            System.out.println("4 - Listar Materiais");
            System.out.println("5 - Buscar por Título");
            System.out.println("6 – Emprestar Material");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o título do Livro: ");
                    String titulo = sc.nextLine();
                    System.out.print("Digite o autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Digite o ano de publicação: ");
                    int anoPublicacao = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Informe o número total de páginas: ");
                    int numeroPaginas = sc.nextInt();
                    sc.nextLine();

                    Livro livro = new Livro(titulo, autor, anoPublicacao, numeroPaginas);
                    biblioteca.adicionarMaterial(livro);
                    System.out.println("Livro adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o título da Revista: ");
                    String tituloRevista = sc.nextLine();
                    System.out.print("Digite o autor: ");
                    String autorRevista = sc.nextLine();
                    System.out.print("Digite o ano de publicação: ");
                    int anoPublicacaoRevista = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Informe o número da edição: ");
                    int numeroEdicao = sc.nextInt();
                    sc.nextLine();

                    Revista revista = new Revista(tituloRevista, autorRevista, anoPublicacaoRevista, numeroEdicao);
                    biblioteca.adicionarMaterial(revista);
                    System.out.println("Revista adicionada com sucesso!");
                    break;

                case 3:
                    biblioteca.listarMateriais();
                    break;

                case 7:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (escolha != 7);

        sc.close();
    }
}