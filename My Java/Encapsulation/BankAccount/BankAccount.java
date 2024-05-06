package Encapsulation.BankAccount;

public class BankAccount {
    private String acccountNumber;
    private double balance;    

    public String getAccNum(){
        return acccountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void setAccNum(String newAccNum){
        this.acccountNumber = newAccNum;
    }

    public void setBalance(double newBal){
        this.balance = newBal;
    }
}
