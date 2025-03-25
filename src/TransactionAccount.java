public class TransactionAccount extends BankAccount{
    private final double overDraftLimit = 500;
    public TransactionAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }
    @Override
    public void calculateInterest() {
        System.out.printf("Current account number %s does not receive interest.%n", getAccountNumber());
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("The deposit amount is invalid. Please enter the amount correctly.");
            return;
        }

        double maxWithdrawal = getBalance() + overDraftLimit;

        if (amount <= maxWithdrawal) {
            balance -= amount;
            System.out.printf("The amount of %.2f was withdrawn from the current account number %s.%n", amount, getAccountNumber());

            if (balance < 0) {
                System.out.printf("Note: Your balance has gone negative <%.2f>.%n", balance);
            }
        }
        else {
            System.out.printf("Maximum amount that can be withdrawn: %.2f ---> balance + withdrawal limit %n", maxWithdrawal);
        }
    }}
