abstract class DecoratorTransacao implements ITransacao {
    protected ITransacao transacao;

    public DecoratorTransacao(ITransacao transacao) {
        this.transacao = transacao;
    }

    @Override
    public void realizarTransacao(float valor) {
        transacao.realizarTransacao(valor);
    }

    protected void registrarTransacao(float valor) {
        System.out.println("Registrando transação no valor de: " + valor);
    }
}