package sptech.com.br.aulas.aula05listaestatica;

public class ListaEstaticaOrdenada extends ListaEstatica {

    public ListaEstaticaOrdenada(int length) {
        super(length);
    }
    
    @Override
    public void append(int value) {
        for (int i = 0; i < this.nroElem; i++) {
            if (value > this.vetor[i]) { 
                this.toRightFromIndex(i);
                this.vetor[i] = value;
            }
        }
    }
}
