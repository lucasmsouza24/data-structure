package sptech.com.br.exercicios.test;

public class Colab extends Autenticavel {
    
    private String cargo;

    public Colab(String email, String senha, String cargo) {
        super(email, senha);
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nColab [cargo=" + cargo + "]";
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
