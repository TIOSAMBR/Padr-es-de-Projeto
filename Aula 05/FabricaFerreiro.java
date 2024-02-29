class FabricaFerreiro implements FabricaOvoDePascoa {
    private final String tamanho;

    public FabricaFerreiro(String tamanho) {
        this.tamanho = tamanho;
    }

    public OvoDePascoa criarOvoDePascoa() {
        return new FerreiroRocher(tamanho);
    }
}
