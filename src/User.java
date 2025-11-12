import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class User {
    private double balance;
    private String firstName;
    private String lastName;
    private List<Transaction> transactions = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    public User(double balance, String firstName, String lastName, List<Transaction> transaction) {
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
        this.transactions = transaction;
    }

    public User() {
    }



    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addIncome(double amount, TransactionCategory category, String currency) {
        try {
            if (amount < 0) {
                System.out.println("Podales niepoprawna ilość pieniędzy do wpłaty!");
            }
            balance += amount;
            Transaction income = new Transaction(amount, currency, category, TransactionType.INCOME);
            transactions.add(income);
        } catch (InputMismatchException e) {
            System.err.println(false);
        }
    }


    public void addExpense(double amount, TransactionCategoryExpense category, String currency) {
        try {
            if (amount < 0) {
                System.out.println("Podales niepoprawna ilość pieniędzy do dodania expense");
                return;
            }
            if (amount > balance) {
                System.out.println("Masz za mało środków na koncie!");
                return;
            }

            balance -= amount;
            Transaction expense = new Transaction(amount, currency, category, TransactionType.EXPENSE);
            transactions.add(expense);


        } catch (InputMismatchException e) {
            System.err.println(false);
        }
    }

}
