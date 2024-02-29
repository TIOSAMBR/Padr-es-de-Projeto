class FerreiroRocher implements OvoDePascoa {
    private final String tamanho;

    public FerreiroRocher(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return "Ferreiro Rocher " + tamanho;
    }

    public String getDescricao() {
        return "Ovo de chocolate Ferreiro Rocher, " + tamanho;
    }

    public double getPeso() {
        switch (tamanho) {
            case "137g":
                return 137;
            case "255g":
                return 255;
            case "366g":
                return 366;
            default:
                throw new IllegalArgumentException("Tamanho inválido para o ovo Ferreiro Rocher: " + tamanho);
        }
    }

    public double getPreco() {
        switch (tamanho) {
            case "137g":
                return 14.99;
            case "255g":
                return 20.99;
            case "366g":
                return 26.99;
            default:
                throw new IllegalArgumentException("Tamanho inválido para o ovo Ferreiro Rocher: " + tamanho);
        }
    }

    public String getIngredientes() {
        return "Chocolate Ferreiro Rocher, avelãs, açúcar";
    }
}
