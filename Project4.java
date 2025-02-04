package generation;

import java.util.Scanner;

public class Project4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cálculo de Diferença");
        float n1, n2, n3, n4, diferenca;
        
        System.out.println("Valor 1: ");
        n1 = scanner.nextFloat();
        
        System.out.println("Valor 2: ");
        n2 = scanner.nextFloat();
        
        System.out.println("Valor 3: ");
        n3 = scanner.nextFloat();
        
        System.out.println("Valor 4: ");
        n4 = scanner.nextFloat();
        
        diferenca = (n1 * n2) - (n3 * n4);
        
        System.out.printf("\nDiferença: %.1f", diferenca);
        
        scanner.close();
    }
}
