package Inheritance.BankAccount;

public class SavingsAccount extends BankAccount{
    
    public SavingsAccount(float balance, String accountNumber){
        super(balance, accountNumber);
    }

    public void withdraw(float amount){
        if(getBalance() - amount < 100){
            System.out.println("Minimum balance of $100 required!");
        } else {
            super.withdraw(amount);
        }

    }
}
