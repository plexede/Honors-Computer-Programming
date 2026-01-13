import java.util.Scanner;

public class two {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        boolean repeat = false; // default behavier
        do {
            System.out.println("Input a string:");
            String userInput = s.nextLine();
            for (int i = 0; i < userInput.length(); i++) {
                System.out.println(userInput.charAt(i));
            }
            // check if palindrome
            String stringBackwards = "";
            for (int i = userInput.length() - 1; i >= 0; i--) {
                stringBackwards = stringBackwards + userInput.charAt(i);
            }
            System.out.println(stringBackwards);
            if (userInput.contentEquals(stringBackwards)) {
                System.out.println("Palindrome!");
            } else {
                System.out.println("Not a palindrome!");
            }

            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            for (int i = 0; i < alphabet.length(); i++) {
                int instances = 0;
                for (int j = 0; j < userInput.length(); j++) {
                    if (userInput.toLowerCase().charAt(j) == alphabet.toLowerCase().charAt(i)) {
                        instances++;
                    }
                }
                if (instances > 0) {
                    if (instances > 1) {
                        System.out.println("There are " + instances + " instances of " + alphabet.charAt(i));
                    } else {
                        System.out.println("There is " + instances + " instance of " + alphabet.charAt(i));
                    }
                }
            }
            for (boolean valid = false; !valid;) {
                System.out.println("Repeat?");
                userInput = s.nextLine();
                if (userInput.contentEquals("y")) {
                    repeat = true;
                    valid = true;
                } else if (userInput.contentEquals("n")) {
                    repeat = false;
                    valid = true;
                }
                // repeat if not valid input
            }
        } while (repeat);
        s.close();
    }
}