package sptech.com.br.exercicios.ex02;

public class Livro extends Produto  {
    // attributes
    private String author;
    private String isbn;

    // constructor
    public Livro(Integer codigo, String nome, Double precoCusto, String author, String isbn) {
        super(codigo, nome, precoCusto);
        this.author = author;
        this.isbn = isbn;
    }

    public Double getValorVenda() {
        return getPrecoCusto() * 1.1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append("\n\tautor: " + author);
        sb.append("\n\tisbn: " + isbn);

        return String.valueOf(sb).replace("Produto", Livro.class.getSimpleName());
    }

    // getters and setters
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
