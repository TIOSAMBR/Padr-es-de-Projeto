import java.util.ArrayList;
import java.util.List;

class Assinatura {
    private Pacote base;
    private List<Pacote> pacotesAdicionais;
    private List<Pacote> pacotesDisponiveis;

    public Assinatura() {
        // Assinatura Base
        base = new Pacote("Assinatura Base - Assistir vídeos num único dispositivo", 9.99);
        pacotesAdicionais = new ArrayList<>();

        // Pacotes Opcionais
        pacotesDisponiveis = new ArrayList<>();
        pacotesDisponiveis.add(new Pacote("Pacote 1 - Assistir vídeos em vários dispositivos", 19.99));
        pacotesDisponiveis.add(new Pacote("Pacote 2 - Frete Grátis em produtos", 9.99));
        pacotesDisponiveis.add(new Pacote("Pacote 3 - Caixa surpresa com produtos relacionados a filmes e séries", 29.99));
        pacotesDisponiveis.add(new Pacote("Pacote 4 - Cartão de crédito Platinum", 49.99));
        pacotesDisponiveis.add(new Pacote("Pacote 5 - Compra com Cash Back", 19.99));
    }

    public void adicionarPacote(String nomePacote) {
        // Verifica se o pacote já foi adicionado
        for (Pacote pacote : pacotesAdicionais) {
            if (pacote.getNome().equals(nomePacote)) {
                System.out.println("Erro: " + nomePacote + " já foi adicionado.");
                return;
            }
        }

        // Adiciona o pacote caso esteja disponível e ainda não tenha sido adicionado
        for (Pacote pacote : pacotesDisponiveis) {
            if (pacote.getNome().equals(nomePacote)) {
                pacotesAdicionais.add(pacote);
                System.out.println(nomePacote + " adicionado com sucesso.");
                return;
            }
        }

        System.out.println("Erro: " + nomePacote + " não está disponível.");
    }

    public void removerPacote(String nomePacote) {
        for (Pacote pacote : pacotesAdicionais) {
            if (pacote.getNome().equals(nomePacote)) {
                pacotesAdicionais.remove(pacote);
                System.out.println(nomePacote + " removido com sucesso.");
                return;
            }
        }
        System.out.println(nomePacote + " não foi encontrado na assinatura.");
    }

    public double calcularTotal() {
        double total = base.getPreco();
        for (Pacote pacote : pacotesAdicionais) {
            total += pacote.getPreco();
        }
        return total;
    }

    public void mostrarAssinatura() {
        System.out.println(base);
        if (!pacotesAdicionais.isEmpty()) {
            System.out.println("\nPacotes Adicionais:");
            for (Pacote pacote : pacotesAdicionais) {
                System.out.println(pacote);
            }
        } else {
            System.out.println("\nNenhum pacote adicional foi adicionado.");
        }
        System.out.println("\nTotal da assinatura: R$" + String.format("%.2f", calcularTotal()));
    }
}