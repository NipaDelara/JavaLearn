public class BankAccount {

    // Instance variables
    private final int accountNumber;
    private double balance;

    // Static variable
    private static int totalAccounts = 0;

    // Constructor
    public BankAccount(double initialBalance) {
        totalAccounts++;
        this.accountNumber = totalAccounts;
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
    }
    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance in account " + accountNumber);
        }
    }
    // Getter for balance
    public double getBalance() {
        return balance;
    }
    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }
    // Static method to get total accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Main method
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }

}
