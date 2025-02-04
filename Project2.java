package generation;

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        float[] notas = new float[4];
        float media = 0;

        System.out.println("Cálculo de Média Final");
        System.out.print("Por favor, digite o seu nome: ");
        nome = scanner.nextLine();
        
        System.out.println("\nBem-vindo(a), " + nome + "! Vamos calcular sua média.");

        for(int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i+1) + ": ");
            notas[i] = scanner.nextFloat();
            media += notas[i];
        }

        media /= 4;


        System.out.println("\nMédia Final");
        System.out.println("Participante: " + nome);
        System.out.printf("Média final: %.1f", media);

        scanner.close();
    }
}
