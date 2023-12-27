package PracticalThings;

public class BankingSystemExample {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Creating savings account and current account
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(500, 100);

        // Adding accounts to the bank
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        // Performing operations on accounts
        savingsAccount.deposit(200);
        currentAccount.withdraw(300);

        // Displaying account information
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Current Account Balance: " + currentAccount.getBalance());

        // Applying unique methods
        savingsAccount.applyBonus();
        currentAccount.applyOverdraftFee();

        // Displaying updated account information
        System.out.println("Savings Account Balance after Bonus: " + savingsAccount.getBalance());
        System.out.println("Current Account Balance after Overdraft Fee: " + currentAccount.getBalance());
    }
}