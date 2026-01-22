public class Triangle {
    /*
     * 4. N00b: Create a class called Triangle. A Triangle holds six doubles called
     * x1, y1, x2, y2, x3, y3. There should be a constructor that assigns the values
     * to the instance variables.
     */
    double x1, y1, x2, y2, x3, y3;

    Triangle(
            double x1,
            double y1,
            double x2,
            double y2,
            double x3,
            double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    /*
     * Make a method called getPoints() that returns the six variables in ordered
     * pair form as a String. Create a driver that makes an instance of a Triangle
     * with the values x1 = 3, y1 = 1, x2 = -2, y2 = -2, x3 = 2, y3 = -2 and outputs
     * the points.
     */
    String getPoints() {
        return ("x1 = " + x1 + ", " +
                "y1 = " + y1 + ", " +
                "x2 = " + x2 + ", " +
                "y2 = " + y2 + ", " +
                "x3 = " + x3 + ", " +
                "y3 = " + y3);
    }

    /*
     * Coder: Do N00b and add two methods. One with the following header:
     * public double sideLength(double x1, double y1, double x2, double y2)
     * The method will find the distance between
     * two points, or one side length, and return
     * the answer.
     * HINT: Use the distance formula.
     * The second method should have the following header:
     * public double findPerimeter()
     * This method will find the perimeter of the Triangle. It should use the
     * sideLength
     * method three times to do this.
     * REMEMBER: You can call a method inside another method with just the name and
     * parentheses.
     * Hacker: Do N00b and Coder. Go to the driver. Before you make the Triangle
     * object, make
     * sure the given points actually make a Triangle.
     * HINT: Three points on a plane always make a Triangle except if the points are
     * colinear.
     * Use an if statement to check the slope three times with each combination of
     * points.
     * Check the Triangle x1 = 1, y1 = 1, x2 = 2, y2 = 2, x3 = 3, y3 = 3. This
     * Triangle should
     * give the user an error message. Check if slope1 == slope2 && slope2 ==
     * slope3.
     */
}