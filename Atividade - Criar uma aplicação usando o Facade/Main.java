import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PacoteViagemFacade pacoteViagem = new PacoteViagemFacade();

        // Criando clientes
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00");

        // Lista de clientes
        List<Cliente> clientes = Arrays.asList(cliente1, cliente2);

        // Reservando um pacote de viagem completo com diferentes formas de pagamento
        System.out.println("Reservando com pagamento via Pix:");
        pacoteViagem.reservarPacoteViagem(
            clientes,
            "Suíte Presidencial", 1, 'C',  // Reserva de hotel: Suíte Presidencial para 2 pessoas
            "Luxo", 5,                   // Reserva de carro: Carro Luxo por 5 dias
            "Pix", 1                     // Pagamento via Pix
        );
        System.out.println();

        System.out.println("Reservando com pagamento via Boleto:");
        pacoteViagem.reservarPacoteViagem(
            clientes,
            "Executivo", 4, 'B',        // Reserva de hotel: Quarto Executivo para 2 pessoas
            "Executivo", 3,             // Reserva de carro: Carro Executivo por 3 dias
            "Boleto", 1                 // Pagamento via Boleto
        );
        System.out.println();

        System.out.println("Reservando com pagamento via Débito:");
        pacoteViagem.reservarPacoteViagem(
            clientes,
            "Simples", 10, 'D',         // Reserva de hotel: Quarto Simples para 2 pessoas
            "Econômico", 7,             // Reserva de carro: Carro Econômico por 7 dias
            "Débito", 1                 // Pagamento via Débito
        );
        System.out.println();

        System.out.println("Reservando com pagamento via Crédito (em 6 parcelas):");
        pacoteViagem.reservarPacoteViagem(
            clientes,
            "Executivo", 6, 'E',        // Reserva de hotel: Quarto Executivo para 2 pessoas
            "Executivo", 10,            // Reserva de carro: Carro Executivo por 10 dias
            "Crédito", 6                // Pagamento via Crédito em 6 parcelas
        );
        System.out.println();

        System.out.println("Reservando com pagamento via Crédito (em 3 parcelas):");
        pacoteViagem.reservarPacoteViagem(
            clientes,
            "Simples", 15, 'A',         // Reserva de hotel: Quarto Simples para 2 pessoas
            "Luxo", 14,                // Reserva de carro: Carro Luxo por 14 dias
            "Crédito", 3                // Pagamento via Crédito em 3 parcelas
        );
    }
}
