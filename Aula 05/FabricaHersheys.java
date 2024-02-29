class FabricaHersheys implements FabricaOvoDePascoa {
    private final String tamanho;

    public FabricaHersheys(String tamanho) {
        this.tamanho = tamanho;
    }

    public OvoDePascoa criarOvoDePascoa() {
        return new Hersheys(tamanho);
    }
}