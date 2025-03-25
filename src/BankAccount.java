public abstract class BankAccount {
    private final String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public abstract void calculateInterest();
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("The amount of %.2f was added to the account number %s.%n", amount, accountNumber);
        } else {
            System.out.println("The deposit amount is invalid. Please enter the amount correctly.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.printf("The amount of %.2f was withdrawn from account number %s.%n", amount, accountNumber);
            } else {
                System.out.println("Insufficient inventory");
            }
        } else {
            System.out.println("The withdrawal amount is invalid. Please enter the amount correctly.");
        }
    }
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}
