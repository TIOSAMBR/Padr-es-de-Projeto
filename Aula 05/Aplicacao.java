// Classe principal
public class Aplicacao {
    public static void main(String[] args) {
        // fábrica Nestlé
        FabricaOvoDePascoa fabricaNestle = new FabricaNestle("4"); // Alpino=1 // Classic=2 // Kit Kat=3 // Bis=4
        OvoDePascoa ovoNestle = fabricaNestle.criarOvoDePascoa();
        exibirInformacoesOvoDePascoa("Nestlé", ovoNestle);

        //  fábrica Garoto
        FabricaOvoDePascoa fabricaGaroto = new FabricaGaroto("1"); // Crocante // Talento=2 // Baton ao leite=3 // Caribe=4
        OvoDePascoa ovoGaroto = fabricaGaroto.criarOvoDePascoa();
        exibirInformacoesOvoDePascoa("Garoto", ovoGaroto);

        //  fábrica Lacta
        FabricaOvoDePascoa fabricaLacta = new FabricaLacta("3"); // A Leite //  Oreo=2 // Sonho de Valsa=3 // Ouro Branco=4
        OvoDePascoa ovoLacta = fabricaLacta.criarOvoDePascoa();
        exibirInformacoesOvoDePascoa("Lacta", ovoLacta);

        //  fábrica Hershey's
        FabricaOvoDePascoa fabricaHersheys = new FabricaHersheys("225g"); // Hershey's 137g // Hershey's 225g // Hershey's 336g
        OvoDePascoa ovoHersheys = fabricaHersheys.criarOvoDePascoa();
        exibirInformacoesOvoDePascoa("Hershey's", ovoHersheys);

        //  ferreiro Rocher
        FabricaOvoDePascoa fabricaFerreiro = new FabricaFerreiro("366g"); // Ferreiro Rocher 137g //  Ferreiro Rocher 255g // Ferreiro Rocher 366g
        OvoDePascoa ovoFerreiro = fabricaFerreiro.criarOvoDePascoa();
        exibirInformacoesOvoDePascoa("FerreiroRocher", ovoFerreiro);

    }
    private static void exibirInformacoesOvoDePascoa(String fabrica, OvoDePascoa ovo) {
        System.out.println("Fabricante: " + fabrica);
        System.out.println("Nome: " + ovo.getNome());
        System.out.println("Descrição: " + ovo.getDescricao());
        System.out.println("Peso: " + ovo.getPeso() + "g");
        System.out.println("Preço: R$" + ovo.getPreco());
        System.out.println("Ingredientes: " + ovo.getIngredientes());
        System.out.println();
    }
}

