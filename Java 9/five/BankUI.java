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
                "3. Check Balance\n");
        return s.nextInt();
    }

    double depositMenu() {
        int userChoice;
        double userInput;
        // how much?
        System.out.println("How much to deposit?");
        return userInput;
    }

    double withdrawMenu() {
        String userInput;
        // how much?
        System.out.println("How much to withdraw?");
        return deposit(userInput);
    }
}
