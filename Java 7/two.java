import java.util.Scanner;

public class two {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String userInput = s.nextLine();
        for (int i = 0; i < userInput.length(); i++) {
            System.out.println(userInput.charAt(i));
        }
    }
}
