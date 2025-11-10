import java.time.LocalDateTime;

public class Transaction {

    private double amount;
    private String currency;
    private TransactionCategory category;
    private TransactionType type;
    private LocalDateTime date;

    public Transaction(double amount, String currency, TransactionCategory category, TransactionType type) {
        this.amount = amount;
        this.currency = currency;
        this.category = category;
        this.type = type;
        this.date = LocalDateTime.now();
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
