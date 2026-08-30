package Java;

import java.util.Scanner;

public class Somatório {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você deseja somar? ");
        int quantidade = scanner.nextInt();

        double soma = 0;

        
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = scanner.nextDouble();
            soma += numero;
        }

        System.out.println("\nA soma total dos números é: " + soma);

        scanner.close();
    }
}
