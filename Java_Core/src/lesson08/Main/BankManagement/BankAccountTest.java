package lesson08.Main.BankManagement;

import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();

        System.out.println("Type an account name:");
        bankAccount.account = scanner.nextLine();

        int choice;

        //Bank menu initialization
        do {
            System.out.println("Welcome to account: " + bankAccount.account);
            System.out.println("Your balance: " + bankAccount.balance);
            System.out.println("1. Deposit funds");
            System.out.println("2. Withdraw funds");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            //Menu interaction
            switch (choice) {
                case 1:
                    System.out.println("Please enter deposit amount:");
                    double deposit = scanner.nextDouble();
                    bankAccount.deposit(deposit);
                    break;
                case 2:
                    System.out.println("Please enter withdraw amount:");
                    double withdraw = scanner.nextDouble();
                    bankAccount.withdraw(withdraw);
                    break;
                case 3:
                    System.out.println("Exiting Bank Management App. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option");
            }
        } while (choice != 3);
    }
}
