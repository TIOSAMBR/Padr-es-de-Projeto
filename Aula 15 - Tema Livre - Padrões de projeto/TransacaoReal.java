class TransacaoReal implements ITransacao {
    private float saldo;

    public TransacaoReal(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public void realizarTransacao(float valor) {
        saldo += valor;
        System.out.println("Transação realizada. Novo saldo: " + saldo);
    }
}