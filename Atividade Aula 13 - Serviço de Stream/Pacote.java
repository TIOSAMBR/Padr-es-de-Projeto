class Pacote {
    private String nome;
    private double preco;

    public Pacote(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + ": R$" + String.format("%.2f", preco);
    }
}