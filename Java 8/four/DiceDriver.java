public class DiceDriver {
    public static void main(String args) {
        Dice die1 = new Dice();
        for (int i = 0; i <= 10; i++) {
            die1.roll();
            die1.displayRoll();
            System.out.println("**********************************");
        }
    }
}