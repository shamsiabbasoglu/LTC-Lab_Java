package lesson16.Main.BankAccount;

public class VirtualBank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Optimus Prime");
        BankAccount account2 = new BankAccount("Megatron");

        account1.depositAmount(700);
        account2.depositAmount(300);

        System.out.println("Initial account details: ");
        System.out.println("Account 1: " + account1.accountOwner() + " - Balance: ₼" + account1.getBalance());
        System.out.println("Account 2: " + account2.accountOwner() + " - Balance: ₼" + account2.getBalance());

        account1.transferFunds(account2, 200);

        //attempt to transfer insufficient funds
        account2.transferFunds(account1,1000);

        System.out.println("Final account details:");
        System.out.println("Account 1: " + account1.accountOwner() + " - Balance: ₼" + account1.getBalance());
        System.out.println("Account 2: " + account2.accountOwner() + " - Balance: ₼" + account2.getBalance());
    }
}
