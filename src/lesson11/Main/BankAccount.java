package lesson11.Main;

public class BankAccount {
    static int totalAccounts;
    String accountHolder;
    String accountNumber;

    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.accountNumber = generateAccountNumber();
        totalAccounts++;
    }

    public String generateAccountNumber() {
        return "AZ" + (int) (Math.random() * 1000000);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Dalton");
        BankAccount account2 = new BankAccount("Jack Martin");

        System.out.println("Account 1: Holder - " + account1.accountHolder +
                ", Account Number - " + account1.accountNumber);
        System.out.println("Account 2: Holder - " + account2.accountHolder +
                ", Account Number - " + account2.accountNumber);

        System.out.println("Total accounts created: " + BankAccount.totalAccounts);
    }
}
