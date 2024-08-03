public class DepositHandler implements TransactionHandler {
    private TransactionHandler nextHandler;

    @Override
    public void setNextHandler(TransactionHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleTransaction(Transaction transaction) {
        if (transaction.getType() == Transaction.TransactionType.DEPOSIT) {
            if (transaction.getAmount() > 0) {
                transaction.getSourceAccount().deposit(transaction.getAmount());
                System.out.println("Depósito de " + transaction.getAmount() + " realizado na conta " + transaction.getSourceAccount().getAccountNumber());
            } else {
                System.out.println("Valor do depósito deve ser positivo.");
            }
        } else if (nextHandler != null) {
            nextHandler.handleTransaction(transaction);
        }
    }
}
