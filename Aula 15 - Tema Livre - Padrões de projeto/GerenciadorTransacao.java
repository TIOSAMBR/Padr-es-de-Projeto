import java.util.ArrayList;
import java.util.List;

class GerenciadorTransacao {
    private static GerenciadorTransacao instancia;
    private List<ITransacao> transacoes;

    private GerenciadorTransacao() {
        transacoes = new ArrayList<>();
    }

    public static GerenciadorTransacao getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorTransacao();
        }
        return instancia;
    }

    public void adicionarTransacao(ITransacao tx) {
        transacoes.add(tx);
    }

    public void realizarTransacoes() {
        for (ITransacao tx : transacoes) {
            tx.realizarTransacao(0);  // Simula uma transação com valor zero para fins de teste
        }
    }
}