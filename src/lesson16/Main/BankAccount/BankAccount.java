package lesson16.Main.BankAccount;

public class BankAccount {
    private final String accountNumber;
    private final String accountHolder;
    private double balance;


    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.accountNumber = generateAccountNumber();
        this.balance = 0.0;
    }

    public String generateAccountNumber() {
        return "AZ" + (int) (Math.random() * 1000000 + 1);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String accountOwner() {
        return getAccountHolder() + "(" + getAccountNumber() + ")";
    }

    public double getBalance() {
        return balance;
    }

    public void depositAmount(double amount) {
        balance += amount;
    }

    public void withdrawAmount(double amount) throws InsufficientFundsException {
        if (balance < amount) {
            throw new InsufficientFundsException("Insufficient funds to withdraw ₼" + amount);
        }
        balance -= amount;
    }

    public void transferFunds(BankAccount destination, double amount) {
        try {
            withdrawAmount(amount);
            destination.depositAmount(amount);
            System.out.println("₼" + amount + " transferred from account " + accountOwner() + " to account " + destination.accountOwner());
        } catch (InsufficientFundsException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        }
    }
}
