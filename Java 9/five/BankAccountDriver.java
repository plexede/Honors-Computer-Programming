import java.util.Scanner;

public class BankAccountDriver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            int userChoice = s.nextInt();
        } catch(Exception e) {
            System.out.println("invalid input");
        }
    }
}