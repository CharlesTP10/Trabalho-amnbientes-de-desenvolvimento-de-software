package Java;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos N (N > 1): ");
        int n = scanner.nextInt();

        
        if (n <= 1) {
            System.out.println("Por favor, digite um valor maior que 1.");
        } else {
            long termo1 = 0;
            long termo2 = 1;

            System.out.print("Sequência de Fibonacci: " + termo1 + ", " + termo2);

            
            for (int i = 3; i <= n; i++) {
                long proximoTermo = termo1 + termo2;
                System.out.print(", " + proximoTermo);
                
                
                termo1 = termo2;
                termo2 = proximoTermo;
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
