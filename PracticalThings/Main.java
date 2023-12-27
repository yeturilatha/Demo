package PracticalThings;


public class Main {
    public static void main(String[] args) {
        // Testing SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
        savingsAccount.deposit(500);
        System.out.println("After deposit: $" + savingsAccount.getBalance());
        savingsAccount.withdraw(200);
        System.out.println("After withdrawal: $" + savingsAccount.getBalance());

        // Testing CurrentAccount
        CurrentAccount currentAccount = new CurrentAccount(2000, 1000);
        System.out.println("\nCurrent Account Balance: $" + currentAccount.getBalance());
        currentAccount.deposit(300);
        System.out.println("After deposit: $" + currentAccount.getBalance());
        currentAccount.withdraw(2500);
        System.out.println("After withdrawal: $" + currentAccount.getBalance());
    }
}