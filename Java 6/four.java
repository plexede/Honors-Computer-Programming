import java.util.Scanner;

public class four {
    static Scanner s = new Scanner(System.in);
    // i have no idea what the convention is for this language
    static String userInput;
    static String optionA;
    static String optionB;

    public static void main(String[] args) {
        // System.out.println("You entered: " + optionsAB("hello", "hi"));
        int storyIndex = 0;
        int storyEnd = 100;
        while (storyIndex != 100) {
            if (storyIndex > storyEnd) {
                System.out.println("!! Please increase storyEnd value !!");
            }
            ;
            switch (storyIndex) {
                case 0:
                    System.out.println("This is the beginning of the story. Are you ready?");
                    optionA = "yes";
                    optionB = "no";
                    storyIndex = optionsAB(optionA, optionB) ? 1 : storyEnd;
                    break;
                case 1:
                    System.out.println("This is the middle of the story.");
                    optionA = "yes";
                    optionB = "no";
                    storyIndex = optionsAB(optionA, optionB) ? 1 : storyEnd;
                    break;
            }
        }
    }

    public static boolean optionsAB(String optionA, String optionB) {
        System.out.println(optionA + "\n" + optionB);
        do {
            userInput = s.nextLine();
        } while (!(userInput.contentEquals(optionA) || userInput.contentEquals(optionB)));
        return userInput.contentEquals(optionA);
    }
}
