package sptech.com.br.exercicios.ex02;

public class Livro extends Produto  {
    // attributes
    private String autor;
    private String isbn;

    // constructor
    public Livro(Integer codigo, String nome, Double precoCusto, String autor, String isbn) {
        super(codigo, nome, precoCusto);
        this.autor = autor;
        this.isbn = isbn;
    }

    public Double getValorVenda() {
        return null;
    }

    // getters and setters
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
