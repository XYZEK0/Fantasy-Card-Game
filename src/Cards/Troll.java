package Cards;

public class Troll extends Creature
{
    public Troll()
    {
        this.setHealth(9);
        this.setStrength(8);
        this.setManaCost(9);
    }

    public void action()
    {
        System.out.println("le Problem?");
    }
}
