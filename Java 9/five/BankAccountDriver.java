import java.util.Scanner;

public class BankAccountDriver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for (boolean valid = false; !valid;) {
            int userChoice = s.nextInt();
            valid = (userChoice > 0) && (userChoice <= 3);
            if (!valid)
                System.out.println("Invalid input!");
        }
        s.close();
    }
}