package Cards;

public class Orc extends Creature
{
    public Orc()
    {
        this.setHealth(6);
        this.setManaCost(6);
        this.setStrength(7);
    }

    public void action()
    {
        System.out.println("Topory!!!");
    }
}
