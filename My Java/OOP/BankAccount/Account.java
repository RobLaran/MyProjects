package OOP.BankAccount;

public class Account {
    
    private String name;
    private String accountNumber;
    private int balance;

    public Account(String name, String accountNumber, int balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName(){
        return name;
    }

    public String getAccountNum(){
        return accountNumber;
    }

    public int getBalance(){
        return balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNumber(String number){
        this.accountNumber = number;
    }

    public void setBalance(int bal){
        this.balance = bal;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    public String accDetails(){
        return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance;
    }

}