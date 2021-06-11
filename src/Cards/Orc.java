package Cards;

public class Orc extends Creature
{
    public Orc()
    {
        this.setName("Orc");
        this.setHealth(6);
        this.setStrength(7);
        this.setManaCost(6);
    }

    public void action()
    {
        System.out.println("Topory!!!");
    }

    public void present()
    {
        System.out.println("Card: " + this.getName());
        System.out.println("HP: " + this.getHealth());
        System.out.println("Strength: " + this.getStrength());
        System.out.println("Mana cost: " + this.getManaCost());
    }
}
