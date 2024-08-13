public class SistemaPagamento {
    private static final double DESCONTO_PIX = 0.10;
    private static final double DESCONTO_BOLETO = 0.05;
    private static final double JUROS_CREDITO_PARCELA = 0.0399;

    public double processarPagamento(double valorTotal, String formaPagamento, int parcelas) {
        double valorFinal = valorTotal;

        switch (formaPagamento) {
            case "Pix":
                valorFinal = valorTotal * (1 - DESCONTO_PIX);
                System.out.printf("Pagamento via Pix com 10%% de desconto. Valor final: R$ %.2f%n", valorFinal);
                break;

            case "Boleto":
                valorFinal = valorTotal * (1 - DESCONTO_BOLETO);
                System.out.printf("Pagamento via Boleto com 5%% de desconto. Valor final: R$ %.2f%n", valorFinal);
                break;

            case "Débito":
                System.out.printf("Pagamento via Débito. Valor final: R$ %.2f%n", valorFinal);
                break;

            case "Crédito":
                if (parcelas > 1) {
                    double juros = Math.pow(1 + JUROS_CREDITO_PARCELA, parcelas - 1);
                    valorFinal = valorTotal * juros;
                }
                System.out.printf("Pagamento via Crédito em %d parcelas. Valor final: R$ %.2f%n", parcelas, valorFinal);
                break;

            default:
                throw new IllegalArgumentException("Forma de pagamento inválida.");
        }

        return valorFinal;
    }
}
