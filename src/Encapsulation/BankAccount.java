package Encapsulation;

public class BankAccount {

    final static String bankName = "Bank Of America";
    String firstName ,lastname;

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String firstName, String lastname, String accountHolder, int accountNumber, double balance) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


