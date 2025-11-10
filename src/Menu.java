import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
private final User user;
private final Scanner scan = new Scanner(System.in);

    public Menu(User user) {
        this.user = user;
    }

    public void start(){
        boolean isOn = true;

        while(isOn){
            Scanner scan = new Scanner(System.in);
            System.out.println("1. Dodaj przychod");
            System.out.println("2. Dodaj wydatek");
            System.out.println("3. Pokaz saldo");
            System.out.println("4. Pokaz wszystkie transakcje");
            System.out.println("0. Wyjdz");
            System.out.print("Wybierz: ");
            int choice = scan.nextInt();
            try{
                if (choice > 1 && choice<4){
                    switch (choice){

                        case 1: {

                        }
                        case 2: {

                        }
                        case 3: {

                        }
                    }
                }

            }catch (InputMismatchException e){
                System.err.println("invalid key");
            }
        }

    }
    private void addIncome(){
        System.out.println("Podaj kwote jaka chcesz dodać: ");
        double value = scan.nextDouble();
        user.addIncome();
    }
}
