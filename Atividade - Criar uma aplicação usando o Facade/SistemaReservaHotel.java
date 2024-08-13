public class SistemaReservaHotel {
    private static final double PRECO_SIMPLICE = 200.00;
    private static final double MULTIPLICADOR_EXECUTIVO = 1.5;
    private static final double MULTIPLICADOR_SUITE_PRESIDENCIAL = 3.0;

    public double reservarQuarto(String tipoQuarto, int numeroPessoas) {
        double precoPorPessoa;
        switch (tipoQuarto) {
            case "Simples":
                precoPorPessoa = PRECO_SIMPLICE;
                break;
            case "Executivo":
                precoPorPessoa = PRECO_SIMPLICE * MULTIPLICADOR_EXECUTIVO;
                break;
            case "Suíte Presidencial":
                precoPorPessoa = PRECO_SIMPLICE * MULTIPLICADOR_SUITE_PRESIDENCIAL;
                break;
            default:
                throw new IllegalArgumentException("Tipo de quarto inválido.");
        }
        double precoTotal = precoPorPessoa * numeroPessoas;
        System.out.printf("Quarto %s reservado para %d pessoa(s).%n", tipoQuarto, numeroPessoas);
        System.out.printf("Preço total: R$ %.2f%n", precoTotal);
        return precoTotal;
    }
}
