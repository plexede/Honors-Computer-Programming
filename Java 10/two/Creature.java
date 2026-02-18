public class Creature {
    private int health;
    private String tag;

    public Creature(int health, String tag) {
        this.health = health;
        this.tag = tag;
    }

    public int isHit()
    {
        if(health <= 0)
            return -1;
        health -= 1;
        return health;
    }

    public String toString()
    {
        return "Creature tag: " + tag +
        "\nCreature health: " + health;
    }
    public void collidesWith(Creature otherCreature) {
        if (!otherCreature.tag.contentEquals(tag))
            isHit();
    }

}