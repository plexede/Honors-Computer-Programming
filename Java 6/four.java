import java.util.Scanner;

public class four {
    static Scanner s = new Scanner(System.in);
    static String userInput;
    static String optionA;
    static String optionB;

    public static void main(String[] args) {
        // System.out.println("You entered: " + optionsAB("hello", "hi"));
        int storyIndex = 0;
        switch (storyIndex) {
            case 0:
                System.out.println("This is the beginning of the story. Are you ready?" +
                        "\n yes \n no");
                optionsAB(optionA, optionB);
                break;
            case 1:
                System.out.println("This is the middle of the story.");
                break;
        }
    }

    public static String optionsAB(String optionA, String optionB) {
        do {
            userInput = s.nextLine();
        } while (!(userInput.contentEquals(optionA) || userInput.contentEquals(optionB)));
        return userInput;
    }
}
