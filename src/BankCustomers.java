import java.util.ArrayList;

public class BankCustomers {
    private ArrayList<BankAccount> accountsList;

    public BankCustomers() {
        this.accountsList = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        if (account != null) {
            accountsList.add(account);
            System.out.printf("Account number %s named %s has been successfully added.%n", account.getAccountNumber(), account.getAccountHolderName());
        } else {
            System.out.println("Error: The account is not valid and could not be added.");
        }
    }

    public void showAllBalances() {
        if (accountsList.isEmpty()) {
            System.out.println("No account has been registered in the system yet.\n");
            return;
        }
        System.out.println("List of all bank accounts:");
        System.out.println("-------------------------");
        for (BankAccount account : accountsList) {
            System.out.printf("Name: %s | Account number: %s | Inventory: %.2f%n",
                    account.getAccountHolderName(), account.getAccountNumber(), account.getBalance());
        }
        System.out.println("-------------------------");
    }

    public BankAccount findAccount(String accountNumber) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            System.out.println("The account number entered is not valid.");
            return null;
        }
        for (BankAccount account : accountsList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.printf("Account Found: Name: %s | Inventory: %.2f",
                        account.getAccountHolderName(), account.getBalance());
                return account;
            }
        }
        System.out.printf("Account number %s not found.%n", accountNumber);
        return null;
    }
}
