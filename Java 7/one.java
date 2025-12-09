public class one {
    public static void main(String args[]) {
        for (int i = 0; i < 11; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int i = 0; i < 11; i++) {
            System.out.print(10 - i + "\t");
        }
        System.out.println("Blastoff!");
        for (int i = 0; i < 11; i++) {
            int output = (10 - i);
            // output = output * (output % 2);
            if ((output % 2) > 0)
                System.out.print(output + "\t");
        }
        System.out.println("Batf!");
    }

}
