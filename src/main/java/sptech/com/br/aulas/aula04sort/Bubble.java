package sptech.com.br.aulas.aula04sort;

public class Bubble {

    public static void main(String[] args) {
        int[] unsorted = {4, 7, 5, 2, 8, 1, 6, 3};
        // int[] unsorted2 = {4, 7, 5, 2, 8, 1, 6, 3};

        bubbleSort(unsorted);

        SelectionSort.displayArray(unsorted);
    }

    public static void bubbleSort(int[] unsorted) {
        int comparations = 0;
        int changes = 0;

        for(int i = 0; i < unsorted.length; i++) {
            for (int j = 1; j < unsorted.length; j++) {
                comparations++;
                if (unsorted[j - 1] > unsorted[j]) {
                    changes++;
                    int aux = unsorted[j - 1];
                    unsorted[j - 1] = unsorted[j];
                    unsorted[j] = aux;
                }
            }
        }

        System.out.println("comparações: " + comparations);
        System.out.println("trocas: " + changes);
    }
}
