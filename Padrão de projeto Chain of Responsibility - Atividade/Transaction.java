public class Transaction {
    public enum TransactionType {
        DEPOSIT, WITHDRAW, TRANSFER, INVALID
    }

    private TransactionType type;
    private double amount;
    private BankAccount sourceAccount;
    private BankAccount targetAccount;

    public Transaction(TransactionType type, double amount, BankAccount sourceAccount, BankAccount targetAccount) {
        this.type = type;
        this.amount = amount;
        this.sourceAccount = sourceAccount;
        this.targetAccount = targetAccount;
    }

    public TransactionType getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public BankAccount getSourceAccount() {
        return sourceAccount;
    }

    public BankAccount getTargetAccount() {
        return targetAccount;
    }
}
