public class four {
    static int max = 10;

    public static void main(String[] args) {

        // first waterfall
        // for (int i = 0; i <= max; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        String slot1 = "*";
        String slot2 = " ";

        for (int medianBar = max; medianBar >= 0; medianBar--) {
            printSlots(slot1, slot2, medianBar);
            System.out.print("\t");
            printSlots(slot2, slot1, medianBar);
            System.out.println();
        }
    }

    static void printSlots(String slot1, String slot2, int medianBar) {
        for (int i = 0; i <= medianBar; i++) {
            System.out.print(slot1);
        }
        for (int i = 0; i <= max - medianBar; i++) {
            System.out.print(slot2);
        }
    }
}