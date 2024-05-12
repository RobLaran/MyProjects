package Polymorphism.Bank;

public class Main {
    public static void main(String[] args) {
        BankAccount savAcc = new SavingsAccount(2000);
        BankAccount checkAcc = new CheckingAccount(1000);

        savAcc.withdraw(300);
        checkAcc.withdraw(250);

        System.out.println("Savings Account Balance: " + savAcc.getBalance());
        System.out.println("Checking Account Balance: " + checkAcc.getBalance());

    }
    
}
