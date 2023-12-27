package PracticalThings;

//CurrentAccount class implementing Account
class CurrentAccount implements Account {
 private double balance;
 private double overdraftLimit;

 public CurrentAccount(double balance, double overdraftLimit) {
     this.balance = balance;
     this.overdraftLimit = overdraftLimit;
 }

 @Override
 public void deposit(double amount) {
     balance += amount;
 }

 @Override
 public void withdraw(double amount) {
     if (balance - amount >= -overdraftLimit) {
         balance -= amount;
     } else {
         System.out.println("Exceeded overdraft limit!");
     }
 }

 @Override
 public double calculateInterest() {
     // Current account usually doesn't earn interest
     return 0;
 }

 @Override
 public double getBalance() {
     return balance;
 }

 // Unique method for CurrentAccount
 public void applyOverdraftFee() {
     balance -= 5; // Fee for using overdraft
 }
}