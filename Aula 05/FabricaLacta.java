class FabricaLacta implements FabricaOvoDePascoa {
    private final String codigoProduto;

    public FabricaLacta(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public OvoDePascoa criarOvoDePascoa() {
        switch (codigoProduto) {
            case "1":
                return new ALeite();
            case "2":
                return new Oreo();
            case "3":
                return new SonhoDeValsa();
            case "4": // Adicionando o produto Ouro Branco
                return new OuroBranco();
            default:
                throw new IllegalArgumentException("Código de produto inválido para Lacta.");
        }
    }
}