package bank;

public class BankManagerTest {
    public static void main(String[] args) {
        // Create accounts
        SavingsAccount account1 = new SavingsAccount("ACC001", 1000.0, 0.02);
        SavingsAccount account2 = new SavingsAccount("ACC002", 500.0, 0.01);
        SavingsAccount account3 = new SavingsAccount("ACC003", 2000.0, 0.03);

        // Create BankManager
        BankManager manager = new BankManager();

        // Add accounts
        manager.addAccount(account1);
        manager.addAccount(account2);
        manager.addAccount(account3);

        // Create transactions
        Transaction<SavingsAccount> tx1 = new Transaction<>(account1, 500.0, "TX001");
        Transaction<SavingsAccount> tx2 = new Transaction<>(account2, -200.0, "TX002");
        manager.addTransaction(tx1);
        manager.addTransaction(tx2);

        // Print initial state
        System.out.println("Initial BankManager: " + manager);

        // Process one transaction
        Transaction<SavingsAccount> processed = manager.processNextTransaction();
        System.out.println("Processed transaction: " + processed);

        // Print latest processed transaction
        System.out.println("Latest processed transaction: " + manager.getLatestProcessedTransaction());

        // Sort accounts by balance and print updated state
        manager.sortAccountsByBalance();
        System.out.println("BankManager after sorting accounts: " + manager);
    }
}
