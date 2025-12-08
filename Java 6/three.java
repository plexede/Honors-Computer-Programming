import java.util.Random;
import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String userInput;

        Random r = new Random();
        switch (r.nextInt(1, 5)) {
            case 1:
                do {
                    System.out.println("True or false: The Earth revolves around the Sun.");
                    userInput = s.nextLine();
                } while (!(userInput.equalsIgnoreCase("true") || userInput.equalsIgnoreCase("false")));
                if (userInput.equalsIgnoreCase("true")) {
                    System.out
                            .println(
                                    "False! The Earth revolves its own axis, all the while it instead orbits the Sun.");
                } else {
                    System.out.println(
                            "You're right! The Earth revolves its own axis, all the while it instead orbits the Sun.");
                }
            case 2:
                do {
                    System.out.println("True or False: A person playing Minecraft on a phone or tablet can join somebody playing on a console, like PlayStation or XBox.");
                    userInput = s.nextLine();
                } while (!(userInput.equalsIgnoreCase("true") || userInput.equalsIgnoreCase("false")));
                if (userInput.equalsIgnoreCase("true")) {
                    System.out
                            .println("Yes");
                } else {
                    System.out.println("the answer");
                }
            case 3:
                do {
                    System.out.println("change this too");
                    userInput = s.nextLine();
                } while (!(userInput.equalsIgnoreCase("true") || userInput.equalsIgnoreCase("false")));
                if (userInput.equalsIgnoreCase("true")) {
                    System.out
                            .println("False! The Earth orbits its own axis, all the while it instead orbits the Sun.");
                } else {
                    System.out.println(
                            "You're right! The Earth orbits its own axis, all the while it instead orbits the Sun.");
                }
            case 4:
                do {
                    System.out.println("change this too");
                    userInput = s.nextLine();
                } while (!(userInput.equalsIgnoreCase("true") || userInput.equalsIgnoreCase("false")));
                if (userInput.equalsIgnoreCase("true")) {
                    System.out
                            .println("False! The Earth orbits its own axis, all the while it instead orbits the Sun.");
                } else {
                    System.out.println(
                            "You're right! The Earth orbits its own axis, all the while it instead orbits the Sun.");
                }
        }
        s.close();
    }
}