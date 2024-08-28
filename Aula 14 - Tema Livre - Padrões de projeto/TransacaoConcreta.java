class TransacaoConcreta extends DecoratorTransacao {
    private String descricao;

    public TransacaoConcreta(ITransacao transacao, String descricao) {
        super(transacao);
        this.descricao = descricao;
    }

    @Override
    public void realizarTransacao(float valor) {
        registrarTransacao(valor);
        System.out.println("Realizando transação com a descrição: " + descricao);
        super.realizarTransacao(valor);
    }
}