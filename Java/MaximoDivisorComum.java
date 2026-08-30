package Java;

import java.util.Scanner;

public class MaximoDivisorComum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro (a): ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro (b): ");
        int b = scanner.nextInt();

        
        int originalA = a;
        int originalB = b;

        
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        
        System.out.println("\nO MDC de " + originalA + " e " + originalB + " é: " + Math.abs(a));

        scanner.close();
    }
}
