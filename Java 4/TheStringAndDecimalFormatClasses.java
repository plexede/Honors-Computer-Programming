import java.util.Scanner;
import java.text.DecimalFormat;

public class TheStringAndDecimalFormatClasses {
    static Scanner s = new Scanner(System.in);

    // static DecimalFormat fmt = new DecimalFormat("0.###");
    public static void main(String[] args) {
        String userInput;
        { // 1.1 - 1.3
        do {
        System.out.println("Input an at least 10 character string: ");
        userInput = s.nextLine();
        } while (!(userInput.length() >= 10));

        System.out.println(userInput.toUpperCase());
        System.out.println(userInput.toLowerCase());

        System.out.println("vielen danke. dein string ist" + userInput.length() +
        "characters.");
        System.out.println("das vierte character ist" + userInput.charAt(4));
        System.out.println("das vierte character ist" + userInput.charAt(4));
        System.out.println("characters eins bis sechs: " + userInput.substring(1,
        6));
        }
        { // 2.1
        System.out.println("yet another string: ");
        userInput = s.nextLine();
        userInput = replace(userInput, 'e', 's');
        System.out.println(userInput);
        }
        { // 2.2
        String userInput2;
        System.out.println("another one: ");
        userInput = s.nextLine();
        System.out.println("and another one: ");
        userInput2 = s.nextLine();
        System.out.println("Strings the same: " + (userInput.equals(userInput2) ?
        "true" : "false"));

        // 2.3
        String userInput1Half = userInput.substring(0, userInput.length() / 2);
        String userInput2Half = userInput2.substring(userInput2.length() / 2);
        System.out.println(userInput1Half + userInput2Half);
        }
        { // 3.1
        System.out.println("more strings please: ");
        userInput = s.nextLine();
        int randomIndex = (int)(Math.round(Math.random() * userInput.length()));
        System.out.println("Character at random index " + randomIndex + ": " +
        userInput.charAt(randomIndex));
        System.out.println("substring from 0 to random index of " + randomIndex + ":
        " + userInput.substring(0, randomIndex));
        }
        { // 3.3
        System.out.println("enter red blue or yellow: ");
        userInput = s.nextLine();
        boolean doesIt = userInput.contains("red") || userInput.contains("blue") || userInput.contains("yellow");
        System.out.println("your answer does contain red blue or yellow: " + doesIt);
        // if (userInput.contains("red") || userInput.contains("blue") || userInput.contains("yellow"))
        // {
        //     System.out.println("your answer does contain red blue or yellow");
        // }
        // else 
        // {
        //     System.out.println("your answer does not contain red blue or yellow");
        // }
        }
        { // 4.1
        double userNumber = Math.random();
        DecimalFormat fmt = new DecimalFormat("0.######");
        System.out.println("random number formatted to 6 decimal places: " +
        fmt.format(userNumber));
        }
        { // 4.2
        DecimalFormat fmt = new DecimalFormat("0.###");
        userInput = s.nextInt();
        int userInput2 = s.nextInt();
        double result = (double)userInput / (double)userInput2;
        System.out.println("result formatted to 3 decimal places: " +
        fmt.format(result));
        }
        { // 4.3 find power, assuming p = jt
            DecimalFormat fmt = new DecimalFormat("0.##");
            System.out.println("enter work in joules: ");
            double joules = s.nextDouble();
            System.out.println("enter time elapsed: ");
            double time = s.nextDouble();
            double power = joules / time;
            System.out.println("power = " + fmt.format(power));
        }
        { // 5.1
            do {
                System.out.println("enter a string containing the character 'r': ");
                userInput = s.nextLine();
            }
            while (!userInput.contains("r"));
            int firstIndex = userInput.indexOf('r');
            System.out.println(userInput.substring(firstIndex));
        }
        { // 5.2
            System.out.println("enter a string: ");
            userInput = s.nextLine();
            char firstLetter = userInput.charAt(0);
            userInput = userInput.replace(firstLetter, 'g');
            System.out.println(userInput);
        }
        { // 5.3
            String alphabet = "abcdefghijklmnop";
            System.out.println("enter a string: ");
            userInput = s.nextLine();
            char alphabetIndex = alphabet.charAt((int)(Math.random() * alphabet.length()));
            char firstLetter = userInput.charAt(0);
            userInput = userInput.replace(firstLetter, alphabetIndex);
            System.out.println(userInput);
        }
    }
}