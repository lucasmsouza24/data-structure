package sptech.com.br.aulas.aula07.csv;

public class Cachorro {
    private int id;
    private String nome;
    private String porte;
    private double peso;

    public Cachorro(int id, String nome, String porte, double peso) {
        this.id = id;
        this.nome = nome;
        this.porte = porte;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPorte() {
        return porte;
    }
    public void setPorte(String porte) {
        this.porte = porte;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("%4d %-15s %-9s %5.2f", this.getId(), this.getNome(), this.getPorte(), this.getPeso());
    }
}
