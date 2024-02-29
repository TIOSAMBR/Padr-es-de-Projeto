class FabricaNestle implements FabricaOvoDePascoa {
    private final String codigoProduto;

    public FabricaNestle(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public OvoDePascoa criarOvoDePascoa() {
        switch (codigoProduto) {
            case "1":
                return new Alpino();
            case "2":
                return new Classic();
            case "3":
                return new KitKat();
            case "4":
                return new Bis();
            default:
                throw new IllegalArgumentException("Código de produto inválido para Nestle.");
        }
    }
}