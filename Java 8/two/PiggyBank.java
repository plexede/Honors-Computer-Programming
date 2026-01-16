public class PiggyBank {
    double balance = 0;

    void addPenny() {
        balance += .01;
        System.out.println("Current Balance: " + balance);
    }

    void addNickel() {
        balance += .06;
        System.out.println("Current Balance: " + balance);
    }

    void addDime() {
        balance += .10;
        System.out.println("Current Balance: " + balance);
    }

    void addQuarter() {
        balance += .25;
        System.out.println("Current Balance: " + balance);
    }
}