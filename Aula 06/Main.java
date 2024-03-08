public class Main {
    public static void main(String[] args) {
        FabricaEsportiva fabricaEsportiva = null;
        while (fabricaEsportiva == null) {
            String escolha = System.console().readLine("Escolha uma fábrica de produtos esportivos (Nike, Adidas, Puma, Umbro, Kappa): ").toLowerCase();
            switch (escolha) {
                case "nike":
                    fabricaEsportiva = new FabricaNike();
                    break;
                case "adidas":
                    fabricaEsportiva = new FabricaAdidas();
                    break;
                case "puma":
                    fabricaEsportiva = new FabricaPuma();
                    break;
                case "umbro":
                    fabricaEsportiva = new FabricaUmbro();
                    break;
                case "kappa":
                    fabricaEsportiva = new FabricaKappa();
                    break;
                default:
                    System.out.println("Escolha inválida. Por favor, tente novamente.");
            }
        }

        CamisaEsportiva camisa = fabricaEsportiva.criarCamisa();
        camisa.exibirDetalhes();
    }
}