package Cards;

public class FireBall extends Spell
{
    public FireBall()
    {
        this.setName("Fireball");
        this.setManaCost(6);
    }

    public void action()
    {
        System.out.println("FireBall thrown");
    }

    public void present()
    {
        System.out.println("Card: " + this.getName());
        System.out.println("Mana cost: " + this.getManaCost());
    }
}
