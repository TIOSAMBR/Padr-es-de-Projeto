class Diretor {
    private Builder builder;

    public Diretor(Builder builder) {
        this.builder = builder;
    }

    public void makeSanduiche() {
        builder.buildPao();
        builder.buildRecheio();
        builder.buildMolho();
        builder.buildVegetais();
    }

    public Builder getBuilder() {
        return builder;
    }
}
