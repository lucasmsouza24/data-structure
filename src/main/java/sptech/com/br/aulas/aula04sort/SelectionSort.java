package sptech.com.br.aulas.aula04sort;

public class SelectionSort {
    
    public static void main(String[] args) {
        int[] unsorted = {4, 7, 5, 2, 8, 1, 6, 3};

        sortSelection(unsorted);

        for(int i : unsorted) {
            System.out.println(i);
        }
    }

    public static void sortSelection(int[] unsorted) {

        int changes = 0;
        int comparations = 0;

        for (int i = 0; i < unsorted.length; i++) {
            for (int j = i + 1; j < unsorted.length; j++) {
                comparations++;
                if (unsorted[j] < unsorted[i]) {
                    changes++;
                    int aux = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = aux;
                }
            }
        }

        System.out.println("trocas: " + changes);
        System.out.println("comparações: " + comparations);

    }
}
