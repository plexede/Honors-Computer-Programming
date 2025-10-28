import java.util.Scanner;

public class TheScannerClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        { // 1
        System.out.println("please enter the radius of the circle: ");
        double radius = scan.nextDouble();
        double circumference = 2 * radius * Math.PI;
        System.out.println("Circumference is " + circumference + ".");

        // now find area of circle
        double area = Math.pow(Math.PI, 2);
        area = area * radius;
        System.out.println("Area is " + area + ".");

        // now volume
        double volume = Math.pow(radius, 3);
        volume = 4 / 3 * Math.PI * volume;
        System.out.println("If it were a sphere, the volume would be " + volume + ".");
        }
        { // 2.1
        System.out.println();

        System.out.print("x1 > ");
        double x1 = scan.nextDouble();

        System.out.print("y1 > ");
        double y1 = scan.nextDouble();

        System.out.print("x2 > ");
        double x2 = scan.nextDouble();

        System.out.print("y2 > ");
        double y2 = scan.nextDouble();

        double slope = (y2 - y1) / (x2 - x1);
        System.out.println("The slope is: " + slope + ".");
        }
        { // 2.2
        System.out.println();

        System.out.print("x1 > ");
        double x1 = scan.nextDouble();

        System.out.print("y1 > ");
        double y1 = scan.nextDouble();

        System.out.print("x2 > ");
        double x2 = scan.nextDouble();

        System.out.print("slope > ");
        double slope = scan.nextDouble();

        double y2 = slope * (x2 - x1) + y1;
        System.out.println("The value of y2 is: " + y2 + ".");
        }
        { // 2.3
        System.out.print("x1 > ");
        double x1 = scan.nextDouble();

        System.out.print("y1 > ");
        double y1 = scan.nextDouble();

        System.out.print("y2 > ");
        double y2 = scan.nextDouble();

        System.out.print("slope > ");
        double slope = scan.nextDouble();

        double x2 = ((y2 - y1) / slope) + x1;
        System.out.println("The value of x2 is: " + x2 + ".");
        }
        { // 3.1
            // area of trapezoid
            System.out.print("Base 1 > ");
            double base1 = scan.nextDouble();
            System.out.print("Base 2 > ");
            double base2 = scan.nextDouble();
            System.out.print("Height > ");
            double height = scan.nextDouble();
            double area = ((base1 + base2) / 2) * height;
            System.out.println("Area of the trapezoid is: " + area + ".");
        }
        { // 3.2
                System.out.print("Base 1 > ");
                double base1 = scan.nextDouble();
                System.out.print("Base 2 > ");
                double base2 = scan.nextDouble();
                System.out.print("Area > ");
                double area = scan.nextDouble();
                double height = (2 * area) / (base1 + base2);
                System.out.println("Height of the trapezoid is: " + height + ".");
        }
        { // 3.3
            System.out.print("Base 1 > ");
            double base1 = scan.nextDouble();
            System.out.print("Height > ");
            double height = scan.nextDouble();
            System.out.print("Area > ");
            double area = scan.nextDouble();
            double base2 = (2 * area / height) - base1;
            System.out.println("Base 2 of the trapezoid is: " + base2 + ".");
        }
        { // 4
            System.out.println("Name > ");    
            String name = scan.nextLine();
            System.out.println("Hello, " + name + "!");
            System.out.println("The length of your name is: " + name.length() + " characters long.");
            System.out.println(name.toUpperCase() + " is your name in all uppercase letters.");            
        }
        { // 5
            System.out.println("Is it true?");
            boolean question = scan.nextBoolean();
            String answer = question ? "true" : "false";
            System.out.println("You answered " + answer + ".");
            answer = question ? "false" : "true";
            System.out.println("You did not answer " + answer + ".");
        }

        scan.close();
    }
}