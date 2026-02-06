public class BankAccount {
    String acctName;
    private double acctBalance;
    private int acctPIN;
    private boolean hold = false;

    BankAccount(String acctName, double acctBalance, int acctPIN) {
        this.acctName = acctName;
        this.acctBalance = acctBalance;
        this.acctPIN = acctPIN;
    }

    public void setHold() {
        hold = true;
    }

    public boolean checkHold() {
        return hold;
    }

    public double withdraw(double amount) {
        // more than account? hold
        if (amount > acctBalance) {
            hold = true;
            return -1;
        } else {
            acctBalance -= amount;
            return acctBalance;
        }
    }

    public void deposit(double amount) {
        acctBalance += amount;
    }
}
