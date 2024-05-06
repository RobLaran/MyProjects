package Inheritance.BankAccount;

public class BankAccount {
    private float balance;
    private String accountNumber;

    public BankAccount(float balance, String accountNumber){
        this.balance  = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(float amount){
        balance += amount;
    }

    public void withdraw(float amount){
        if(balance >= amount){
            balance -= amount;
        } else if(balance < amount){
            System.out.println("Inusfficient Balance!");
        }
    }

    public float getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
}
