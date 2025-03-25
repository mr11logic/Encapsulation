public class SavingAccount extends BankAccount {
    private final double interestRate = 0.03;
    public SavingAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }
    @Override
    public void calculateInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.printf("The amount of %.2f was added as interest to the savings account number %s.%n",interest, getAccountNumber());
    }
}
