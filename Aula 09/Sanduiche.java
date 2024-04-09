class Sanduiche {
    private String pao;
    private String recheio;
    private String molho;
    private boolean alface;
    private boolean tomate;

    public Sanduiche() {}

    public void setPao(String pao) {
        this.pao = pao;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public void setAlface(boolean alface) {
        this.alface = alface;
    }

    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }

    @Override
    public String toString() {
        return "Sanduíche: " + pao + ", " + recheio + ", " + molho + ", Alface: " + alface + ", Tomate: " + tomate;
    }
}