
import java.util.Scanner;
public class CashRegister {

    private static double balance = 1000.0;
    public static void viewMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Check balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Make a deposit");
        System.out.println("4. End program");
        System.out.print("Choose an option: ");
    }

    public static void checkBalance() {
        System.out.println("Your current balance is R$" + balance);
    }

    public static void withdraw(Scanner scanner) {
        System.out.print("Enter the amount to be withdrawn: R$");
        double withdrawalAmount = scanner.nextDouble();

        if (withdrawalAmount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal carried out successfully! New balance: R$" + balance);
        }
    }

    public static void makeDeposit(Scanner scanner) {
        System.out.print("Enter the amount to be deposited: R$");
        double depositAmount = scanner.nextDouble();

        if (depositAmount <= 0) {
            System.out.println("Invalid value!");
        } else {
            balance += depositAmount;
            System.out.println("Deposit made successfully! New balance: R$" + balance);
        }
    }
}

