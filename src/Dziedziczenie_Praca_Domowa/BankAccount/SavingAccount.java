package Dziedziczenie_Praca_Domowa.BankAccount;

public class SavingAccount extends BankAccount {
    private double rate;

    public SavingAccount(String owner, String accountNumber, double balance) {
        super(owner, accountNumber, balance);
    }

    public SavingAccount(String owner, String accountNumber, double balance, double rate) {
        super(owner, accountNumber, balance);
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void addInterest() {
        double interest = getBalance() * rate/100;
        System.out.println("Dodano odsetki w wysokości " + interest + " zł.");
    }



    }

