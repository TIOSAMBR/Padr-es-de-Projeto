class SanduicheVegetarianoBuilder implements SanduicheBuilder {
    private Sanduiche sanduiche;

    public SanduicheVegetarianoBuilder() {
        this.sanduiche = new Sanduiche();
    }

    public void buildPao() {
        sanduiche.setPao("Multigrãos");
    }

    public void buildRecheios() {
        sanduiche.addRecheio("Tomate");
        sanduiche.addRecheio("Alface");
    }

    public void buildCondimentos() {
        sanduiche.addCondimento("Maionese Vegana");
    }

    public Sanduiche getSanduiche() {
        return sanduiche;
    }
}