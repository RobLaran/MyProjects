package Polymorphism.Bank;

public class SavingsAccount extends BankAccount{
    private double withdrawalLimit = 150;

    public SavingsAccount(double balance){
        super(balance);
    }

    public void withdraw(double amount){
        if(amount < withdrawalLimit){
            System.out.println("To  withdraw: Amount must above 150!");
            return;
        }

        super.withdraw(amount);
    }
}
