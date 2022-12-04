import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Pessoa mayzaYuri, rafaPedro;

        mayzaYuri = new Pessoa();

        mayzaYuri.setNome("Mayza Yuri Hirose da Costa");
        mayzaYuri.altura = 1.63;
        mayzaYuri.peso = 74.0;
        mayzaYuri.dataNascimento = LocalDate.of(1995,10,6);

        mayzaYuri.calculaIdade(LocalDate.now());
        System.out.println(mayzaYuri.calculaIdade(LocalDate.now()));

        System.out.println(mayzaYuri.mostraNome());

        System.out.println(mayzaYuri.primeiroNome());
        System.out.println(mayzaYuri.ultimoNome());

        System.out.println(mayzaYuri.calculoImc());

        rafaPedro = new Pessoa();
        rafaPedro.setNome("Rafael Alencar Pedro");
        rafaPedro.altura = 1.93;
        rafaPedro.peso = 123.0;
        rafaPedro.dataNascimento = LocalDate.of(1995,10,24);

        rafaPedro.calculaIdade(LocalDate.now());
        System.out.println(rafaPedro.calculaIdade(LocalDate.now()));

        System.out.println(rafaPedro.mostraNome());

        System.out.println(rafaPedro.primeiroNome());
        System.out.println(rafaPedro.ultimoNome());

        System.out.println(rafaPedro.calculoImc());




    }


}
