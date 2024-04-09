import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de sanduíche:");
        System.out.println("1. Padrão (Frango)");
        System.out.println("2. Vegano");
        System.out.println("3. Personalizado");

        int escolha = scanner.nextInt();

        Diretor diretor;
        if (escolha == 1) {
            diretor = new Diretor(new SanduicheFrangoBuilder());
        } else if (escolha == 2) {
            diretor = new Diretor(new SanduicheVeganoBuilder());
        } else if (escolha == 3) {
            diretor = new Diretor(new SanduichePersonalizadoBuilder());
        } else {
            System.out.println("Opção inválida");
            return;
        }

        diretor.makeSanduiche();
        Sanduiche sanduiche = diretor.getBuilder().getSanduiche();
        System.out.println("Sanduíche:");
        System.out.println(sanduiche);
    }
}