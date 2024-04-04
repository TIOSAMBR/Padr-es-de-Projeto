import java.util.ArrayList;
import java.util.List;

class Sanduiche {
    private String pao;
    private List<String> recheios;
    private List<String> condimentos;

    public Sanduiche() {
        recheios = new ArrayList<>();
        condimentos = new ArrayList<>();
    }

    public void setPao(String pao) {
        this.pao = pao;
    }

    public void addRecheio(String recheio) {
        this.recheios.add(recheio);
    }

    public void addCondimento(String condimento) {
        this.condimentos.add(condimento);
    }

    @Override
    public String toString() {
        return "Sanduíche: [Pão: " + pao + ", Recheios: " + recheios + ", Condimentos: " + condimentos + "]";
    }
}