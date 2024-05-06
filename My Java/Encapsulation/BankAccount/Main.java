package Encapsulation.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccNum("SB-09876");
        account.setBalance(2000);

        System.out.println("Account Number: " + account.getAccNum());
        System.out.println("Balance: " + account.getBalance());
    }
}
