class Bank {
    void bankDetails() {
        System.out.println("Welcome to ABC Bank.");
    }
}

class Account extends Bank {
    void accountType() {
        System.out.println("This is a general bank account.");
    }
}

class LoanAccount extends Account {
    void loanDetails() {
        System.out.println("Loan account with 5% interest.");
    }
}

class SavingsAccount extends Account {
    void savingsDetails() {
        System.out.println("Savings account with 4% interest.");
    }
}

public class BankSystem {
    public static void main(String[] args) {
        LoanAccount la = new LoanAccount();
        SavingsAccount sa = new SavingsAccount();

        System.out.println("--- Loan Account Details ---");
        la.bankDetails();
        la.accountType();
        la.loanDetails();

        System.out.println("\n--- Savings Account Details ---");
        sa.bankDetails();
        sa.accountType();
        sa.savingsDetails();
    }
}
