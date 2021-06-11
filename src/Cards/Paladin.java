package Cards;

public class Paladin extends Creature
{
    public Paladin()
    {
        this.setName("Paladin");
        this.setHealth(7);
        this.setStrength(6);
        this.setManaCost(7);
    }
    public void action()
    {
        System.out.println("Paladin does smth");
    }

    public void present()
    {
        System.out.println("Card: " + this.getName());
        System.out.println("HP: " + this.getHealth());
        System.out.println("Strength: " + this.getStrength());
        System.out.println("Mana cost: " + this.getManaCost());
    }
}
