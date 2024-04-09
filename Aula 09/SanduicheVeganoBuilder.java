class SanduicheVeganoBuilder implements Builder {
    private Sanduiche sanduiche;

    public SanduicheVeganoBuilder() {
        this.sanduiche = new Sanduiche();
    }

    @Override
    public void buildPao() {
        sanduiche.setPao("Pão Integral Vegano");
    }

    @Override
    public void buildRecheio() {
        sanduiche.setRecheio("Falafel Vegano");
    }

    @Override
    public void buildMolho() {
        sanduiche.setMolho("Molho de Tahine");
    }

    @Override
    public void buildVegetais() {
        sanduiche.setAlface(true);
        sanduiche.setTomate(true);
    }

    @Override
    public Sanduiche getSanduiche() {
        return sanduiche;
    }
}