package generation;

import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cálculo Salarial");
        System.out.print("Digite seu nome, por favor: ");
        String nome = scanner.nextLine();
        
        System.out.print("Salário Bruto: R$ ");
        float salarioBruto = scanner.nextFloat();
        
        System.out.print("Adicional Noturno: R$ ");
        float adicionalNoturno = scanner.nextFloat();
        
        System.out.print("Horas Extras: ");
        float horasExtras = scanner.nextFloat();
        
        System.out.print("Descontos: R$ ");
        float descontos = scanner.nextFloat();
        
        float salarioLiquido = salarioBruto 
                             + adicionalNoturno 
                             + (horasExtras * 5) 
                             - descontos;
        
        System.out.println("\nDemonstrativo de Pagamento");
        System.out.println("Colaborador: " + nome);
        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Adicional Noturno: R$ %.2f%n", adicionalNoturno);
        System.out.printf("Horas Extras (R$ 5.00/h): %.2f horas%n", horasExtras);
        System.out.printf("Total Horas Extras: R$ %.2f%n", (horasExtras * 5));
        System.out.printf("Descontos: R$ %.2f%n", descontos);
        System.out.printf("SALÁRIO LÍQUIDO: R$ %.2f%n", salarioLiquido);
        
        scanner.close();
    }
}
