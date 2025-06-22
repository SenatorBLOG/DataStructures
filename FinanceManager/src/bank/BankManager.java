package bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BankManager {
    private List<SavingsAccount> accounts;
    private Queue<Transaction<SavingsAccount>> transactionQueue;
    private Stack<Transaction<SavingsAccount>> processedTransactions;

    // Default constructor
    public BankManager() {
        this.accounts = new ArrayList<>();
        this.transactionQueue = new LinkedList<>();
        this.processedTransactions = new Stack<>();
    }

    // Methods
    public void addAccount(SavingsAccount account) {
        accounts.add(account);
    }

    public void addTransaction(Transaction<SavingsAccount> transaction) {
        transactionQueue.offer(transaction);
    }

    public Transaction<SavingsAccount> processNextTransaction() {
        Transaction<SavingsAccount> transaction = transactionQueue.poll();
        if (transaction != null) {
            transaction.getAccount().setBalance(transaction.getAccount().getBalance() + transaction.getAmount());
            processedTransactions.push(transaction);
        }
        return transaction;
    }

    public Transaction<SavingsAccount> getLatestProcessedTransaction() {
        return processedTransactions.isEmpty() ? null : processedTransactions.peek();
    }

    public void sortAccountsByBalance() {
        Collections.sort(accounts);
    }

    // toString method
    @Override
    public String toString() {
        return "BankManager{accounts=" + accounts + ", pendingTransactions=" + transactionQueue + ", processedTransactions=" + processedTransactions + "}";
    }
}