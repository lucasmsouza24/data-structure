package sptech.com.br.aulas.aula05listaestatica;

public class ListaEstaticaOrdenada extends ListaEstatica {

    public ListaEstaticaOrdenada(int length) {
        super(length);
    }
    
    @Override
    public void append(int value) {

        // se o vetor não tiver elementos
        // ou se todos os elementos sejam menores que à adicionar
        // value é inserido na próxima posição disponível
        if (this.nroElem == 0 || countMenores(value) == this.nroElem) {
            super.append(value); 
        } else {  
            for (int i = 0; i < this.nroElem; i++) {
                // se valor for menor que algum elemento da lista
                // toda a lista a partir desse elemento é deslocado para a direita
                // e o valor é inserido no antigo lugar do elemento
                if (value <= this.vetor[i]) { 
                    this.putValueInIndex(value, i);
                    break;
                }
            }
        }
    }

    // retorna quantidade de valores menores que value
    public int countMenores(int value) {
        int menores = 0;

        for(int i = 0; i < this.nroElem; i++) {
            if (value > this.vetor[i]) {
                menores++;
            }
        }

        return menores;
    }
}
