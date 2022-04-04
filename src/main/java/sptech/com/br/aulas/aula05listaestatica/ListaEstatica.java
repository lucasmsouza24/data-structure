package sptech.com.br.aulas.aula05listaestatica;

public class ListaEstatica {
    private int[] vetor;
    private int nroElem;

    public ListaEstatica(int length) {
        this.vetor = new int[length];
        this.nroElem = 0;
    }

    public void append(int elem) {
        if (this.nroElem < this.vetor.length) {
            vetor[this.nroElem++] = elem;  
        } else {
            System.out.println("Lista está cheia!");
        }
    }

    public void displayValues() {
        for (int i = 0; i < this.nroElem; i++) {
            System.out.print(this.vetor[i] + ", ");
        }
        System.out.println();
    };

    public int length() {
        return this.nroElem;
    }

    // remove elemento de acordo com o indice passado
    // retorna false, se index for inválido
    public boolean removeByIndex(int index) {
        if (this.validIndex(index)) {
            while(index < this.nroElem - 1) {
                this.vetor[index] = this.vetor[index++ + 1];
            }
            
            this.nroElem--;
            return true;
        } else {
            return false;
        }
    }

    public boolean removeByValue(int value) {
        return this.removeByIndex(this.getByValue(value));
    }

    // retorna indince do elemento "value"
    public int getByValue(int value) {
        for (int i = 0; i < this.nroElem; i++) {
            if (this.vetor[i] == value) {
                return i;
            }
        }
        return -1;
    }

    private boolean validIndex(int index) {
        if (index >= this.nroElem || index < 0) {
            return false;
        }
        return true;
    }

}
