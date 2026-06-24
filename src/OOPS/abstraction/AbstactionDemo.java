package OOPS.abstraction;

public class AbstactionDemo {
    static void main(String[] args) {
        savingAccounts SavingAccounts = new savingAccounts();
        SavingAccounts.deposit(100);

        BankAccount savingsAccount1 = new savingAccounts();
        savingsAccount1 = new currentAccounts();
        savingsAccount1.deposit(200);
    }
}
