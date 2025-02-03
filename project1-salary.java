package generation;

import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        
    		String nome;
        float salario, abono, novoSalario;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite seu nome: ");
        nome = scanner.nextLine();
        
        System.out.println("\nSeja bem-vindo(a), " + nome + "!");
        
        System.out.println("Por favor, digite o seu salário atual: ");
        salario = scanner.nextFloat();
        
        System.out.println("Agora insira o valor do abono: ");
        abono = scanner.nextFloat();
        
        novoSalario = salario + abono;
        
        System.out.printf(nome + ", " + "o seu novo salário é: %.2f%n", novoSalario);
        
        scanner.close();
    }
}

