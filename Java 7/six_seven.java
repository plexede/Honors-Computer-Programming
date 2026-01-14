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

        int computerGuess = r.nextInt(min, max + 1);
        int overUnder = 0;
        int guesses = 0;
        boolean guessed = false;
        int userInput;

        System.out.println("I'm thinking of a number from " + min + " to " + max + ". Can you guess it?");
        do {
            userInput = s.nextInt();
            if (userInput > max || userInput < min) {
                System.out.println("That's not even within bounds. What a waste of a guess.");
            } else {
                if (computerGuess == userInput) {
                    overUnder = 0;
                } else {
                    overUnder = (computerGuess > userInput) ? 1 : -1;
                }
                switch (overUnder) {
                    case -1:
                        System.out.println("Lower!");
                        break;
                    case 0:
                        System.out.println("You guessed it!");
                        guessed = true;
                        break;
                    case 1:
                        System.out.println("Higher!");
                        break;
                }
            }
            guesses++;
        } while (!guessed);
        if (guesses == 1)
            System.out.println("first try!");
        else
            System.out.println("finally. took you " + guesses + " tries...");
        s.close();
    }
}