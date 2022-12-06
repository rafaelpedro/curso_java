import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Animal cachorro, gato, galinha;
        cachorro = new Animal();
        cachorro.setNome("\nLuna Lovegood");
        cachorro.setRaca("Cocker");
        cachorro.setSom("Au Au\n");
        cachorro.dataNascimento = LocalDate.of(2017, 5, 6);

        gato = new Animal();
        gato.setNome("Gato de Botas");
        gato.setRaca("Vira-Lata");
        gato.setSom("Miau Miau\n");
        gato.dataNascimento = LocalDate.of(2020, 5, 6);

        galinha = new Animal();
        galinha.setNome("Gertrudes Honrosa");
        galinha.setRaca("Galinha da Angola");
        galinha.setSom("Cocóricó\n");
        galinha.dataNascimento = LocalDate.of(2021, 5, 6);

        /* Resultados */
        System.out.println(cachorro.mostraNome());
        cachorro.calculaIdade(LocalDate.now());
        System.out.println(cachorro.calculaIdade(LocalDate.now()));
        System.out.println(cachorro.mostraRaca());
        System.out.println(cachorro.emitirSom());

        System.out.println(gato.mostraNome());
        gato.calculaIdade(LocalDate.now());
        System.out.println(gato.calculaIdade(LocalDate.now()));
        System.out.println(gato.mostraRaca());
        System.out.println(gato.emitirSom());

        System.out.println(galinha.mostraNome());
        galinha.calculaIdade(LocalDate.now());
        System.out.println(galinha.calculaIdade(LocalDate.now()));
        System.out.println(galinha.mostraRaca());
        System.out.println(galinha.emitirSom());

    }

}


