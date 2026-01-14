import java.util.Scanner;
import java.util.Random;

public class six_seven {
    public static void main(String[] args) {
        /*
         * Create a program that will play the “High Low Guessing Game”. The
         * computer should pick a random number from 1 to 100. The user should try to
         * guess the number. If they guess too low, the computer should say “Too low”;
         * if
         * they guess to high, it should say “Too high”. The game should last until the
         * user guesses the number. It should display the number of guesses it took the
         * user.
         */
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        int min = 1;
        int max = 3;

        System.out.println("I'm thinking of a number from " + min + " to " + max + ". Can you guess it?");
        int userInput = s.nextInt();
        int computerGuess = r.nextInt(min, max + 1);
        int overUnder;
        if (computerGuess == userInput) {
            overUnder = 0;
            switch (overUnder) {
                case 1:
                    System.out.println("Wrong. The number was: " + computerGuess);
                    return;
                    case 0:
                        System.out.println("You guessed it!");


        }

        s.close();
    }
}