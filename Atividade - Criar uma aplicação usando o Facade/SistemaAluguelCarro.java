public class SistemaAluguelCarro {
    private static final double PRECO_DIARIA_ECONOMICA = 150.00;
    private static final double MULTIPLICADOR_EXECUTIVO = 2.0;
    private static final double MULTIPLICADOR_LUXO = 2.0;

    public double reservarCarro(String tipoCarro, int dias) {
        double precoDiaria;
        switch (tipoCarro) {
            case "Econômico":
                precoDiaria = PRECO_DIARIA_ECONOMICA;
                break;
            case "Executivo":
                precoDiaria = PRECO_DIARIA_ECONOMICA * MULTIPLICADOR_EXECUTIVO;
                break;
            case "Luxo":
                precoDiaria = PRECO_DIARIA_ECONOMICA * MULTIPLICADOR_EXECUTIVO * MULTIPLICADOR_LUXO;
                break;
            default:
                throw new IllegalArgumentException("Tipo de carro inválido.");
        }
        double precoTotal = precoDiaria * dias;
        System.out.printf("Carro %s reservado por %d dia(s).%n", tipoCarro, dias);
        System.out.printf("Preço total: R$ %.2f%n", precoTotal);
        return precoTotal;
    }
}
