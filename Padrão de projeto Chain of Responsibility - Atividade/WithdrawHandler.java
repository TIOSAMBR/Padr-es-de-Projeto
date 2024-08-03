public class WithdrawHandler implements TransactionHandler {
    private TransactionHandler nextHandler;

    @Override
    public void setNextHandler(TransactionHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleTransaction(Transaction transaction) {
        if (transaction.getType() == Transaction.TransactionType.WITHDRAW) {
            if (transaction.getAmount() > 0) {
                boolean success = transaction.getSourceAccount().withdraw(transaction.getAmount());
                if (success) {
                    System.out.println("Saque de " + transaction.getAmount() + " realizado na conta " + transaction.getSourceAccount().getAccountNumber());
                } else {
                    System.out.println("Saldo insuficiente para saque.");
                }
            } else {
                System.out.println("Valor do saque deve ser positivo.");
            }
        } else if (nextHandler != null) {
            nextHandler.handleTransaction(transaction);
        }
    }
}
