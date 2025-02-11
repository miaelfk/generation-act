package generation;
import java.util.Scanner;
import java.util.Stack;

public class Project15 {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Sistema de Organização de Livros");

        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros da pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Finalizar o programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    String livro = scanner.nextLine();
                    pilha.push(livro);
                    System.out.println("Livro \"" + livro + "\" adicionado à pilha.");
                    break;
                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        System.out.println("\nLivros na pilha:");
                        for (String l : pilha) {
                            System.out.println(l);
                        }
                        System.out.println("\nTotal de livros na pilha: " + pilha.size());
                    }
                    break;
                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia. Não há livros para retirar.");
                    } else {
                        String retirado = pilha.pop();
                        System.out.println("Livro retirado: \"" + retirado + "\"");
                    }
                    break;
                case 0:
                    System.out.println("Programa finalizado. Obrigado por usar o sistema!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
