import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(20000);

        Scanner scanner =new Scanner(System.in);
        while (true){
            System.out.println("Введите сумму");
            double terminal = scanner.nextDouble();

            try {
                account.withDraw(terminal);
                System.out.println(account.getAmount());
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                System.out.println(e.getRemainingAmount());
                break;
            }


        }
    }

}