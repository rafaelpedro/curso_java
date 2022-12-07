import java.time.LocalDate;
import java.time.Period;

public class Animal {

    private String nome;
    private String raca;

    private String som;

    /*Não consegui deixar privado*/
    private LocalDate dataNascimento;

    void setNome(String nome){
        this.nome = nome;
    }

    void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    void setRaca(String raca){
        this.raca = raca;
    }

    Integer calculaIdade(LocalDate dataDeHoje) {
        Period idade = Period.between(dataNascimento, dataDeHoje);
        return idade.getYears();
    }

    String mostraNome(){
        return nome;
    }

    String mostraRaca(){
        return raca;
    }

    String emitirSom(){
        return som;
    }

    void setSom(String som){
        this.som = som;
    }
}

