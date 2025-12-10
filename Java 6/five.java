import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        {
            Scanner stringScanner = new Scanner(System.in);
            String userInput;
            do {
                System.out.println("Please input a single character:");
                userInput = stringScanner.nextLine();
            } while (userInput.length() != 1);
            userInput = userInput.toUpperCase();
            switch (IsVowel(userInput)) {
                case 0:
                    System.out.println("Your character is a consenant.");
                    break;
                case 1:
                    System.out.println("Your character is a vowel.");
                    break;
                case 2:
                    System.out.println("Your character is sometimes a vowel.");
                    break;
                default:
                    break;
            }
            // stringScanner.close();
        }
        {
            Scanner intScanner = new Scanner(System.in);
            int userInput;
            System.out.println("Please input an integer:");
            userInput = intScanner.nextInt();
            if (userInput % 2 == 0) {
                System.out.println("Your integer is even.");
            } else {
                System.out.println("Your integer is odd.");
            }
            // intScanner.close();
        }
        {
            Scanner doubleScanner = new Scanner(System.in);
            double a;
            double b;
            double c;
            System.out.println("Please input a double:");
            System.out.println("a = ");
            a = doubleScanner.nextDouble();
            System.out.println("b = ");
            b = doubleScanner.nextDouble();
            System.out.println("c = ");
            c = doubleScanner.nextDouble();

            /*
             * Create a program that will find the roots of a quadratic.
             * You will take three doubles from the user (a, b, and c). Use the
             * discriminant to decide if the combination has two real roots, one real
             * root, or no real roots. If the quadratic has no real roots, you can just
             * say “No real roots.” If it has one real root, you should just output one
             * root. If it has two, you should output the two roots.
             * EXTRA: If you want to get fancy, you can find the imaginary roots.
             */

            // b^2 - 4ac
            double output = (b * b) - (4 * a * c);
            System.out.println("The discriminant is: " + output);

            // d > 0 = real non zero number

            // d = 0 = 1 real

            // d < 0 = no real roots

            // doubleScanner.close();
        }
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
