import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    String nome;
    Double altura;
    Double peso;
    LocalDate dataNascimento;

    Integer calculaIdade(LocalDate dataDeHoje){
        Period idade = Period.between(dataNascimento,dataDeHoje);
        return idade.getYears();
    }
}