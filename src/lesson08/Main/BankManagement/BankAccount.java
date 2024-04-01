package lesson08.Main.BankManagement;

public class BankAccount {
    String account;
    double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit added. Updated balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("You have insufficient balance. Unable to withdraw " + amount);
        }
    }
}
