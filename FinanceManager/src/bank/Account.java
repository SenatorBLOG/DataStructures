package bank;

public abstract class Account {
    private String accountNumber;
    private double balance;

    // Default constructor
    public Account() {
        this.accountNumber = "";
        this.balance = 0.0;
    }

    // Parameterized constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // toString method
    @Override
    public String toString() {
        return "Account{accountNumber='" + accountNumber + "', balance=" + balance + "}";
    }

    // Abstract method
    public abstract String getAccountType();
}
