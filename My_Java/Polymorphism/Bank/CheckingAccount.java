package Polymorphism.Bank;

public class CheckingAccount extends BankAccount{
    final private double overdraftFee = 100;

    public CheckingAccount(double balance){
        super(balance);
    }

    public double getOverdraftFee(){
        return overdraftFee;
    }

    public void withdraw(double amount){
        if(amount <= super.getBalance()){
            super.withdraw(amount);
        } else {
            System.out.println("Overdraft Fee Applied!");
            super.withdraw(amount + 100);
        }
    }
}
