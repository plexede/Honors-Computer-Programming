import java.util.Random;
import java.util.Scanner;

public class three {
    static Random r = new Random();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String userInput;
        int userScore = 0;
        int computerScore = 0;
        do {
            while (userScore < 3 && computerScore < 3) {
                if (userScore + computerScore > 0) {
                    System.out.println("The score is " + userScore + " to " + computerScore + ".");
                }
                do {
                    System.out.println("Enter Rock, Paper, or Scissors.");
                    userInput = s.nextLine();
                } while (inputToID(userInput) == -1);

                // generate random choice
                int computerChoice = r.nextInt(3);
                System.out.print("I chose " + idToInput(computerChoice).toLowerCase() + ". ");
                switch (inputToID(userInput)) {
                    case 0:
                        switch (computerChoice) {
                            case 0:
                                System.out.println("Tie!");
                                break;
                            case 1:
                                System.out.println("You lose!");
                                computerScore++;
                                break;
                            case 2:
                                System.out.println("You win!");
                                userScore++;
                                break;
                        }
                        break;
                    case 1:
                        switch (computerChoice) {
                            case 0:
                                System.out.println("You win!");
                                userScore++;
                                break;
                            case 1:
                                System.out.println("Tie!");
                                break;
                            case 2:
                                System.out.println("You lose!");
                                computerScore++;
                                break;
                        }
                        break;
                    case 2:
                        switch (computerChoice) {
                            case 0:
                                System.out.println("You lose!");
                                computerScore++;
                                break;
                            case 1:
                                System.out.println("You win!");
                                userScore++;
                                break;
                            case 2:
                                System.out.println("Tie!");
                                break;
                        }
                }
            }
            System.out.println("Game over!");
            System.out.println("The score was " + userScore + " to " + computerScore + ".");
            if (userScore > computerScore) {
                System.out.println("You won! YAY!");
            } else {
                System.out.println("You lost. Better luck next time!");
            }
            System.out.println("play again?");
        } while (s.nextBoolean());
        s.close();
    }

    public static int inputToID(String userInput) {
        if (userInput.equalsIgnoreCase("Rock")) {
            return 0;
        } else if (userInput.equalsIgnoreCase("Paper")) {
            return 1;
        } else if (userInput.equalsIgnoreCase("Scissors")) {
            return 2;
        } else { // catch invalid input
            return -1;
        }
    }

    public static String idToInput(int id) {
        switch (id) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            default:
                return "Invalid ID";
        }
    }
}
