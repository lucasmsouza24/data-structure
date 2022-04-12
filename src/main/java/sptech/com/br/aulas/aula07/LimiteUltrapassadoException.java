package sptech.com.br.aulas.aula07;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LimiteUltrapassadoException extends Exception {
    
    String data;

    public LimiteUltrapassadoException(String s) {
        super(s);
        data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }
}
