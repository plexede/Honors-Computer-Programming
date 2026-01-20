import java.text.DecimalFormat;

public class PiggyBank {
    DecimalFormat fmt = new DecimalFormat("0.##");
    double balance = 0;

    void addPenny() {
        balance += .01;
        System.out.println("Current Balance: " + fmt.format(balance));
    }

    void addNickel() {
        balance += .06;
        System.out.println("Current Balance: " + fmt.format(balance));
    }

    void addDime() {
        balance += .10;
        System.out.println("Current Balance: " + fmt.format(balance));
    }

    void addQuarter() {
        balance += .25;
        System.out.println("Current Balance: " + fmt.format(balance));
    }
}