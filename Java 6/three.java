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
                    System.out.println(
                            "True or False: A person playing Minecraft on a phone or tablet can join somebody playing on a console, like PlayStation or XBox without having to set up a dedicated server.");
                    userInput = s.nextLine();
                } while (!(userInput.equalsIgnoreCase("true") || userInput.equalsIgnoreCase("false")));
                if (userInput.equalsIgnoreCase("true")) {
                    System.out
                            .println(
                                    "Yes, Minecraft Bedrock has a friends list system, which can help orchestrate a peer to peer multiplayer session - effectively eliminating the need for an intermediating dedicated server set up by the user.");
                } else {
                    System.out.println(
                            "No, Minecraft Bedrock has a friends list system, which can help orchestrate a peer to peer multiplayer session - effectively eliminating the need for an intermediating dedicated server set up by the user.");
                }
            case 3:
                do {
                    System.out.println(
                            "True or False: F1 cars and consumer vehicles alike both use ackerman rack and pinion bases steering mechanisms.");
                    userInput = s.nextLine();
                } while (!(userInput.equalsIgnoreCase("true") || userInput.equalsIgnoreCase("false")));
                if (userInput.equalsIgnoreCase("true")) {
                    System.out
                            .println(
                                    "Actually, even though F1 still uses the rack and pinion, they actually deliberately employ anti-ackerman geometries to maximize cornering traction at the cost of the situationally negligible tire longetivity.");
                } else {
                    System.out.println(
                            "You're right! Even though F1 still uses the rack and pinion, they actually deliberately employ anti-ackerman geometries to maximize cornering traction at the cost of situationally negligible tire longetivity..");
                }
            case 4:
                do {
                    System.out.println("turbo or supercharger: exhaust gases are redirected to a turbine, spinning a fan at extreme speeds sucking in fresh air to be used in the next combustion cycles.");
                    userInput = s.nextLine();
                } while (!(userInput.equalsIgnoreCase("turbo") || userInput.equalsIgnoreCase("supercharger")));
                if (userInput.equalsIgnoreCase("turbo")) {
                    System.out
                            .println("true!");
                } else {
                    System.out.println(
                            "probably false! i have no clue how a supercharger works twin ✌️");
                }
        }
        s.close();
    }
}