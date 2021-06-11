package Cards;

public class Paladin extends Creature
{
    public Paladin()
    {
        this.setHealth(7);
        this.setStrength(6);
        this.setManaCost(7);
    }
    public void action()
    {
        System.out.println("Paladin does smth");
    }
}
