import java.util.Scanner;

public class three_point_one {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        int c;
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
        s.close();
    }
}