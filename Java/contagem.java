package Java;

import java.util.Scanner;

class Contagem {

    public void executar() {
        
        try (Scanner prompt = new Scanner(System.in)) {
            int cont = 0;
            int i = 0;

            System.out.print("Quantidade de Alunos: ");
            int n = prompt.nextInt();

            while (i < n) {
                i++;
                System.out.print("Nota do Aluno " + i + ": ");
                int nota = prompt.nextInt();

                if (nota >= 50) {
                    cont++;
                }
            }

            System.out.println("Sao " + n + " alunos");
            System.out.println("Sao " + cont + " aprovados");
        }
    }

    public static void main(String[] args) {
        new Contagem().executar();
    }
}