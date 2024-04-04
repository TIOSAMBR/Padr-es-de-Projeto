class SanduichePadraoBuilder implements SanduicheBuilder {
    private Sanduiche sanduiche;

    public SanduichePadraoBuilder() {
        this.sanduiche = new Sanduiche();
    }

    public void buildPao() {
        sanduiche.setPao("Integral");
    }

    public void buildRecheios() {
        sanduiche.addRecheio("Presunto");
        sanduiche.addRecheio("Queijo");
    }

    public void buildCondimentos() {
        sanduiche.addCondimento("Maionese");
        sanduiche.addCondimento("Alface");
    }

    public Sanduiche getSanduiche() {
        return sanduiche;
    }
}