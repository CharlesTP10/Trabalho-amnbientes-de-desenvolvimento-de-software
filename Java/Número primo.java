package Java;

import java.util.Scanner;

class NúmeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println(n + " não é um número primo.");
        } else {
            boolean ehPrimo = true;

            // Otimização: verifica divisores apenas até a raiz quadrada de n
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    ehPrimo = false; // Encontrou um divisor, não é primo
                    break;           // Interrompe o loop cedo
                }
            }

            if (ehPrimo) {
                System.out.println(n + " é um número primo.");
            } else {
                System.out.println(n + " não é um número primo.");
            }
        }

        scanner.close();
    }
}
