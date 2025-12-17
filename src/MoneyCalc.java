import java.util.List;

public class MoneyCalc {
// urzadzenie ktore sluzy do liczenia srednich wydatkow
//	- srednia przychody w dniu, tygodniu, miesiacu, okresie
//	- srednia wydatek w dniu, tygodniu, miesiacu, okresie
//	- sredni dochod
//
//	- sprawdzenie na co idzie najwiecej srodkow
//    najczesciej korzystana kategoria

//    private void mostUsedCategory(){
//        if ()
//    }
//
//

    public MoneyCalc() {
    }

    public void currencyConverter(){

    }

    public void averageIncome(List<Transaction> transactions) {
        if (transactions == null || transactions.isEmpty()) {
            return;
        }
        double suma = 0;
        double srednia = 0;
        int count = 0;
        for (Transaction element : transactions) {
            if (element.getType() == TransactionType.INCOME)
            suma += element.getAmount();
            count++;
        }
        srednia = suma/count;

        System.out.println("Srednia INCOME to: " + srednia);
    }

    public void averageExpense(List<Transaction> transactions) {
        if (transactions.isEmpty() || transactions == null){
            return;
        }
        double suma =0;
        double srednia = 0;
        int counter= 0;
        for (Transaction t : transactions){
            if (t.getType() == TransactionType.EXPENSE){
                suma+= t.getAmount();
                counter++;
            }

        }
        srednia = suma/counter;
        System.out.println("Srednia EXPENSE to" + srednia);


    }


}
