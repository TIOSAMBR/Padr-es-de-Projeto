import java.util.List;

public class PacoteViagemFacade {
    private SistemaVendaPassagem sistemaVendaPassagem;
    private SistemaReservaHotel sistemaReservaHotel;
    private SistemaAluguelCarro sistemaAluguelCarro;
    private SistemaPagamento sistemaPagamento;

    public PacoteViagemFacade() {
        this.sistemaVendaPassagem = new SistemaVendaPassagem();
        this.sistemaReservaHotel = new SistemaReservaHotel();
        this.sistemaAluguelCarro = new SistemaAluguelCarro();
        this.sistemaPagamento = new SistemaPagamento();
    }

    public void reservarPacoteViagem(
            List<Cliente> clientes, String tipoQuarto, int fileira, char assento, String tipoCarro, int dias,
            String formaPagamento, int parcelas) {

        System.out.println("Iniciando reserva do pacote de viagem...");

        // Exibir dados dos clientes
        System.out.println("Dados dos Clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        // Reservar passagem aérea
        double precoPassagem = sistemaVendaPassagem.reservarAssento(fileira, assento);

        // Reservar hotel
        double precoHotel = sistemaReservaHotel.reservarQuarto(tipoQuarto, clientes.size());

        // Reservar carro
        double precoCarro = sistemaAluguelCarro.reservarCarro(tipoCarro, dias);

        // Calcular preço total antes do pagamento
        double precoTotal = precoPassagem + precoHotel + precoCarro;
        System.out.printf("Preço total do pacote antes do pagamento: R$ %.2f%n", precoTotal);

        // Processar pagamento
        double precoFinal = sistemaPagamento.processarPagamento(precoTotal, formaPagamento, parcelas);
        System.out.printf("Preço final do pacote após pagamento: R$ %.2f%n", precoFinal);

        // Exibir detalhes da compra
        System.out.println("\nDetalhes da Compra:");
        System.out.printf("Assento escolhido: %d%c%n", fileira, assento);
        System.out.printf("Quarto de hotel: %s%n", tipoQuarto);
        System.out.printf("Carro alugado: %s por %d dia(s)%n", tipoCarro, dias);
        System.out.printf("Forma de pagamento: %s em %d parcela(s)%n", formaPagamento, parcelas);
        System.out.printf("Valor final do pacote: R$ %.2f%n", precoFinal);
    }
}
