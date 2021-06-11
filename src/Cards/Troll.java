package Cards;

public class Troll extends Creature
{
    public Troll()
    {
        this.setName("Troll");
        this.setHealth(9);
        this.setStrength(8);
        this.setManaCost(9);
    }

    public void action()
    {
        System.out.println("le Problem?");
    }

    public void present()
    {
        System.out.println("Card: " + this.getName());
        System.out.println("HP: " + this.getHealth());
        System.out.println("Strength: " + this.getStrength());
        System.out.println("Mana cost: " + this.getManaCost());
    }
}
