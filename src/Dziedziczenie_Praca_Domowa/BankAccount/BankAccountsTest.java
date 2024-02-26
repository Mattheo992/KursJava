package Dziedziczenie_Praca_Domowa.BankAccount;

public class BankAccountsTest {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("Mateusz Stępniak", "1234-5678-9123", 26500.00, 4.5);
        CheckingAccount checkingAccount = new CheckingAccount("Dominik Jachaś", "9874-6532-1234", 66602.50, 2400.00);
        savingAccount.deposit(2550.0);
        savingAccount.checkBalance();
        savingAccount.addInterest();
        savingAccount.checkBalance();
        savingAccount.withdraw(2400);
        savingAccount.checkBalance();

        checkingAccount.deposit(6666.25);
        checkingAccount.checkBalance();
        checkingAccount.withdraw(666.00);
        checkingAccount.checkBalance();

    }
}
