package Cards;

public class Vampire extends Creature
{
    public Vampire()
    {
        this.setName("Vampire");
        this.setHealth(4);
        this.setHealth(5);
        this.setManaCost(5);
    }

    public void action()
    {
        System.out.println("*Sucks your blood/dick*");
    }

    public void present()
    {
        System.out.println("Card: " + this.getName());
        System.out.println("HP: " + this.getHealth());
        System.out.println("Strength: " + this.getStrength());
        System.out.println("Mana cost: " + this.getManaCost());
    }
}
