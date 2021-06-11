package Cards;

public class Elemental extends Creature
{
    public Elemental()
    {
        this.setHealth(5);
        this.setStrength(6);
        this.setManaCost(6);
    }

    public void action()
    {
        System.out.println("elemental does smth");
    }
}
