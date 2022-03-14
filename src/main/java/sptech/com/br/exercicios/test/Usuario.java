package sptech.com.br.exercicios.test;

public class Usuario extends Autenticavel{

    public Usuario(String email, String senha) {
        super(email, senha);
    }

    @Override
    public String toString() {
        return super.toString() + "\nUsuario []";
    }
}
