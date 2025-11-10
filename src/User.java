import java.util.ArrayList;
import java.util.List;

public class User {
    private double balance;
    private String firstName;
    private String lastName;
    private List<Transaction> transactions = new ArrayList<>();

    public User(double balance, String firstName, String lastName, List<Transaction> transaction) {
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
        this.transactions = transaction;
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }


    public void addExpense(User usr, double amount, TransactionCategory category, String currency) {

    }
    public void addIncome(User usr, double amount, TransactionCategory category, String currency) {

    }

}
