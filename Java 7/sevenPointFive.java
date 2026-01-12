public class sevenPointFive {
    public static void main(String[] args) {
        long max = 1000;
        long cached = 0;
        {
            long x = 0;
            while (x < max) {
                x++;
                cached = cached + x;
                System.out.println(cached);
            }
        }
        cached = 0;
        for (int i = 1; i < max; i++) {
            cached = cached + i;
            System.out.println(cached);
        }
    }
}
