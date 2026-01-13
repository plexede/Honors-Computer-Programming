import java.util.Scanner;

public class sixFactors {
    public static void main(String[] args) {
        System.out.println("Input a number to find its factors:");
        Scanner s = new Scanner(System.in);
        int userInput = s.nextInt();
        System.out.println("The factors of " + userInput + " are:");
        for (int i = userInput; i > 0; i--)
            {
                boolean isDivisible = ((userInput % i) == 0);
                if (isDivisible) {
                    System.out.print((userInput / i) + " ");
                }
            }
            System.out.println("");

    }
}
