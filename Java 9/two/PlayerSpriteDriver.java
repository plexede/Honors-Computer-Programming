public class PlayerSpriteDriver {
    public static void main(String[] args) {
        PlayerSprite player1 = new PlayerSprite("one", -2, 5);
        player1.move(1);
        player1.move(1);
        player1.move(2);
        player1.move(3);
        System.out.println(player1.getLocation());
    }
}