import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;



public class Pessoa {
    String nome;
    String cpf;
    String rg;
    String email;
    LocalDate dataNascimento;

    Pessoa(String nome, String cpf, String email, String rg, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
    }
}