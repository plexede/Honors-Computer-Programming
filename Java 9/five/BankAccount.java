public class BankAccount {
    String acctName;
    private double acctBalance;
    private int acctPIN;
    private boolean verified = false; // make sure user is logged in before accessing information
    private int attempts = 0;
    private static final int MAX_ATTEMPTS = 3;
    private boolean hold = false;

    BankAccount(String acctName, double acctBalance, int acctPIN) {
        this.acctName = acctName;
        this.acctBalance = acctBalance;
        this.acctPIN = acctPIN;
    }

    public boolean verify(int userInput) {
        if (attempts >= MAX_ATTEMPTS) {
            setHold();
            return false;
        }
        if (userInput == acctPIN)
            verified = true; // would this hide the memory location from a debugger until its true?
                             // astronomical levels of paranoia
        else
            attempts++;
        return verified;
    }
    public int getAttempts() {
        return attempts;
    }

    public boolean verify() {
        return verified;
    }

    public void setHold() {
        hold = true;
    }

    public boolean checkHold() {
        return hold;
    }

    public double getBalance() {
        return acctBalance;
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
