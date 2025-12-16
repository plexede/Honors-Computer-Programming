public class four {
    public static void main(String[] args) {
        int max = 10;
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i <= max; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");

                System.out.print("\t");
                int spaces = i - j; // distance between
                for (int k = 0; k <= spaces; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
