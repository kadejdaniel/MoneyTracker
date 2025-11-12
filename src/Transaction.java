import java.time.LocalDateTime;

public class Transaction {

    private double amount;
    private String currency;
    private TransactionCategory category;
    private TransactionType type;
    private LocalDateTime date;
    private TransactionCategoryExpense categoryExp;

    public Transaction(double amount, String currency, TransactionCategory category, TransactionType type) {
        this.amount = amount;
        this.currency = currency;
        this.category = category;
        this.type = type;
        this.date = LocalDateTime.now();
    }

    public Transaction(double amount, String currency, TransactionCategoryExpense categoryExp, TransactionType type) {
        this.categoryExp = categoryExp;
        this.type = type;
        this.currency = currency;
        this.amount = amount;
        this.date = LocalDateTime.now();
    }


    @Override
    public String toString() {
        return date + " | " + type + " | " + amount + " " + currency + " | " + category;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
