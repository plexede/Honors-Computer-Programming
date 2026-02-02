import java.util.Scanner;

public class BankAccountDriver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int NUMBER_OF_OPTIONS = 3;
        for (boolean valid = false; !valid;) {
            int userChoice = s.nextInt();
            valid = (userChoice > 0) && (userChoice <= NUMBER_OF_OPTIONS);
            if (!valid)
                System.out.println("Invalid input!");
        }
        switch (userChoice) {
            case 1:
                // deposit
                break;
            case 2:
                // withdraw
                break;
            case 3:
        
            default:
                break;
        }
        s.close();
    }
}