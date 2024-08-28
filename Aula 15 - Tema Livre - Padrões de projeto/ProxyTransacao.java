class ProxyTransacao implements ITransacao {
    private TransacaoReal transacaoReal;
    private boolean autorizado;

    public ProxyTransacao(TransacaoReal transacaoReal) {
        this.transacaoReal = transacaoReal;
        this.autorizado = false;
    }

    private void verificarAutorizacao() {
        // Simula autorização (pode ser um login, token, etc.)
        this.autorizado = true;
    }

    @Override
    public void realizarTransacao(float valor) {
        verificarAutorizacao();
        if (autorizado) {
            transacaoReal.realizarTransacao(valor);
        } else {
            System.out.println("Transação negada. Usuário não autorizado.");
        }
    }
}