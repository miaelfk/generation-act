package generation;
import java.util.Scanner;

public class Project5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int numero;
        
        System.out.print("Por favor, digite seu nome: ");
        nome = scanner.nextLine();
        
        System.out.println("\n" + nome + ", agora, digite um número para descobrir se é par/ímpar e positivo/negativo: ");
        numero = scanner.nextInt();
        
        String parImpar;
        String positivoNegativo;
        
        if (numero % 2 == 0) {
            parImpar = "par";
        } else {
            parImpar = "ímpar";
        }
        
        if (numero >= 0) {
            positivoNegativo = "positivo";
        } else {
            positivoNegativo = "negativo";
        }
        
        System.out.println("O Número " + numero + " é " + parImpar + " e " + positivoNegativo + "!");
        
        scanner.close();
    }
}
