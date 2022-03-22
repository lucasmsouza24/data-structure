package sptech.com.br.aulas.aula04sort;

public class SelectionSort {
    
    public static void main(String[] args) {
        int[] unsorted = {4, 7, 5, 2, 8, 1, 6, 3};
        int[] unsorted2 = {4, 7, 5, 2, 8, 1, 6, 3};

        // sortSelection(unsorted);
        sortSelectionOpt(unsorted2);

        // displayArray(unsorted);
        // displayArray(unsorted2);
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

    public static void sortSelectionOpt(int[] unsorted) {

        int comparations = 0;
        int changes = 0;

        for (int i = 0; i < unsorted.length; i++) {
            int menorIndex = i;
            displayArray(unsorted);
            for (int j = i + 1; j < unsorted.length; j++) {
                comparations++;
                if(unsorted[j] < unsorted[menorIndex]) {
                    menorIndex = j;
                }
            }
            changes++;
            int aux = unsorted[i];
            unsorted[i] = unsorted[menorIndex];
            unsorted[menorIndex] = aux;
        }

        // System.out.println("trocas: " + changes);
        // System.out.println("comparações: " + comparations);
    }

    public static void displayArray(int[] array) {
        String str = "";

        for (int i : array) {
            str += i + ", ";
        }

        System.out.println(str);
    }
}
