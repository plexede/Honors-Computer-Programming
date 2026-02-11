import java.util.Scanner;

public class BankUI {
    Scanner s = new Scanner(System.in);

    public String acctSummarizedString(String acctName, double acctBalance) {
        return ("Account Holder: " + acctName + "Balance: " + acctBalance);
    }

    public int loginMenu(int attempts, boolean hold) {
        if (hold)
            System.out.println("Account on hold. Please contact your bank.");
        else if (attempts > 0)
            System.out.println("Invalid PIN. Please try again.");
        System.out.println("Enter Security PIN:");
        return s.nextInt();
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
        // String userInput;
        // how much?
        if (!hold) {
            System.out.println("How much to withdraw?");
            // return userInput;
            return s.nextDouble();
        } else {
            System.out.println("Account on hold. Cannot withdraw.");
            return 0;
        }
    }

    public void presentWithdrawn(double output) {
        System.out.println("$" + output + " withdrawn.");
    }

    public void presentError() {
        System.out.println("Operation cancelled: An error occurred. Please try again.")
    }

    public void logout() {
        System.out.println("Logged out.");
    }

}
