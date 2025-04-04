abstract class BankAccount {
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    void accountDetails() {
        System.out.println("Bank accounts store money securely.");
    }
}
class SavingsAccount extends BankAccount {
    private double balance = 0;
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
public class Bank{
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();
        account.accountDetails();
        account.deposit(500);
        account.withdraw(200);
    }
}
