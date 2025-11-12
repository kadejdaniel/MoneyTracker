import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {

    private double amount;
    private CurrencyCode currency;
    private TransactionCategory category;
    private TransactionType type;
    private LocalDateTime date;
    private TransactionCategoryExpense categoryExp;

    public Transaction(double amount, CurrencyCode currency, TransactionCategory category, TransactionType type) {
        this.amount = amount;
        this.currency = currency;
        this.category = category;
        this.type = type;
        this.date = LocalDateTime.now();
    }

    public Transaction(double amount, CurrencyCode currency, TransactionCategoryExpense categoryExp, TransactionType type) {
        this.categoryExp = categoryExp;
        this.type = type;
        this.currency = currency;
        this.amount = amount;
        this.date = LocalDateTime.now();
    }


    @Override
    public String toString() {
        String formattedDate = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return String.format("%s | %s | %.2f %s | %s",
                formattedDate, type, amount, currency,
                type == TransactionType.INCOME ? category : categoryExp);
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
