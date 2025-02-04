package generation;
import java.util.Scanner;

public class Project6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println(" Sistema de Reajuste Salarial ");
                
        System.out.print("Digite seu nome, por favor: ");
        String adminNome = scanner.nextLine();
        
        System.out.println("\nBem-vindo(a), " + adminNome + "!");
        System.out.println("Vamos calcular o reajuste salarial do colaborador.\n");
                
        System.out.print("Nome do colaborador: ");
        String nomeColab = scanner.nextLine();
        
        System.out.print("Cargo (1-Gerente, 2-Vendedor, 3-Supervisor, 4-Motorista, 5-Estoquista, 6-Técnico de TI): ");
        int cargo = scanner.nextInt();
        
        System.out.print("Salário: R$ ");
        float salario = scanner.nextFloat();
        
               String nomeCargo;
        float percentual;
               
        switch (cargo) {
            case 1:
                nomeCargo = "Gerente";
                percentual = 0.10f;
                break;
            case 2:
                nomeCargo = "Vendedor";
                percentual = 0.07f;
                break;
            case 3:
                nomeCargo = "Supervisor";
                percentual = 0.09f;
                break;
            case 4:
                nomeCargo = "Motorista";
                percentual = 0.06f;
                break;
            case 5:
                nomeCargo = "Estoquista";
                percentual = 0.05f;
                break;
            case 6:
                nomeCargo = "Técnico de TI";
                percentual = 0.08f;
                break;
            default:
                nomeCargo = "Cargo Inválido";
                percentual = 0f;
                break;
        }
        
        float reajuste = salario * percentual;
        float novoSalario = salario + reajuste;
        
       
        System.out.println("Demonstrativo de Reajuste");
        System.out.println("Nome do colaborador: " + nomeColab);
        System.out.println("Cargo: " + nomeCargo);
        System.out.printf("Salário atual: R$ %.2f%n", salario);
        System.out.printf("Percentual de reajuste: %.1f%%%n", percentual * 100);
        System.out.printf("Valor do reajuste: R$ %.2f%n", reajuste);
        System.out.printf("Novo salário: R$ %.2f%n", novoSalario);
        
        System.out.println("\nReajuste processado por: " + adminNome);
      
        
        scanner.close();
    }
}
