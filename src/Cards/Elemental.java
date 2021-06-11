package Cards;

public class Elemental extends Creature
{
    public Elemental()
    {
        this.setName("Elemental");
        this.setHealth(5);
        this.setStrength(6);
        this.setManaCost(6);
    }

    public void action()
    {
        System.out.println("elemental does smth");
    }

    public void present()
    {
        System.out.println("Card: " + this.getName());
        System.out.println("HP: " + this.getHealth());
        System.out.println("Strength: " + this.getStrength());
        System.out.println("Mana cost: " + this.getManaCost());
    }
}
