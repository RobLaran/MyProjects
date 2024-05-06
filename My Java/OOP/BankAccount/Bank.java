package OOP.BankAccount;

import java.util.ArrayList;

public class Bank {

    ArrayList<Account> accounts;

    public Bank(){
        accounts = new ArrayList<Account>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void removeAccount(Account account){
        accounts.remove(account);
    }

    public void depositBalance(Account account , int amount){
        account.deposit(amount);
    }

    public void withdrawBalance(Account account, int amount){
        account.withdraw(amount);
    }

    public ArrayList <Account> getAllAccounts(){
        return accounts;
    }

}
