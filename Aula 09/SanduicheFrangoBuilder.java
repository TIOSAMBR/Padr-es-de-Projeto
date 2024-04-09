class SanduicheFrangoBuilder implements Builder {
    private Sanduiche sanduiche;

    public SanduicheFrangoBuilder() {
        this.sanduiche = new Sanduiche();
    }

    @Override
    public void buildPao() {
        sanduiche.setPao("Pão de Forma");
    }

    @Override
    public void buildRecheio() {
        sanduiche.setRecheio("Frango");
    }

    @Override
    public void buildMolho() {
        sanduiche.setMolho("Maionese");
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
