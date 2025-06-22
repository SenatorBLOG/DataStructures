package bank;

public class Transaction<T extends Account> {
    private final T account;
    private final double amount;
    private final String transactionId;

    // Parameterized constructor
    public Transaction(T account, double amount, String transactionId) {
        this.account = account;
        this.amount = amount;
        this.transactionId = transactionId;
    }

    // Getters (no setters for immutability)
    public T getAccount() {
        return account;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    // toString method
    @Override
    public String toString() {
        return "Transaction{account=" + account + ", amount=" + amount + ", transactionId='" + transactionId + "'}";
    }
}
