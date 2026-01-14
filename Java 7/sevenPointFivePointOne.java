import java.util.Scanner;

public class sevenPointFivePointOne {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        long cached = 0;

        System.out.println("bottom value:");
        long min = s.nextLong();
        System.out.println("top value:");
        long max = s.nextLong();
        System.out.println("jump:");
        long jump = s.nextLong();

        for (long i = min; i <= max;) {
            System.out.print(cached + " + " + i + " = ");
            cached = cached + i + jump;
            System.out.println(cached);
            i = i + jump;
        }
        s.close();
    }
}
