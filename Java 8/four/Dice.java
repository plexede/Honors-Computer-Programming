import java.util.Random;

public class Dice {
    int face;
    Random r = new Random();

    public void roll() {
        face = r.nextInt(1, 7);
    }

    public void displayRoll() {
        System.out.println("Your roll is: " + face);
    }
}