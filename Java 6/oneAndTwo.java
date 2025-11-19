import java.util.Random;
import java.util.Scanner;

public class oneAndTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 5: ");
        int userInput = scanner.nextInt();
        if (userInput > 5) // 1
        { 
        System.out.println("Number is too large!");
        } else if (userInput < 1) { // 2
            System.out.println("Number is too small!");
        } else { // 3
            System.out.println("The number is just right!");
            partTwo(userInput);
        }
    }
    static public void partTwo(int userInput) {
        Random r = new Random();
        if (userInput == r.nextInt(1, 5)) {
            System.out.println("And you guessed the magic number!");
        } else {
            System.out.println("Sorry, your guess doesn't match the magic number.");
        }
    }
}