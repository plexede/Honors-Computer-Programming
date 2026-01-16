import java.util.Random;

public class PadLock {
    Random r = new Random();
    boolean lockState = true;
    int lockCombination = 100;

    void displayLock()
    {
        System.out.println(lockState ? "locked" : "unlocked");
        System.out.println(lockCombination);
    }
    void shuffleCombination() {
        lockCombination = r.nextInt(100, 1000);
    }
    void pickLock() {
        if (r.nextBoolean()) {
            System.out.println("Lock picked!");
            lockState = false;
        } else {
            System.out.println("Alarm!");
        }
    }
}