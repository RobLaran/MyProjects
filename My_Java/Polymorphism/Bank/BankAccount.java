package Polymorphism.Bank;

public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient Balance");
            return;
        }
        balance = balance - amount;
    }
}
