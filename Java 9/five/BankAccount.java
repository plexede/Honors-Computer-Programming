public class BankAccount {
    String acctName;
    double acctBalance;
    String acctPIN;

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

    public String toString() {
        return ("Account Holder: " + acctName + "Balance: " + acctBalance);
    }
}
