import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Pessoa mayzaYuri;

        mayzaYuri = new Pessoa();

        mayzaYuri.nome = "Mayza Yuri Hirose da Costa Alencar Pedro";
        mayzaYuri.altura = 1.63;
        mayzaYuri.peso = 74.0;
        mayzaYuri.dataNascimento = LocalDate.of(1995,10,6);

        mayzaYuri.calculaIdade(LocalDate.now());
        System.out.println(mayzaYuri.calculaIdade(LocalDate.now()));

    }
}
