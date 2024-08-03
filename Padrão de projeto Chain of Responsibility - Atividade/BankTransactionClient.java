public class BankTransactionClient {
    public static void main(String[] args) {
        // Criar contas
        BankAccount account1 = new BankAccount("12345", 1000.00);
        BankAccount account2 = new BankAccount("67890", 500.00);

        // Criar manipuladores
        DepositHandler depositHandler = new DepositHandler();
        WithdrawHandler withdrawHandler = new WithdrawHandler();
        TransferHandler transferHandler = new TransferHandler();
        InvalidTransactionHandler invalidTransactionHandler = new InvalidTransactionHandler();

        // Configurar cadeia de responsabilidade
        depositHandler.setNextHandler(withdrawHandler);
        withdrawHandler.setNextHandler(transferHandler);
        transferHandler.setNextHandler(invalidTransactionHandler);

        // Criar transações
        Transaction deposit = new Transaction(Transaction.TransactionType.DEPOSIT, 200.00, account1, null);
        Transaction withdraw = new Transaction(Transaction.TransactionType.WITHDRAW, 150.00, account1, null);
        Transaction transfer = new Transaction(Transaction.TransactionType.TRANSFER, 300.00, account1, account2);
        Transaction invalid = new Transaction(Transaction.TransactionType.INVALID, 100.00, account1, null);

        // Processar transações
        depositHandler.handleTransaction(deposit);
        depositHandler.handleTransaction(withdraw);
        depositHandler.handleTransaction(transfer);
        depositHandler.handleTransaction(invalid);
    }
}
