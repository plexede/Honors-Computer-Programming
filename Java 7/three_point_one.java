import java.util.Scanner;

public class three_point_one {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a;
        double b;
        double c;
        boolean isTriangle;
        do {
            System.out.println("Enter the sides of a valid triangle.");
            System.out.println("Side a: ");
            a = s.nextInt();
            System.out.println("Side b: ");
            b = s.nextInt();
            System.out.println("Side c: ");
            c = s.nextInt();
            isTriangle = ((a + b > c) && (a + c > b) && (b + c > a));
        } while (!isTriangle);

        // inputs are valid. find area

        // find S
        double S = a + b + c;
        S /= 2;

        a = S - a;
        b = S - b;
        c = S - c;
        S *= a * b * c;
        double area = Math.sqrt(S);
        System.out.println("The area is " + area + ".");

        s.close();
    }
}