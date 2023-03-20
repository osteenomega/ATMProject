import java.util.Scanner;

public class ATMReport {
    private final ATMService atm;

    public ATMReport(ATMService atm) {
        this.atm = atm;
    }

    public void optionMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1: view available balance");
            System.out.println("2: Withdraw amount");
            System.out.println("3: Deposit amount");
            System.out.println("4: view MiniStatement");
            System.out.println("5: exit \n");

            System.out.print("input choice: ");
            byte choice = scanner.nextByte();

            if (choice == 1) {
                System.out.print("Available balance is: ");
                System.out.println(atm.getBalance());
            }

            if (choice == 2) {
                System.out.print("Please input amount to withdraw: ");
                atm.setWithdrawAmount(scanner.nextDouble());
            }

            else if (choice == 3) {
                System.out.print("Please input amount to deposit: ");
                atm.setDeposit(scanner.nextDouble());
            }

            else if (choice == 4) {
                System.out.println("Amount withdrawn today is: " + atm.getWithdrawAmount());
                System.out.println("Amount Deposited today is: " + atm.getDeposit());
                System.out.println("Available balance is: " + atm.getBalance());
            }

            else if (choice == 5) {
                System.out.println("Thank you for using our ATM services");
                break;
            }

            else
                System.out.println("Invalid Choice.Try again");
        }
    }
}
