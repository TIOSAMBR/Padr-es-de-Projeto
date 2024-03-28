abstract class ViolaoPrototype implements Cloneable {
    protected String tipo;
    protected String cordas;
    protected boolean acustico;
    protected boolean eletrico;
    protected String descricao;

    public String getTipo() {
        return tipo;
    }

    public String getCordas() {
        return cordas;
    }

    public boolean isAcustico() {
        return acustico;
    }

    public boolean isEletrico() {
        return eletrico;
    }

    public String getDescricao() {
        return descricao;
    }

    // Método para clonar o protótipo
    public ViolaoPrototype clone() throws CloneNotSupportedException {
        return (ViolaoPrototype) super.clone();
    }
}