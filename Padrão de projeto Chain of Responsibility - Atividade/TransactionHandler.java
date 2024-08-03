public interface TransactionHandler {
    void setNextHandler(TransactionHandler nextHandler);
    void handleTransaction(Transaction transaction);
}
