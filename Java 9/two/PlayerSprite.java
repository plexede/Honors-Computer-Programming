public class PlayerSprite {
    String spriteName;
    int spriteX;
    int spriteY;
    int speed;

    // name, starting x, starting y
    PlayerSprite(String name, int x, int y) {
        spriteName = name;
        spriteX = x;
        spriteY = y;
        speed = 3;
    }

    void move(int direction) {
        /*
         * The value 0 represents a right step, 1 represents
         * up, 2 is left, and 3 is down. Change the x or y
         * value by 1 based on this value.
         */

        switch (direction) {
            case 0: // right
                spriteX += 1 * speed;
                break;
            case 1: // up
                spriteY += -1 * speed;
                break;
            case 2: // left
                spriteX += -1 * speed;
                break;
            case 3: // down
                spriteY += 1 * speed;
                break;
            default:
                break;
        }
    }

    String getLocation() {
        return ("(" + spriteX + "," + spriteY + ")");
    }
}
