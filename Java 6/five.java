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
            stringScanner.close();
        }
        {
            Scanner intScanner = new Scanner(System.in);
            int userInput;
            System.out.println("Please input an integer:");
            userInput = intScanner.nextInt();
            if (userInput % 2 == 0) {
                System.out.print("Your integer is even.");
            } else {
                System.out.print("Your integer is odd.");
            }
            intScanner.close();
        }
        {
            Scanner doubleScanner = new Scanner(System.in);
            double a;
            double b;
            double c;
            System.out.println("Please input a double:");
            System.out.print("a = ");
            a = doubleScanner.nextDouble();
            System.out.print("b = ");
            b = doubleScanner.nextDouble();
            System.out.print("c = ");
            c = doubleScanner.nextDouble();

            // b^2 - 4ac
            double output = (b*b) - (4*a*c);
            System.out.println("The discriminant is: " + output);

            doubleScanner.close();
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
