import java.util.Scanner;

public class 1 {
    static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number between 1 and 5: ");
    int number = scanner.nextInt();
    if (number > 5) // 1
    { 
    System.out.println("Number is too large!");
    } else if (number < 1) { // 2
        System.out.println("Number is too small!");
    } else { // 3
        System.out.println("The number is just right!");
    }
}
}