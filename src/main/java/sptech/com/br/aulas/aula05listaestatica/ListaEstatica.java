package sptech.com.br.aulas.aula05listaestatica;

public class ListaEstatica {
    protected int[] vetor;
    protected int nroElem;

    public ListaEstatica(int length) {
        this.vetor = new int[length];
        this.nroElem = 0;
    }

    // adiciona elemente na proxima posição disponível
    public void append(int elem) {
        if (this.nroElem < this.vetor.length) {
            vetor[this.nroElem++] = elem;  
        } else {
            System.out.println("Lista está cheia!");
        }
    }

    // exibe todos os itens da lista
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

    // troca valor por valor passado
    // retorna false em caso de fracasso
    public boolean replace(int oldValue, int newValue) {
        int oldValueIndex = this.getByValue(oldValue);

        if (oldValueIndex != -1) {
            this.vetor[oldValueIndex] = newValue;
            return true;
        }

        return false;
    }

    protected boolean toRightFromIndex(int index) {
        if (this.validIndex(index)) {
            for (int i = this.nroElem; i > index; i--) {
                this.vetor[i] = this.vetor[i - 1];
            }
            this.nroElem++;
            return true;
        } 
        System.out.println("Lista cheia");
        return false;
    }

    protected void putValueInIndex(int value, int index) {
        if (toRightFromIndex(index)) {
            this.vetor[index] = value;
        }
    }

    public boolean addOnStart(int value) {
        if (this.nroElem < this.vetor.length - 1 && this.validIndex(0)) {
            this.toRightFromIndex(0);
            this.vetor[0] = value;
            return true;
        }
        return false;
    }

    // retorna quantidade de ocorrencias do valor passado
    public int count(int value) {
        int total = 0;

        for (int i = 0; i < this.nroElem; i++) {
            if (this.vetor[i] == value) {
                total++;
            }
        }

        return total;
    }

    // retorna true se index for válido
    protected boolean validIndex(int index) {
        if (index > this.nroElem || index < 0) {
            return false;
        }
        return true;
    }

}
