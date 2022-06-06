package sptech.com.br.exercicios.ex08stack.ex06;

public class Livro {
 
    // atributos
    private String nome;
    private String autor;

    // construtor
    public Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
    }

    // métodos
    @Override
    public String toString() {
        return "Livro [autor=" + autor + ", nome=" + nome + "]";
    }

    // getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
}
