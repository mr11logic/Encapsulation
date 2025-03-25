public class Main {
    public static void main(String[] args) {
        BankCustomers bank = new BankCustomers();
        TransactionAccount transactionAccount1 = new TransactionAccount
                ("TA001" , "Ali Rafi" , 5000);
        TransactionAccount transactionAccount2 = new TransactionAccount
                ("TA002" , "Ali Asad" , 2500);
        TransactionAccount transactionAccount3 = new TransactionAccount
                ("TA003" , "Saber Rafi" , 7500);

        SavingAccount savingAccount1 = new SavingAccount
                ("SA001" , "Amir Bidi" , 600);
        SavingAccount savingAccount2 = new SavingAccount
                ("SA002" , "Ahmad Bidi" , 1200);
        SavingAccount savingAccount3 = new SavingAccount
                ("SA003" , "Sasan Bidi" , 2400);

        bank.addAccount(transactionAccount1);
        bank.addAccount(transactionAccount2);
        bank.addAccount(transactionAccount3);
        bank.addAccount(savingAccount1);
        bank.addAccount(savingAccount2);
        bank.addAccount(savingAccount3);

        System.out.println("Account search...");
        BankAccount found = bank.findAccount("SA002");
        System.out.println();
        bank.findAccount("INVALID");

        System.out.printf("Initial balance of account SA002: %.2f%n", savingAccount2.getBalance());
        savingAccount2.deposit(2500);
        System.out.printf("New balance of account SA002: %.2f%n", savingAccount2.getBalance());
        savingAccount2.deposit(-1000);

        savingAccount1.calculateInterest();
        transactionAccount1.calculateInterest();
        System.out.println(savingAccount1.getBalance());
        System.out.println(transactionAccount1.getBalance());

        transactionAccount1.withdraw(2000);
        transactionAccount2.withdraw(-500);
        transactionAccount3.withdraw(8500);
        savingAccount1.withdraw(600);
        savingAccount2.withdraw(0);
        savingAccount3.withdraw(8000);

        bank.showAllBalances();
    }
}