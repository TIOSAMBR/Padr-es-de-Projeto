class Hersheys implements OvoDePascoa {
    private final String tamanho;

    public Hersheys(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return "Hershey's " + tamanho;
    }

    public String getDescricao() {
        return "Ovo de chocolate Hershey's, " + tamanho;
    }

    public double getPeso() {
        switch (tamanho) {
            case "137g":
                return 137;
            case "225g":
                return 225;
            case "336g":
                return 336;
            default:
                throw new IllegalArgumentException("Tamanho inválido para o ovo Hershey's: " + tamanho);
        }
    }

    public double getPreco() {
        switch (tamanho) {
            case "137g":
                return 12.99;
            case "225g":
                return 18.99;
            case "336g":
                return 24.99;
            default:
                throw new IllegalArgumentException("Tamanho inválido para o ovo Hershey's.");
        }
    }

    public String getIngredientes() {
        return "Chocolate Hershey's, açúcar";
    }
}
