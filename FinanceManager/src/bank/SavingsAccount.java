package bank;

public class SavingsAccount extends Account implements Comparable<SavingsAccount> {
    private double interestRate;

    // Default constructor
    public SavingsAccount() {
        super();
        this.interestRate = 0.0;
    }

    // Parameterized constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Getters and setters
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // toString method
    @Override
    public String toString() {
        return "SavingsAccount{" + super.toString() + ", interestRate=" + interestRate + "}";
    }

    // Override getAccountType
    @Override
    public String getAccountType() {
        return "Savings";
    }

    // Implement Comparable
    @Override
    public int compareTo(SavingsAccount other) {
        return Double.compare(this.getBalance(), other.getBalance());
    }
}