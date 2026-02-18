public class CreatureDriver {
    public static void main(String[] args) {
        Creature c1 = new Creature(5, "Hero");
        Creature c2 = new Creature(2, "Monster");
        System.out.println(c1);
        System.out.println(c2);
        c1.collidesWith(c2);
        System.out.println(c1);
        System.out.println(c2);
    }
}