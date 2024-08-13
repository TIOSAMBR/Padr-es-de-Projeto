public class SistemaVendaPassagem {
    private static final double PRECO_ECONOMICA = 500.00;
    private static final double MULTIPLICADOR_EXECUTIVO = 2.5;
    private static final double MULTIPLICADOR_PRIMEIRA_CLASSE = 1.5;

    public double reservarAssento(int fileira, char assento) {
        double preco;
        if (fileira >= 1 && fileira <= 3) {
            preco = PRECO_ECONOMICA * MULTIPLICADOR_EXECUTIVO * MULTIPLICADOR_PRIMEIRA_CLASSE;
        } else if (fileira >= 4 && fileira <= 8) {
            preco = PRECO_ECONOMICA * MULTIPLICADOR_EXECUTIVO;
        } else {
            preco = PRECO_ECONOMICA;
        }
        
        String localizacao = "Desconhecida";
        if (assento == 'A' || assento == 'F') localizacao = "Janela";
        else if (assento == 'B' || assento == 'E') localizacao = "Meio";
        else if (assento == 'C' || assento == 'D') localizacao = "Corredor";

        System.out.printf("Assento %d%c na classe %s (Localização: %s) reservado.%n", fileira, assento, 
            fileira <= 3 ? "Primeira Classe" : fileira <= 8 ? "Executiva" : "Econômica", localizacao);
        System.out.printf("Preço da passagem: R$ %.2f%n", preco);
        return preco;
    }
}
