package Dziedziczenie_Praca_Domowa.BankAccount;

public class BankAccount {
    private String owner;
    private String accountNumber;
    private double balance;

    public BankAccount(String owner, String accountNumber, double balance) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Wpłacono na konto o numerze " + accountNumber +" kwotę " + amount + " zł.");
    }
    public void withdraw (double amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("Wypłacono " + amount + " zł");
        }
        else {
            System.out.println("Brak wystarczajacych środków do wypłaty");
        }
    }
    public void checkBalance(){
        System.out.println("Na koncie " +accountNumber + " pozostało " + balance + " zł.");
    }
}
