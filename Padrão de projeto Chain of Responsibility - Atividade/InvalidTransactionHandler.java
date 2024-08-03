public class InvalidTransactionHandler implements TransactionHandler {
    @Override
    public void setNextHandler(TransactionHandler nextHandler) {
        // Não há próximo manipulador depois do inválido
    }

    @Override
    public void handleTransaction(Transaction transaction) {
        System.out.println("Transação inválida: " + transaction.getType());
    }
}
