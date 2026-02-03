public class BankAccount {
    String acctName;
    double acctBalance;
    int acctPIN;

    BankAccount(String acctName, double acctBalance, int acctPIN) {
        this.acctName = acctName;
        this.acctBalance = acctBalance;
        this.acctPIN = acctPIN;
    }

    public double withdraw(double amount) {
        acctBalance -= amount;
        return acctBalance;
    }

    public void deposit(double amount) {
        acctBalance += amount;
    }
}
