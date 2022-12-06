import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    Double altura;
    Double peso;
    LocalDate dataNascimento;

    Integer calculaIdade(LocalDate dataDeHoje){
        Period idade = Period.between(dataNascimento,dataDeHoje);
        return idade.getYears();
    }

    String mostraNome(){
        return nome;
    }

    void setNome(String nome){
        this.nome = nome;+
    }

    String primeiroNome(){
        return nome.split(" ")[0];
    }

    String ultimoNome(){
        String[] vetor;
        vetor = nome.split(" ");
        return vetor[vetor.length - 1];
    }

    Double calculoImc(){
        Double imc;
        imc = peso /(altura*altura);
        return imc;
    }
}