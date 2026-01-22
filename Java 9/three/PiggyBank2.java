public class PiggyBank2 {
    double balance;

    PiggyBank2(double startingBalance) {
        balance = startingBalance;
    }

    PiggyBank2() {
        balance = 0;
    }

    void addMoney(double amount) {
        balance += amount;
    }

    double getBalance() {
        return balance;
    }
}