class FabricaGaroto implements FabricaOvoDePascoa {
    private final String codigoProduto;

    public FabricaGaroto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public OvoDePascoa criarOvoDePascoa() {
        switch (codigoProduto) {
            case "1":
                return new Crocante();
            case "2":
                return new Talento();
            case "3":
                return new BatonAoLeite();
            case "4": // Adicionando o produto Caribe
                return new Caribe();
            default:
                throw new IllegalArgumentException("Código de produto inválido para Garoto.");
        }
    }
}