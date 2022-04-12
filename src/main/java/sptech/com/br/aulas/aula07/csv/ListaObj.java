package sptech.com.br.aulas.aula07.csv;

public class ListaObj <T> {
    protected T[] vetor;
    protected int nroElem;

    public ListaObj(int length) {
        this.vetor = (T[]) new Object[length];
        this.nroElem = 0;
    }

    // adiciona elemente na proxima posição disponível
    public void append(T elem) {
        if (this.nroElem < this.vetor.length) {
            vetor[this.nroElem++] = elem;  
        } else {
            System.out.println("Lista está cheia!");
        }
    }

    // exibe todos os itens da lista
    public void displayValues() {
        for (int i = 0; i < this.nroElem; i++) {
            System.out.println(this.vetor[i]);
        }
        System.out.println();
    };

    public void showEach() {
        for (int i = 0; i < this.nroElem; i++) {
            System.out.println(this.vetor[i]);
        }
    }

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

    public boolean removeByValue(T value) {
        return this.removeByIndex(this.getByValue(value));
    }

    // retorna indince do elemento "value"
    public int getByValue(T value) {
        for (int i = 0; i < this.nroElem; i++) {
            if (this.vetor[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public T getByIndex(int index) {
        if (this.validIndex(index)) {
            return this.vetor[index];
        }
        return null;
    }

    // troca valor por valor passado
    // retorna false em caso de fracasso
    public boolean replace(T oldValue, T newValue) {
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

    protected void putValueInIndex(T value, int index) {
        if (toRightFromIndex(index)) {
            this.vetor[index] = value;
        }
    }

    public boolean addOnStart(T value) {
        if (this.nroElem < this.vetor.length - 1 && this.validIndex(0)) {
            this.toRightFromIndex(0);
            this.vetor[0] = value;
            return true;
        }
        return false;
    }

    // retorna quantidade de ocorrencias do valor passado
    public int count(T value) {
        int total = 0;

        for (int i = 0; i < this.nroElem; i++) {
            if (this.vetor[i] == value) {
                total++;
            }
        }

        return total;
    }

    public void clean() {
        this.nroElem = 0;
    }

    public void clear() {
        this.clean();
    }

    // retorna true se index for válido
    protected boolean validIndex(int index) {
        if (index > this.nroElem || index < 0) {
            return false;
        }
        return true;
    }

}

