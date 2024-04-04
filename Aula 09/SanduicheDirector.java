class SanduicheDirector {
    private SanduicheBuilder builder;

    public SanduicheDirector(SanduicheBuilder builder) {
        this.builder = builder;
    }

    public void construirSanduiche() {
        builder.buildPao();
        builder.buildRecheios();
        builder.buildCondimentos();
    }

    public Sanduiche getSanduiche() {
        return builder.getSanduiche();
    }
}
