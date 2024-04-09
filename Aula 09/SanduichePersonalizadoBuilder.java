import java.util.Scanner;

class SanduichePersonalizadoBuilder implements Builder {
    private Sanduiche sanduiche;

    public SanduichePersonalizadoBuilder() {
        this.sanduiche = new Sanduiche();
    }

    @Override
    public void buildPao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o tipo de pão:");
        String pao = scanner.nextLine();
        sanduiche.setPao(pao);
    }

    @Override
    public void buildRecheio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o tipo de recheio:");
        String recheio = scanner.nextLine();
        sanduiche.setRecheio(recheio);
    }

    @Override
    public void buildMolho() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o tipo de molho:");
        String molho = scanner.nextLine();
        sanduiche.setMolho(molho);
    }

    @Override
    public void buildVegetais() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adicionar alface? (sim/não)");
        String respostaAlface = scanner.nextLine();
        if (respostaAlface.equalsIgnoreCase("sim")) {
            sanduiche.setAlface(true);
        }
        System.out.println("Adicionar tomate? (sim/não)");
        String respostaTomate = scanner.nextLine();
        if (respostaTomate.equalsIgnoreCase("sim")) {
            sanduiche.setTomate(true);
        }
    }

    @Override
    public Sanduiche getSanduiche() {
        return sanduiche;
    }
}