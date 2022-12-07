import java.time.LocalDate;

public class Main_Animal {
    public static void main(String[] args) {

        Animal cachorro, gato, galinha;
        cachorro = new Animal();
        cachorro.setNome("Luna Lovegood");
        cachorro.setRaca("Cocker");
        cachorro.setSom("Au Au");
        cachorro.setDataNascimento(LocalDate.of(2017, 5, 6));

        gato = new Animal();
        gato.setNome("Gato de Botas");
        gato.setRaca("Vira-Lata");
        gato.setSom("Miau Miau");
        gato.setDataNascimento(LocalDate.of(2020, 5, 6));

        galinha = new Animal();
        galinha.setNome("Gertrudes Honrosa");
        galinha.setRaca("Galinha da Angola");
        galinha.setSom("Cocóricó");
        galinha.setDataNascimento(LocalDate.of(2021, 5, 6));

        /* Resultados */
        System.out.println("\nNome: " + cachorro.mostraNome());
        System.out.println("Idade: " + cachorro.calculaIdade(LocalDate.now()));
        System.out.println("Raça: " + cachorro.mostraRaca());
        System.out.println("Som " + cachorro.emitirSom() + "\n");

        System.out.println("Nome: " + gato.mostraNome());
        System.out.println("Idade: " + gato.calculaIdade(LocalDate.now()));
        System.out.println("Raça: " + gato.mostraRaca());
        System.out.println("Som: " + gato.emitirSom() + "\n");

        System.out.println("Nome: " + galinha.mostraNome());
        System.out.println("Idade: " + galinha.calculaIdade(LocalDate.now()));
        System.out.println("Raça: " + galinha.mostraRaca());
        System.out.println("Som: " + galinha.emitirSom() + "\n");

    }

}


