public class TransferHandler implements TransactionHandler {
    private TransactionHandler nextHandler;

    @Override
    public void setNextHandler(TransactionHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleTransaction(Transaction transaction) {
        if (transaction.getType() == Transaction.TransactionType.TRANSFER) {
            if (transaction.getAmount() > 0) {
                boolean success = transaction.getSourceAccount().transfer(transaction.getTargetAccount(), transaction.getAmount());
                if (success) {
                    System.out.println("Transferência de " + transaction.getAmount() + " da conta " + transaction.getSourceAccount().getAccountNumber() + " para a conta " + transaction.getTargetAccount().getAccountNumber() + " realizada com sucesso.");
                } else {
                    System.out.println("Saldo insuficiente para transferência.");
                }
            } else {
                System.out.println("Valor da transferência deve ser positivo.");
            }
        } else if (nextHandler != null) {
            nextHandler.handleTransaction(transaction);
        }
    }
}
