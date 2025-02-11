package generation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Project14 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Sistema de Fila de Clientes");

        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1: Adicionar um novo Cliente na fila");
            System.out.println("2: Listar todos os Clientes na fila");
            System.out.println("3: Chamar (retirar) uma pessoa da fila");
            System.out.println("0: Finalizar o programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do Cliente: ");
                    String nome = scanner.nextLine();
                    fila.add(nome);
                    System.out.println("Cliente " + nome + " adicionado à fila.");
                    break;
                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia.");
                    } else {
                        System.out.println("Clientes na fila:");
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia. Não há clientes para chamar.");
                    } else {
                        String chamado = fila.poll();
                        System.out.println("Cliente chamado: " + chamado);
                    }
                    break;
                case 0:
                    System.out.println("Programa finalizado. Obrigado por usar o sistema!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println("Número total de clientes na fila: " + fila.size());
        } while (opcao != 0);

        scanner.close();
    }
}
