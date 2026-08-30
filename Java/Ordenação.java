package Java;

import java.util.Arrays;

class QuicksortAlgoritmo {
    public static void main(String[] args) {
        
        int[] meuArray = {34, 7, 23, 32, 5, 62, 32, 12, 1};

        System.out.println("Array original:   " + Arrays.toString(meuArray));

       
        
        quicksort(meuArray, 0, meuArray.length - 1);

        System.out.println("Array ordenado:   " + Arrays.toString(meuArray));
    }

   
    public static void quicksort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            
            int indicePivo = particionar(arr, inicio, fim);

            
            quicksort(arr, inicio, indicePivo - 1);

            
            quicksort(arr, indicePivo + 1, fim);
        }
    }

    
    private static int particionar(int[] arr, int inicio, int fim) {
        
        int pivo = arr[fim];
        int i = inicio - 1; 

        for (int j = inicio; j < fim; j++) {
            
            if (arr[j] <= pivo) {
                i++;
                trocar(arr, i, j);
            }
        }

        
        trocar(arr, i + 1, fim);

        return i + 1; 
    }

    
    private static void trocar(int[] arr, int i, int j) {
        int temporario = arr[i];
        arr[i] = arr[j];
        arr[j] = temporario;
    }
}
