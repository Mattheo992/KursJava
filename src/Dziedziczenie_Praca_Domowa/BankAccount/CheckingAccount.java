package Dziedziczenie_Praca_Domowa.BankAccount;

public class CheckingAccount extends BankAccount{
private double overDraft;

    public CheckingAccount(String owner, String accountNumber, double balance, double overDraft) {
        super(owner, accountNumber, balance);
        this.overDraft = overDraft;
    }

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }

    public CheckingAccount(String owner, String accountNumber, double balance) {
        super(owner, accountNumber, balance);
    }

    @Override
    public void checkBalance() {
       super.checkBalance();
    }

    @Override
    public void withdraw(double amount){
        if (getBalance()+overDraft >= amount){
            setBalance(getBalance()-amount);
            System.out.println("Wypłacono " + amount + " zł.");
        }else {
            System.out.println("Brak wystarczajacych środków");}
    }
}
