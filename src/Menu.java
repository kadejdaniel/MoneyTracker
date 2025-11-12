
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private final User user;
    private final Scanner scan = new Scanner(System.in);

    public Menu(User user) {
        this.user = user;
    }

    public void start() {
        boolean isOn = true;

        while (isOn) {
            System.out.println("1. Dodaj przychod");
            System.out.println("2. Dodaj wydatek");
            System.out.println("3. Pokaz saldo");
            System.out.println("4. Pokaz wszystkie transakcje");
            System.out.println("0. Wyjdz");
            System.out.print("Wybierz: ");
            int choice = scan.nextInt();
            try {
                if (choice >= 1 && choice <= 4) {
                    switch (choice) {

                        case 1: {
                            addIncomeMenu();
                            break;
                        }
                        case 2: {
                            addExpenseMenu();
                            break;
                        }
                        case 3: {
                            showBalance();
                            break;
                        }
                        case 4:{
                            showTransactions();
                            break;
                        }
                        case 0:{
                            System.out.println();
                            System.out.println("Do zobaczenia :)");
                            return;
                        }
                    }
                }

            } catch (InputMismatchException e) {
                System.err.println("invalid key");
            }
        }

    }

    private void showBalance(){
        System.out.print("Twoj balans wynosi: ");
        System.out.println(user.getBalance());

    }

    private void showTransactions (){
        int i = 1;
        System.out.println("Transactions:");
        for (Transaction t : user.getTransactions()){
            System.out.println( i + ". " + t);
            i++;
        }
    }

    private CurrencyCode chooseCurrency(){
        System.out.println("Wybierz walute:");
        CurrencyCode[] code = CurrencyCode.values();
        for (int i = 0; i <code.length ; i++) {
            System.out.println((i+1)+ ". " + code[i]);
        }
        int choice = -1;
        while (choice < 0 || choice > code.length){
            System.out.println("Wybierz numer od 1 do " + code.length);
//            choice = Integer.parseInt(scan.nextLine());
            choice = scan.nextInt();
        }
        return code[choice-1];
    }



    private TransactionCategory chooseCategory() {
        System.out.println("Wybierz kategorie: ");
        TransactionCategory[] categories = TransactionCategory.values();
        for (int i = 0; i < categories.length; i++) {
            System.out.println((i+1) +". " + categories[i]) ;

        }
        int choice = -1;
        while (choice < 1 ||  choice > categories.length){
            System.out.println("Wybierz numer od 1 do " + categories.length);
//            choice = Integer.parseInt(scan.nextLine());
            choice = scan.nextInt();

        }
        return categories[choice-1];
    }


    private TransactionCategoryExpense chooseCategoryExp() {
        System.out.println("Wybierz kategorie: ");
        TransactionCategoryExpense[] categories = TransactionCategoryExpense.values();
        for (int i = 0; i < categories.length; i++) {
            System.out.println((i+1) +". " + categories[i]) ;

        }
        int choice = -1;
        while (choice < 1 || categories.length< choice){
            System.out.println("Wybierz numer od 1 do " + categories.length);
//            choice = Integer.parseInt(scan.nextLine());
            choice = scan.nextInt();

        }
        return categories[choice-1];
    }


    private void addIncomeMenu(){
        System.out.println("Podaj kwote jaka chcesz dodać: ");
        double value = scan.nextDouble();
        if (value<=0){
            System.out.println("Kwota nieprawidłowa");
            return;
        }
        scan.nextLine();

        CurrencyCode currency = chooseCurrency();

        TransactionCategory category = chooseCategory();


        user.addIncome(value,category,currency);
    }


    private void addExpenseMenu(){
        System.out.println("Podaj jaki wydatek chcesz dodać: ");
        double value = scan.nextDouble();
        if (value<=0 || user.getBalance()<value){
            System.out.println("Kwota nieprawidłowa lub za mala");
            return;
        }

        System.out.println("Podaj kategorie: ");
        TransactionCategoryExpense category = chooseCategoryExp();

        System.out.println("Podaj walute: ");
        CurrencyCode currency = chooseCurrency();
        user.addExpense(value,category,currency);
    }
}
