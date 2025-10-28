import java.util.Random;
import java.util.Scanner;

public class RandomAndMathClasses {
    static Random r = new Random();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        { // 1.1-1.2
            double output;
            // print random number from 1-10
            output = r.nextInt(11);
            System.out.println("1-10: " + output);

            // print random number from 1-20
            output = r.nextInt(21);
            System.out.println("1-20: " + output);
        }

        { // 1.3
            System.out.println("Lower Bound: ");
            int lowerBound = s.nextInt();

            System.out.println("Upper Bound: ");
            int upperBound = s.nextInt();
            System.out.println(lowerBound + "-" + upperBound + ": " + r.nextInt(lowerBound, upperBound));
        }

        { // 2.1
            int result = rollADie(6) + rollADie(6);
            System.out.println("The sum of the two is " + result);
        }

        { // 2.2
            meanOfDice(6, 5);
            meanOfDice(6, 20);
        }

        { // 3.1
            System.out.println("Enter a number to find the absolute value of: ");
            double input1 = s.nextDouble();
            System.out.println("The absolute value is: " + Math.abs(input1));

            // 3.2
            System.out.println("Enter a number to find the square root of: ");
            double input2 = s.nextDouble();
            System.out.println("The square root is: " + Math.sqrt(input2));

            // 3.3
            System.out.println("input1^input2 = " + Math.pow(input1, input2));
        }

        { // 4.1
            System.out.println("Enter first double: ");
            double d1 = s.nextDouble();
            System.out.println("Enter second double: ");
            double d2 = s.nextDouble();

            System.out.print("The larger double is: ");
            if (d1 > d2) {
                System.out.println(d1);
            } else {
                System.out.println(d2);
            }
            System.out.print("The smaller double is: ");
            if (d1 < d2) {
                System.out.println(d1);
            } else {
                System.out.println(d2);
            }
        }

        { // 4.2
            System.out.println("Enter first double: ");
            double d1 = s.nextDouble();
            System.out.println("Enter second double: ");
            double d2 = s.nextDouble();
            System.out.println("Enter third double: ");
            double d3 = s.nextDouble();

            double max = Math.max(d1, Math.max(d2, d3)); // ai thought of this one, honestly i should have thought of that (im unfamiliar with Math class)
            double min = Math.min(d1, Math.min(d2, d3));
            
            System.out.println("The largest double is: " + max);
            System.out.println("The smallest double is: " + min);
        }

        { // 4.3
            System.out.println("Enter degres: ");
            double d = s.nextDouble();
            d = Math.toRadians(d);
            System.out.println("sin: " + Math.sin(d));
            System.out.println("cos: " + Math.cos(d));
            System.out.println("tan: " + Math.tan(d));
        }

        { // 5.1
        //    double r = Math.random();
           int rInt = r.nextInt(0, 10);
           System.out.println("sqrt of random number from 0-10: " + Math.sqrt(rInt));
        }

        { // 5.2
            Random r = new Random();
            int[] inputs = new int[4];
            for (int i = 0; i < 4; i++) {
                inputs[i] = (int) (r.nextDouble() * 20);
                inputs[i] = inputs[i] - 10;
                System.out.print(inputs[i] + "\t");
            }
            System.out.println();

            int slope = (inputs[1] - inputs[0]) / inputs[3] - inputs[2];
            System.out.println("slope: " + slope);
        }

        s.close();
    }

    static int rollADie(int sides) {
        int result = r.nextInt(sides + 1);
        System.out.println("Rolled a " + sides + " sided die for " + result);
        return result;
    }

    static void meanOfDice(int sides, int timesToRoll) {
        int[] results = new int[timesToRoll];

        System.out.println("Rolling " + timesToRoll + " dice...");

        // roll all dice
        for (int i = 0; i < timesToRoll; i++) {
            results[i] = rollADie(sides);
        }

        // find the mean of the results
        int sum = 0;
        for (int i = 0; i < timesToRoll; i++) {
            sum = sum + results[i];
        }
        int mean = sum / timesToRoll;
        System.out.println("The mean is: " + mean);
    }
}