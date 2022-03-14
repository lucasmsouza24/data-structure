package sptech.com.br.exercicios.test;

public abstract class Autenticavel {
    public String email;
    public String senha;

    public Autenticavel(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Autenticavel [email=" + email + ", senha=" + senha + "]";
    }

    
    
}
