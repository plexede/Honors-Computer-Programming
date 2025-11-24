import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String userInput;
        do {
            System.out.println("Please input a single character:");
            userInput = s.nextLine();
        } while (userInput.length() != 1);
        userInput = userInput.toUpperCase();
        switch (IsVowel(userInput)) {
            case 0:
                System.out.print("Your character is a consenant.");
                break;
            case 1:
                System.out.print("Your character is a vowel.");
                break;
            case 2:
                System.out.print("Your character is sometimes a vowel.");
                break;
            default:
                break;
        }
        s.close();
    }

    public static int IsVowel(String userInput) {
        switch (userInput) {
            case "A":
                return 1;
            case "E":
                return 1;
            case "I":
                return 1;
            case "O":
                return 1;
            case "U":
                return 1;
            case "Y":
                return 2;
            default:
                return 0;
        }
    }
}
