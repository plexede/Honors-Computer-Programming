import java.util.Scanner;

public class BankAccountDriver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BankUI ui = new BankAccountUI();
        int NUMBER_OF_OPTIONS = 3;
        for (boolean valid = false; !valid;) {
            int userChoice = ui.mainMenu();
            valid = (userChoice > 0) && (userChoice <= NUMBER_OF_OPTIONS);
            if (!valid)
                System.out.println("Invalid input!");
        }
        s.close();
    }
}