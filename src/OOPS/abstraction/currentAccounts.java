package OOPS.abstraction;

public class currentAccounts extends BankAccount{
    @Override
    public void deposit(double amount) {
        System.out.println("Deposited Current");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdraw Current");
    }
}
