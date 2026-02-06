import java.util.Scanner;

public class BankUI {
    Scanner s = new Scanner(System.in);

    public String acctSummarizedString(String acctName, double acctBalance) {
        return ("Account Holder: " + acctName + "Balance: " + acctBalance);
    }

    int mainMenu() {
        System.out.println("Welcome. do sum iono\n" +
                "1. Deposit\n" +
                "2. Withdraw\n" +
                "3. Check Balance\n" +
                "4. Quit");
        return s.nextInt();
    }

    double depositMenu() {
        System.out.println("How much to deposit?");
        double userInput;
        // how much?
        userInput = s.nextDouble();
        return userInput;
    }

    double withdrawMenu(boolean hold) {
        String userInput;
        // how much?
        if (!hold) {
            System.out.println("How much to withdraw?");
            return userInput;
        } else {
            System.out.println("Account on hold. Cannot withdraw.");
            return 0;
        }
    }
}
